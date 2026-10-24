
import java.util.Scanner;

public class Liquidacion {

    public static void main(String[] args) {
        double salario = ingresarReal("Ingrese el salario mensual: ");
        int diasLaborados = ingresarEntero("Ingrese los dias laborados: ");

        double prima = calcularPrima(salario, diasLaborados);
        double cesantias = calcularCesantias(salario, diasLaborados);
        double intereses = calcularIntereses(cesantias, diasLaborados);
        double vacaciones = calcularVacaciones(salario, diasLaborados);

        mostrarLiquidacion(prima, cesantias, intereses, vacaciones);
    }

    public static double ingresarReal(String mensaje) {
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

    public static double calcularPrima(double salario, int diasLaborados) {
        return (salario * diasLaborados) / 360;
    }

    public static double calcularCesantias(double salario, int diasLaborados) {
        return (salario * diasLaborados) / 360;
    }

    public static double calcularIntereses(double cesantias, int diasLaborados) {
        return cesantias * (0.12 * diasLaborados / 360);
    }

    public static double calcularVacaciones(double salario, int diasLaborados) {
        return (salario * diasLaborados) / 720;
    }

    public static void mostrarLiquidacion(
            double prima, double cesantias,
            double intereses, double vacaciones) {

        double total = prima + cesantias + intereses + vacaciones;

        System.out.println("\n--- LIQUIDACION LABORAL ---");
        System.out.printf("Prima: $%.2f%n", prima);
        System.out.printf("Cesantias: $%.2f%n", cesantias);
        System.out.printf("Intereses a las cesantias: $%.2f%n", intereses);
        System.out.printf("Vacaciones: $%.2f%n", vacaciones);
        System.out.printf("Total liquidacion: $%.2f%n", total);
    }
}
