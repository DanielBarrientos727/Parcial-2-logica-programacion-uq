
import java.util.Scanner;

public class IndiceResistenciaFisica {

    static final double IRFMINIMO = 40.0;

    public static void main(String[] args) {

        double distancia = ingresarReal(
                "Ingrese la distancia recorrida en metros: "
        );

        double tiempo = ingresarReal(
                "Ingrese el tiempo de la prueba en segundos: "
        );

        double irf = calcularIRF(distancia, tiempo);

        generarMensaje(irf);
    }

    public static double ingresarReal(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        double valor = sc.nextDouble();
        return valor;
    }

    public static double calcularIRF(
            double distancia, double tiempo) {

        double irf = (distancia / tiempo) * 100;
        return irf;
    }

    public static void generarMensaje(double irf) {

        String mensaje = "Índice de Resistencia Física: " + irf;

        if (irf < IRFMINIMO) {
            mensaje = mensaje
                    + "\nSe recomienda un plan de acondicionamiento físico personalizado.";
        } else {
            mensaje = mensaje
                    + "\nEl estudiante cumple con el índice mínimo de resistencia física.";
        }

        System.out.println(mensaje);
    }
}
