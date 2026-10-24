
import java.util.Scanner;

public class Transporteswitch {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = ingresarEntero(
                "Ingrese el tipo de servicio:\n"
                        + "1. Bus urbano\n"
                        + "2. Bus intermunicipal\n"
                        + "3. Servicio especial\n"
                        + "4. Taxi compartido\n"
                        + "Opción: "
        );

        double kilometros = ingresarRealD(
                "Ingrese la cantidad de kilómetros recorridos: "
        );

        String tipoServicio = "";
        double valorPorKilometro = 0;
        boolean opcionValida = true;

        switch (opcion) {
            case 1:
                tipoServicio = "Bus urbano";
                valorPorKilometro = 1200;
                break;

            case 2:
                tipoServicio = "Bus intermunicipal";
                valorPorKilometro = 1800;
                break;

            case 3:
                tipoServicio = "Servicio especial";
                valorPorKilometro = 2500;
                break;

            case 4:
                tipoServicio = "Taxi compartido";
                valorPorKilometro = 3000;
                break;

            default:
                opcionValida = false;
                System.out.println("La opción ingresada no es válida");
        }

        if (opcionValida) {
            double total = calcularValorTotal(
                    kilometros, valorPorKilometro
            );

            generarMensaje(
                    tipoServicio, kilometros, valorPorKilometro, total
            );
        }
    }

    public static int ingresarEntero(String mensaje) {
        System.out.print(mensaje);
        return sc.nextInt();
    }

    public static double ingresarRealD(String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    public static double calcularValorTotal(
            double kilometros, double valorPorKilometro) {

        double total = kilometros * valorPorKilometro;
        return total;
    }

    public static void generarMensaje(
            String tipoServicio, double kilometros,
            double valorPorKilometro, double total) {

        String mensaje = "\nTipo de servicio: " + tipoServicio
                + "\nKilómetros recorridos: " + kilometros
                + "\nValor por kilómetro: $" + valorPorKilometro
                + "\nValor total a pagar: $" + total;

        System.out.println(mensaje);
    }
}
