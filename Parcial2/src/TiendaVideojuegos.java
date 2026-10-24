
import java.util.Scanner;

public class TiendaVideojuegos {

    static final double DESCUENTO = 0.15;

    public static void main(String[] args) {

        int mes = ingresarEntero(
                "Ingrese el mes de compra (1-12): "
        );

        double valorCompra = ingresarReal(
                "Ingrese el valor total de la compra: "
        );

        double precioFinal = calcularPrecio(mes, valorCompra);

        generarMensaje(precioFinal);
    }

    public static int ingresarEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        int valor = sc.nextInt();
        return valor;
    }

    public static double ingresarReal(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        double valor = sc.nextDouble();
        return valor;
    }

    public static double calcularPrecio(int mes, double valorCompra) {

        double precioFinal = valorCompra;

        if (mes == 10) {
            precioFinal = valorCompra - (valorCompra * DESCUENTO);
        }

        return precioFinal;
    }

    public static void generarMensaje(double precioFinal) {

        String mensaje = "El precio final de la compra es: $"
                + precioFinal;

        System.out.println(mensaje);
    }
}
