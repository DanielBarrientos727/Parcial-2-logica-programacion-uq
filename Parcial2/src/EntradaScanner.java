import java.util.Scanner;

public class EntradaScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
    }
}