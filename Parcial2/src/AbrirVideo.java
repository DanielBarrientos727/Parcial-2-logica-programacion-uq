
import java.awt.Desktop;
import java.net.URI;

public class AbrirVideo {

    public static void main(String[] args) throws Exception {
        URI direccion = new URI(
                "https://www.youtube.com/watch?v=VzmRGsy45vQ"
        );

        Desktop.getDesktop().browse(direccion);
    }
}
