
import javax.swing.JOptionPane;

public class ConsumoCombustible {

    public static void main(String[] args) {
        double kilometros = ingresarRealD(
                "Ingrese los kilometros recorridos:"
        );
        double litros = ingresarRealD(
                "Ingrese los litros de gasolina consumidos:"
        );
        double precioLitro = ingresarRealD(
                "Ingrese el precio por litro de gasolina:"
        );

        double rendimiento = calcularRendimiento(kilometros, litros);
        double costo = calcularCosto(litros, precioLitro);

        generarMensaje(kilometros, litros, rendimiento, costo);
    }

    public static double ingresarRealD(String mensaje) {
        double valor = Double.parseDouble(
                JOptionPane.showInputDialog(mensaje)
        );
        return valor;
    }

    public static double calcularRendimiento(
            double kilometros, double litros) {
        return kilometros / litros;
    }

    public static double calcularCosto(
            double litros, double precioLitro) {
        return litros * precioLitro;
    }

    public static void generarMensaje(
            double kilometros, double litros,
            double rendimiento, double costo) {

        String mensaje = "Kilometros recorridos: " + kilometros
                + "\nLitros consumidos: " + litros
                + "\nRendimiento: " + rendimiento + " km/l"
                + "\nCosto total del viaje: $" + costo;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
