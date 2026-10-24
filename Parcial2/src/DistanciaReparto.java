
import java.util.Scanner;

public class DistanciaReparto {

    static final double VELOCIDADMINIMA = 40.0;

    public static void main(String[] args) {

        double velocidad = ingresarReal(
                "Ingrese la velocidad promedio en km/h: "
        );

        double tiempo = ingresarReal(
                "Ingrese el tiempo en movimiento en horas: "
        );

        double distancia = calcularDistancia(velocidad, tiempo);

        generarMensaje(velocidad, distancia);
    }

    public static double ingresarReal(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        double valor = sc.nextDouble();
        return valor;
    }

    public static double calcularDistancia(
            double velocidad, double tiempo) {

        double distancia = velocidad * tiempo;
        return distancia;
    }

    public static void generarMensaje(
            double velocidad, double distancia) {

        String mensaje = "";

        if (velocidad > VELOCIDADMINIMA) {
            mensaje = "La distancia recorrida es: "
                    + distancia + " km.";
        } else {
            mensaje = "No se cumplió con la velocidad mínima requerida.";
        }

        System.out.println(mensaje);
    }
}
