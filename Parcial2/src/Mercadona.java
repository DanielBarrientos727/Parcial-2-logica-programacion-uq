
import java.util.Scanner;

public class Mercadona {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int cantidad = ingresarEntero("Ingrese la cantidad de productos: ");
        double compra = ingresarRealD("Ingrese el total de la compra: ");

        double descuento = calcularDescuento(cantidad, compra);
        double totalPagar = compra - descuento;

        generarMensaje(descuento, totalPagar);
    }

    public static int ingresarEntero(String mensaje) {
        System.out.print(mensaje);
        return sc.nextInt();
    }

    public static double ingresarRealD(String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    public static double calcularDescuento(int cantidad, double compra) {

        double descuento = 0;

        if (cantidad >= 5 && compra > 50000) {
            descuento = compra * 0.10;
        } else if (cantidad >= 3 && compra > 30000) {
            descuento = compra * 0.05;
        }

        return descuento;
    }

    public static void generarMensaje(double descuento, double totalPagar) {
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);
    }
}
