
import java.util.Scanner;

public class CalcularPrecio {

    public static void main(String[] args) {
        double valorP = ingresarRealD("Ingrese el valor del producto: ");
        double valorD = ingresarRealD("Ingrese el valor del descuento: ");

        double precioTotal = calcularPrecio(valorP, valorD);

        generarMensajeProducto(valorP, valorD, precioTotal);
    }

    public static double ingresarRealD(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public static double calcularPrecio(double valorP, double valorD) {
        double precio = valorP - valorD;
        return precio;
    }

    public static void generarMensajeProducto(
            double valorP, double valorD, double precioTotal) {

        String mensaje = "El valor del producto es: " + valorP
                + ", el valor del descuento es: " + valorD
                + ", el valor a pagar es: " + precioTotal;

        System.out.println(mensaje);
    }
}
