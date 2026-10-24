
import javax.swing.*;
import java.net.URL;

public class ImagenWeb {

    public static void main(String[] args) throws Exception {
        URL url = new URL(
                "https://upload.wikimedia.org/wikipedia/commons/3/3f/Fronalpstock_big.jpg"
        );

        ImageIcon imagen = new ImageIcon(url);

        JFrame ventana = new JFrame("Imagen desde Internet");
        ventana.add(new JLabel(imagen));
        ventana.pack();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
