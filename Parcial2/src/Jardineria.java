
import javax.swing.JOptionPane;

public class Jardineria {

    public static void main(String[] args) {
        double longitud = ingresarRealD("Ingrese la longitud de la superficie:");
        double ancho = ingresarRealD("Ingrese el ancho de la superficie:");

        double superficie = calcularSuperficie(longitud, ancho);

        generarMensajeSuperficie(longitud, ancho, superficie);
    }

    public static double ingresarRealD(String mensaje) {
        double valor = Double.parseDouble(
                JOptionPane.showInputDialog(mensaje)
        );
        return valor;
    }

    public static double calcularSuperficie(double longitud, double ancho) {
        double superficieCalculada = longitud * ancho;
        return superficieCalculada;
    }

    public static void generarMensajeSuperficie(
            double longitud, double ancho, double superficie) {

        String mensaje = "El valor de la longitud es: " + longitud
                + "\nEl valor del ancho es: " + ancho
                + "\nLa superficie es: " + superficie;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
