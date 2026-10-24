
import javax.swing.JOptionPane;

public class DevueltaCompra {

    public static void main(String[] args) {
        double factura = ingresarRealD("Ingrese el valor de la factura:");
        double dinero = ingresarRealD("Ingrese el dinero entregado:");

        double devuelta = calcularDevuelta(factura, dinero);

        generarMensaje(factura, dinero, devuelta);
    }

    public static double ingresarRealD(String mensaje) {
        double valor = Double.parseDouble(
                JOptionPane.showInputDialog(mensaje)
        );
        return valor;
    }

    public static double calcularDevuelta(double factura, double dinero) {
        return dinero - factura;
    }

    public static void generarMensaje(
            double factura, double dinero, double devuelta) {

        String mensaje = "Valor de la factura: $" + factura
                + "\nDinero entregado: $" + dinero
                + "\nDevuelta: $" + devuelta;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
