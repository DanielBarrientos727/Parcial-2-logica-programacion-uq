
import java.util.Scanner;

public class FashionTrends {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String genero = ingresarTexto("Ingrese el género (femenino/masculino): ");
        double presupuesto = ingresarRealD("Ingrese el presupuesto: ");
        String estacion = ingresarTexto("Ingrese la estación favorita: ");

        generarMensaje(genero, presupuesto, estacion);
    }

    public static String ingresarTexto(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    public static double ingresarRealD(String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    public static void generarMensaje(
            String genero, double presupuesto, String estacion) {

        String mensaje;

        if (genero.equalsIgnoreCase("femenino")
                && presupuesto > 150000
                && estacion.equalsIgnoreCase("verano")) {

            mensaje = "Se recomiendan vestidos y ropa ligera.";

        } else if (genero.equalsIgnoreCase("masculino")
                && presupuesto > 200000
                && estacion.equalsIgnoreCase("invierno")) {

            mensaje = "Se recomiendan chaquetas y prendas de abrigo.";

        } else {
            mensaje = "No hay una recomendación disponible para estos criterios.";
        }

        System.out.println(mensaje);
    }
}


