
import java.util.Scanner;

public class ConvertirMoneda {

    public static void main(String[] args) {

        double cantidad = ingresarReal(
                "Ingrese la cantidad de dinero extranjero: "
        );

        double tipoCambio = ingresarReal(
                "Ingrese el tipo de cambio actual: "
        );

        double conversion = calcularConversion(cantidad, tipoCambio);

        generarMensaje(cantidad, conversion);
    }

    public static double ingresarReal(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        double valor = sc.nextDouble();
        return valor;
    }

    public static double calcularConversion(
            double cantidad, double tipoCambio) {

        double resultado = 0;

        if (cantidad > 0) {
            resultado = cantidad * tipoCambio;
        }

        return resultado;
    }

    public static void generarMensaje(
            double cantidad, double conversion) {

        String mensaje = "";

        if (cantidad > 0) {
            mensaje = "El valor convertido a moneda local es: "
                    + conversion;
        } else {
            mensaje = "Error: la cantidad de dinero debe ser positiva.";
        }

        System.out.println(mensaje);
    }
}
