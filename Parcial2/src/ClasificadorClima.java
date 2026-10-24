
import java.util.Scanner;

public class ClasificadorClima {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double temperatura = ingresarRealD("Ingrese la temperatura en Celsius: ");
        sc.nextLine();

        String cielo = ingresarTexto("Ingrese el estado del cielo (soleado, nublado, lluvioso): ");

        String descripcion = determinarClima(temperatura, cielo);

        generarMensaje(descripcion);
    }

    public static double ingresarRealD(String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    public static String ingresarTexto(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    public static String determinarClima(double temperatura, String cielo) {

        String descripcion;

        if (temperatura > 30 && cielo.equalsIgnoreCase("soleado")) {
            descripcion = "Caluroso y soleado.";
        } else if (temperatura < 10
                && (cielo.equalsIgnoreCase("nublado")
                || cielo.equalsIgnoreCase("lluvioso"))) {
            descripcion = "Frío y nublado/lluvioso.";
        } else if (temperatura >= 10 && temperatura <= 30
                && cielo.equalsIgnoreCase("soleado")) {
            descripcion = "Agradable y soleado.";
        } else {
            descripcion = "Clima variable.";
        }

        return descripcion;
    }

    public static void generarMensaje(String descripcion) {
        System.out.println(descripcion);
    }
}
