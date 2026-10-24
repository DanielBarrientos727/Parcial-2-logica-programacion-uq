
import java.util.Scanner;

public class SumaEnteros {

    public static void main(String[] args) {
        int num1 = ingresarEntero("Ingrese el primer numero: ");
        int num2 = ingresarEntero("Ingrese el segundo numero: ");

        int resultado = sumar(num1, num2);

        mostrarResultado(resultado);
    }

    public static int ingresarEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        int numero = sc.nextInt();
        return numero;
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static void mostrarResultado(int resultado) {
        System.out.println("La suma es: " + resultado);
    }
}
