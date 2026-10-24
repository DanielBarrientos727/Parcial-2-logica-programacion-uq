
import java.util.Scanner;

public class Reutilizacion {

    public static void main(String[] args) {

    }

    public static String ingresarTexto(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        String texto = sc.nextLine();
        return texto;
    }

    public static double ingresarRealD(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        double valor = sc.nextDouble();
        return valor;
    }

    public static int ingresarEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        int valor = sc.nextInt();
        return valor;
    }

    public static float ingresarRealF(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        float valor = sc.nextFloat();
        return valor;
    }

    public static boolean ingresarBoolean(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        boolean respuesta = scanner.nextBoolean();
        return respuesta;
    }

    public static int ingresarEnteroRango(
            String mensaje, int valorMinimo, int valorMaximo) {

        boolean repetir = true;
        int valor = 0;

        while (repetir) {
            valor = Reutilizacion.ingresarEntero(mensaje);

            if (valor < valorMinimo || valor > valorMaximo) {
                System.out.println("El valor no está entre "
                        + valorMinimo + " y " + valorMaximo);
            } else {
                repetir = false;
            }
        }

        return valor;
    }

    public static int ingresarEnteroMayorQue(
            String mensaje, int valorMinimo) {

        boolean repetir = true;
        int valor = 0;

        while (repetir) {
            valor = Reutilizacion.ingresarEntero(mensaje);

            if (valor <= valorMinimo) {
                System.out.println("El valor no es mayor que "
                        + valorMinimo);
            } else {
                repetir = false;
            }
        }

        return valor;
    }

    public static double ingresarRealMayorQue(
            String mensaje, double valorMinimo) {

        boolean repetir = true;
        double valor = 0.0;

        while (repetir) {
            valor = Reutilizacion.ingresarRealD(mensaje);

            if (valor <= valorMinimo) {
                System.out.println("El valor no es mayor que "
                        + valorMinimo);
            } else {
                repetir = false;
            }
        }

        return valor;
    }

    public static double ingresarRealRango(
            String mensaje, double valorMinimo, double valorMaximo) {

        boolean repetir = true;
        double valor = 0.0;

        while (repetir) {
            valor = Reutilizacion.ingresarRealD(mensaje);

            if (valor < valorMinimo || valor > valorMaximo) {
                System.out.println("El valor no está entre "
                        + valorMinimo + " y " + valorMaximo);
            } else {
                repetir = false;
            }
        }

        return valor;
    }
}
