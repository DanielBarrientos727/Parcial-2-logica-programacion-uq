
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class GlxGears extends JPanel {

    private double angulo = 0;
    private double velocidad = 0.025;
    private boolean pausado = false;

    private final Timer reloj;

    public GlxGears() {
        setBackground(Color.BLACK);

        reloj = new Timer(16, e -> {
            if (!pausado) {
                angulo += velocidad;
                repaint();
            }
        });

        reloj.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g.create();

        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );

        g2.setRenderingHint(
                RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY
        );

        int centroY = getHeight() / 2 - 10;
        int centroX = getWidth() / 2;

        int radioGrande = Math.min(125, getHeight() / 3);
        int dientesGrandes = 16;
        int dientesPequenos = 10;

        int radioPequeno = radioGrande * 5 / 8;

        // Distancia aproximada entre los centros de los engranajes.
        int distancia = radioGrande + radioPequeno - 8;

        int xGrande = centroX - distancia / 2;
        int xPequeno = centroX + distancia / 2;

        dibujarEngranaje(
                g2, xGrande, centroY, radioGrande,
                dientesGrandes, angulo, new Color(35, 115, 255)
        );

        // Los engranajes giran en sentidos opuestos.
        double anguloPequeno =
                -angulo * dientesGrandes / dientesPequenos;

        dibujarEngranaje(
                g2, xPequeno, centroY, radioPequeno,
                dientesPequenos, anguloPequeno,
                new Color(240, 48, 48)
        );

        g2.setColor(new Color(190, 195, 205));
        g2.setFont(new Font("SansSerif", Font.PLAIN, 14));
        g2.drawString("GLXGEARS - JAVA 2D", 18, 25);

        g2.setColor(Color.LIGHT_GRAY);
        g2.drawString(
                pausado ? "PAUSADO" : "ENGRANAJES GIRANDO",
                18, getHeight() - 18
        );

        g2.dispose();
    }

    public static void dibujarEngranaje(
            Graphics2D g2,
            int x, int y,
            int radio,
            int dientes,
            double angulo,
            Color color
    ) {

        Graphics2D g = (Graphics2D) g2.create();

        g.translate(x, y);
        g.rotate(angulo);

        double radioExterior = radio;
        double radioInterior = radio * 0.79;
        double paso = Math.PI * 2 / dientes;

        Path2D forma = new Path2D.Double();

        for (int i = 0; i < dientes; i++) {

            double base = i * paso;

            double[] fracciones = {
                    -0.50, -0.34, -0.29, 0.29,
                    0.34,  0.50
            };

            double[] radios = {
                    radioInterior, radioInterior,
                    radioExterior, radioExterior,
                    radioInterior, radioInterior
            };

            for (int j = 0; j < fracciones.length; j++) {

                double a = base + fracciones[j] * paso;
                double px = Math.cos(a) * radios[j];
                double py = Math.sin(a) * radios[j];

                if (i == 0 && j == 0) {
                    forma.moveTo(px, py);
                } else {
                    forma.lineTo(px, py);
                }
            }
        }

        forma.closePath();

        // Cuerpo metálico con degradado.
        g.setPaint(new GradientPaint(
                (float) -radio, (float) -radio,
                color.brighter(),
                (float) radio, (float) radio,
                color.darker()
        ));

        g.fill(forma);

        g.setColor(color.brighter());
        g.setStroke(new BasicStroke(2f));
        g.draw(forma);

        // Anillo central.
        double radioAnillo = radio * 0.36;

        g.setColor(color.darker());
        g.fill(new Ellipse2D.Double(
                -radioAnillo, -radioAnillo,
                radioAnillo * 2, radioAnillo * 2
        ));

        g.setColor(color.brighter());
        g.draw(new Ellipse2D.Double(
                -radioAnillo, -radioAnillo,
                radioAnillo * 2, radioAnillo * 2
        ));

        // Eje central.
        double radioEje = radio * 0.17;

        g.setPaint(new GradientPaint(
                (float) -radioEje, (float) -radioEje,
                new Color(235, 240, 245),
                (float) radioEje, (float) radioEje,
                new Color(90, 100, 115)
        ));

        g.fill(new Ellipse2D.Double(
                -radioEje, -radioEje,
                radioEje * 2, radioEje * 2
        ));

        g.setColor(new Color(220, 225, 235));
        g.draw(new Ellipse2D.Double(
                -radioEje, -radioEje,
                radioEje * 2, radioEje * 2
        ));

        g.dispose();
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            GlxGears panel = new GlxGears();

            JFrame ventana = new JFrame("GlxGears - Java Swing");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(800, 520);
            ventana.setMinimumSize(new Dimension(500, 380));
            ventana.setLocationRelativeTo(null);

            JButton pausa = new JButton("Pausar");
            JSlider velocidad = new JSlider(1, 100, 25);

            pausa.addActionListener(e -> {
                panel.pausado = !panel.pausado;

                pausa.setText(
                        panel.pausado ? "Reanudar" : "Pausar"
                );
            });

            velocidad.addChangeListener(e -> {
                panel.velocidad =
                        velocidad.getValue() / 1000.0;
            });

            JPanel controles = new JPanel(new FlowLayout());
            controles.add(pausa);
            controles.add(new JLabel("Velocidad:"));
            controles.add(velocidad);

            ventana.add(panel, BorderLayout.CENTER);
            ventana.add(controles, BorderLayout.SOUTH);
            ventana.setVisible(true);
        });
    }
}
