
import java.util.Scanner;

public class ClasificarNumero {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double numero = ingresarRealD("Ingrese un número: ");

        generarMensaje(numero);
    }

    public static double ingresarRealD(String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    public static void generarMensaje(double numero) {

        String mensaje;

        if (numero > 0) {
            if (numero > 100) {
                mensaje = "El número es positivo y mayor que 100.";
            } else {
                mensaje = "El número es positivo, pero no mayor que 100.";
            }
        } else if (numero < 0) {
            mensaje = "El número es negativo.";
        } else {
            mensaje = "El número es cero.";
        }

        System.out.println(mensaje);
    }
}



