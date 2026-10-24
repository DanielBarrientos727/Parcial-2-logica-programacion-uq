
import javax.swing.*;
import java.awt.*;

public class PelotaAnimada extends JPanel {

    private int x = 50;
    private int y = 50;
    private int velocidadX = 4;
    private int velocidadY = 3;

    public PelotaAnimada() {

        setBackground(Color.BLACK);

        Timer temporizador = new Timer(16, evento -> {

            x += velocidadX;
            y += velocidadY;

            if (x <= 0 || x >= getWidth() - 30) {
                velocidadX = -velocidadX;
            }

            if (y <= 0 || y >= getHeight() - 30) {
                velocidadY = -velocidadY;
            }

            repaint();
        });

        temporizador.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.CYAN);
        g.fillOval(x, y, 30, 30);
    }

    public static void main(String[] args) {

        JFrame ventana = new JFrame("Pelota animada");
        ventana.add(new PelotaAnimada());

        ventana.setSize(600, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
