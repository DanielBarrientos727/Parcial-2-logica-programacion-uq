
import javax.swing.JOptionPane;

public class DescuentoCellStore {

    public static void main(String[] args) {
        double precio = ingresarRealD("Ingrese el precio del producto:");
        double porcentaje = ingresarRealD(
                "Ingrese el porcentaje de descuento (entre 0.0 y 1.0):"
        );

        double descuento = calcularDescuento(precio, porcentaje);
        double precioFinal = calcularPrecioFinal(precio, descuento);

        generarMensaje(precio, porcentaje, descuento, precioFinal);
    }

    public static double ingresarRealD(String mensaje) {
        double valor = Double.parseDouble(
                JOptionPane.showInputDialog(mensaje)
        );
        return valor;
    }

    public static double calcularDescuento(
            double precio, double porcentaje) {
        return precio * porcentaje;
    }

    public static double calcularPrecioFinal(
            double precio, double descuento) {
        return precio - descuento;
    }

    public static void generarMensaje(
            double precio, double porcentaje,
            double descuento, double precioFinal) {

        String mensaje = "Precio original: $" + precio
                + "\nPorcentaje de descuento: " + (porcentaje * 100) + "%"
                + "\nValor del descuento: $" + descuento
                + "\nPrecio final: $" + precioFinal;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
