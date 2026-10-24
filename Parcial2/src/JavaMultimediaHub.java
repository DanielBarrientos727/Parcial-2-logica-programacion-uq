
import javax.swing.*;
import javax.sound.sampled.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.net.URI;
import java.awt.Desktop;
import java.io.IOException;

public class JavaMultimediaHub {

    private static JFrame ventana;
    private static JLabel vistaImagen;
    private static JLabel estado;
    private static Clip reproductor;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> crearVentana());
    }

    public static void crearVentana() {

        ventana = new JFrame("Java Multimedia Hub");
        ventana.setSize(750, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JPanel principal = new JPanel(new BorderLayout(12, 12));
        principal.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel titulo = new JLabel(
                "JAVA MULTIMEDIA HUB",
                SwingConstants.CENTER
        );
        titulo.setFont(new Font("SansSerif", Font.BOLD, 24));

        JLabel subtitulo = new JLabel(
                "Imágenes · Audio · Vídeo web",
                SwingConstants.CENTER
        );

        JPanel encabezado = new JPanel(new GridLayout(2, 1, 3, 3));
        encabezado.add(titulo);
        encabezado.add(subtitulo);

        principal.add(encabezado, BorderLayout.NORTH);

        JTabbedPane pestanas = new JTabbedPane();

        pestanas.addTab("Imágenes", crearPanelImagenes());
        pestanas.addTab("Audio", crearPanelAudio());
        pestanas.addTab("Vídeo", crearPanelVideo());

        principal.add(pestanas, BorderLayout.CENTER);

        estado = new JLabel("Listo. Selecciona una función.");
        principal.add(estado, BorderLayout.SOUTH);

        ventana.setContentPane(principal);
        ventana.setVisible(true);
    }

    public static JPanel crearPanelImagenes() {

        JPanel panel = new JPanel(new BorderLayout(10, 10));

        JTextField direccionImagen = new JTextField(
                "https://upload.wikimedia.org/wikipedia/commons/3/3f/Fronalpstock_big.jpg"
        );

        JButton botonCargar = new JButton("Cargar imagen");

        JPanel superior = new JPanel(new BorderLayout(5, 5));
        superior.add(new JLabel("URL de la imagen:"), BorderLayout.NORTH);
        superior.add(direccionImagen, BorderLayout.CENTER);
        superior.add(botonCargar, BorderLayout.EAST);

        vistaImagen = new JLabel(
                "La imagen aparecerá aquí",
                SwingConstants.CENTER
        );

        vistaImagen.setPreferredSize(new Dimension(600, 350));

        JScrollPane desplazamiento = new JScrollPane(vistaImagen);

        panel.add(superior, BorderLayout.NORTH);
        panel.add(desplazamiento, BorderLayout.CENTER);

        botonCargar.addActionListener(e -> {

            String direccion = direccionImagen.getText().trim();

            botonCargar.setEnabled(false);
            estado.setText("Cargando imagen...");

            new SwingWorker<BufferedImage, Void>() {

                protected BufferedImage doInBackground()
                        throws Exception {

                    URL url = URI.create(direccion).toURL();
                    return javax.imageio.ImageIO.read(url);
                }

                protected void done() {
                    try {
                        BufferedImage imagen = get();

                        if (imagen == null) {
                            throw new IOException(
                                    "El archivo no es una imagen compatible."
                            );
                        }

                        int ancho = imagen.getWidth();
                        int alto = imagen.getHeight();

                        double escala = Math.min(
                                600.0 / ancho,
                                350.0 / alto
                        );

                        int nuevoAncho = Math.max(
                                1, (int) (ancho * escala)
                        );
                        int nuevoAlto = Math.max(
                                1, (int) (alto * escala)
                        );

                        Image redimensionada = imagen.getScaledInstance(
                                nuevoAncho,
                                nuevoAlto,
                                Image.SCALE_SMOOTH
                        );

                        vistaImagen.setText("");
                        vistaImagen.setIcon(new ImageIcon(redimensionada));

                        estado.setText("Imagen cargada correctamente.");

                    } catch (Exception ex) {
                        mostrarError("No se pudo cargar la imagen.");
                    } finally {
                        botonCargar.setEnabled(true);
                    }
                }
            }.execute();
        });

        return panel;
    }

    public static JPanel crearPanelAudio() {

        JPanel panel = new JPanel(new GridLayout(5, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 20, 30, 20));

        JLabel descripcion = new JLabel(
                "<html>Introduce una URL directa a un archivo WAV " +
                        "compatible.<br>El formato MP3 no está garantizado.</html>"
        );

        JTextField direccionAudio = new JTextField();

        JButton botonReproducir = new JButton("Reproducir audio");
        JButton botonDetener = new JButton("Detener audio");

        panel.add(descripcion);
        panel.add(new JLabel("URL del archivo WAV:"));
        panel.add(direccionAudio);
        panel.add(botonReproducir);
        panel.add(botonDetener);

        botonReproducir.addActionListener(e -> {

            String direccion = direccionAudio.getText().trim();

            if (direccion.isEmpty()) {
                mostrarError("Introduce la URL del archivo WAV.");
                return;
            }

            botonReproducir.setEnabled(false);
            estado.setText("Cargando audio...");

            new SwingWorker<Clip, Void>() {

                protected Clip doInBackground() throws Exception {

                    URL url = URI.create(direccion).toURL();

                    try (AudioInputStream audio =
                                 AudioSystem.getAudioInputStream(url)) {

                        Clip clip = AudioSystem.getClip();
                        clip.open(audio);
                        return clip;
                    }
                }

                protected void done() {
                    try {
                        Clip nuevoReproductor = get();

                        detenerReproductor();
                        reproductor = nuevoReproductor;

                        reproductor.start();
                        estado.setText("Reproduciendo audio.");

                    } catch (Exception ex) {
                        mostrarError(
                                "No se pudo reproducir. Comprueba la URL, " +
                                        "el formato WAV y la conexión."
                        );
                    } finally {
                        botonReproducir.setEnabled(true);
                    }
                }
            }.execute();
        });

        botonDetener.addActionListener(e -> {
            detenerReproductor();
            estado.setText("Audio detenido.");
        });

        return panel;
    }

    public static JPanel crearPanelVideo() {

        JPanel panel = new JPanel(new GridLayout(5, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 20, 30, 20));

        JLabel descripcion = new JLabel(
                "<html>Abre vídeos de YouTube u otras páginas " +
                        "en tu navegador predeterminado.</html>"
        );

        JTextField direccionVideo = new JTextField(
                "https://www.youtube.com/"
        );

        JButton botonAbrir = new JButton("Abrir vídeo en el navegador");

        panel.add(descripcion);
        panel.add(new JLabel("URL del vídeo o página:"));
        panel.add(direccionVideo);
        panel.add(botonAbrir);
        panel.add(new JLabel(
                "La reproducción ocurre fuera de esta ventana."
        ));

        botonAbrir.addActionListener(e -> {

            try {
                URI direccion = URI.create(
                        direccionVideo.getText().trim()
                );

                if (!direccion.getScheme().equalsIgnoreCase("https")
                        && !direccion.getScheme().equalsIgnoreCase("http")) {
                    throw new IllegalArgumentException(
                            "La dirección debe comenzar por HTTP o HTTPS."
                    );
                }

                if (!Desktop.isDesktopSupported()
                        || !Desktop.getDesktop().isSupported(
                        Desktop.Action.BROWSE)) {
                    throw new UnsupportedOperationException(
                            "No se puede abrir el navegador."
                    );
                }

                Desktop.getDesktop().browse(direccion);
                estado.setText("Vídeo abierto en el navegador.");

            } catch (Exception ex) {
                mostrarError("No se pudo abrir la dirección del vídeo.");
            }
        });

        return panel;
    }

    public static void detenerReproductor() {

        if (reproductor != null) {
            reproductor.stop();
            reproductor.close();
            reproductor = null;
        }
    }

    public static void mostrarError(String mensaje) {

        estado.setText("Se produjo un error.");

        JOptionPane.showMessageDialog(
                ventana,
                mensaje,
                "Error multimedia",
                JOptionPane.ERROR_MESSAGE
        );
    }
}
