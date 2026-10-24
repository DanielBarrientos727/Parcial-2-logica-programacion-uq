
import java.util.Scanner;

public class ServicioAgua {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double consumo = ingresarRealD("Ingrese el consumo en m3: ");
        double valorActual = ingresarRealD("Ingrese el valor actual del servicio: ");

        double valorNuevo = calcularValorNuevo(consumo, valorActual);

        generarMensaje(valorNuevo);
    }

    public static double ingresarRealD(String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    public static double calcularValorNuevo(double consumo, double valorActual) {

        double porcentaje = 0;

        if (consumo >= 1 && consumo <= 9) {
            porcentaje = 0.15;
        } else if (consumo >= 13 && consumo <= 15) {
            porcentaje = 0.15;
        } else if (consumo >= 20 && consumo <= 28) {
            porcentaje = 0.25;
        }

        return valorActual + (valorActual * porcentaje);
    }

    public static void generarMensaje(double valorNuevo) {
        System.out.println("Nuevo valor a pagar: $" + valorNuevo);
    }
}
