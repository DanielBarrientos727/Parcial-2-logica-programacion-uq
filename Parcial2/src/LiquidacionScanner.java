
import java.util.Scanner;

public class LiquidacionScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el salario mensual: ");
        double salario = sc.nextDouble();

        System.out.print("Ingrese los dias laborados: ");
        int diasLaborados = sc.nextInt();

        if (salario <= 0 || diasLaborados <= 0) {
            System.out.println("El salario y los dias deben ser mayores que cero.");
        } else {
            double prima = (salario * diasLaborados) / 360;
            double cesantias = (salario * diasLaborados) / 360;
            double interesesCesantias =
                    cesantias * (0.12 * diasLaborados / 360);
            double vacaciones = (salario * diasLaborados) / 720;

            double total = prima + cesantias
                    + interesesCesantias + vacaciones;

            System.out.println("\n--- LIQUIDACION LABORAL ---");
            System.out.printf("Prima: $%.2f%n", prima);
            System.out.printf("Cesantias: $%.2f%n", cesantias);
            System.out.printf("Intereses a las cesantias: $%.2f%n",
                    interesesCesantias);
            System.out.printf("Vacaciones: $%.2f%n", vacaciones);
            System.out.printf("Total liquidacion: $%.2f%n", total);
        }

        sc.close();
    }
}
