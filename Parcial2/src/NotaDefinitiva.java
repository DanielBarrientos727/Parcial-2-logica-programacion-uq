
import java.util.Scanner;

public class NotaDefinitiva {

    public static void main(String[] args) {
        double nota1 = ingresarNota("Ingrese la nota 1: ");
        double nota2 = ingresarNota("Ingrese la nota 2: ");
        double nota3 = ingresarNota("Ingrese la nota 3: ");
        double nota4 = ingresarNota("Ingrese la nota 4: ");
        double nota5 = ingresarNota("Ingrese la nota 5: ");

        double definitiva = calcularDefinitiva(
                nota1, nota2, nota3, nota4, nota5
        );

        mostrarDefinitiva(definitiva);
    }

    public static double ingresarNota(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        double nota = sc.nextDouble();
        return nota;
    }

    public static double calcularDefinitiva(
            double n1, double n2, double n3, double n4, double n5) {
        return (n1 + n2 + n3 + n4 + n5) / 5;
    }

    public static void mostrarDefinitiva(double definitiva) {
        System.out.printf("La nota definitiva es: %.2f%n", definitiva);
    }
}
