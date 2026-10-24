import java.util.Scanner;

public class SumaScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double num2 = sc.nextDouble();

        double suma = num1 + num2;

        System.out.println("La suma es: " + suma);

        sc.close();
    }
}
