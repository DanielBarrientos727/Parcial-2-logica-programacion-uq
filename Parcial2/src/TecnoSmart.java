
import java.util.Scanner;

public class TecnoSmart {

    public static void main(String[] args) {
        double precio = ingresarReal("Ingrese el precio original del producto: ");
        double descuento = ingresarReal("Ingrese el valor del descuento: ");

        double valorPagar = calcularPrecioFinal(precio, descuento);

        mostrarResultado(precio, descuento, valorPagar);
    }

    public static double ingresarReal(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        double valor = sc.nextDouble();
        return valor;
    }

    public static double calcularPrecioFinal(double precio, double descuento) {
        return precio - descuento;
    }

    public static void mostrarResultado(
            double precio, double descuento, double valorPagar) {

        System.out.println("\n--- TECNOSMART ---");
        System.out.println("El valor del producto es: " + precio);
        System.out.println("El valor del descuento es de: " + descuento);
        System.out.println("El valor a pagar es: " + valorPagar);
    }
}
