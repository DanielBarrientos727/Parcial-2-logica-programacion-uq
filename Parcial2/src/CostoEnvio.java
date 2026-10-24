
import javax.swing.JOptionPane;

public class CostoEnvio {

    public static void main(String[] args) {
        double peso = ingresarRealD(
                "Ingrese el peso del paquete en kilogramos:"
        );
        double costoKg = ingresarRealD(
                "Ingrese el costo por kilogramo:"
        );
        double costoFijo = ingresarRealD(
                "Ingrese el costo fijo del servicio:"
        );

        double costoPeso = calcularCostoPeso(peso, costoKg);
        double total = calcularTotal(costoPeso, costoFijo);

        generarMensaje(peso, costoPeso, costoFijo, total);
    }

    public static double ingresarRealD(String mensaje) {
        double valor = Double.parseDouble(
                JOptionPane.showInputDialog(mensaje)
        );
        return valor;
    }

    public static double calcularCostoPeso(
            double peso, double costoKg) {
        return peso * costoKg;
    }

    public static double calcularTotal(
            double costoPeso, double costoFijo) {
        return costoPeso + costoFijo;
    }

    public static void generarMensaje(
            double peso, double costoPeso,
            double costoFijo, double total) {

        String mensaje = "Peso del paquete: " + peso + " kg"
                + "\nCosto por peso: $" + costoPeso
                + "\nCosto fijo del servicio: $" + costoFijo
                + "\nValor total a pagar: $" + total;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
