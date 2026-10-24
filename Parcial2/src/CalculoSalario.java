
import java.util.Scanner;

public class CalculoSalario {

    static final double SALARIOMAXIMO = 3000000;

    public static void main(String[] args) {
        int horas = ingresarEntero(
                "Ingrese la cantidad de horas trabajadas: "
        );

        double valorHora = ingresarRealD(
                "Ingrese el valor de la hora: "
        );

        double salario = calcularSalario(horas, valorHora);
        double salarioFinal = determinarSalarioFinal(salario);

        generarMensajeSalario(salarioFinal);
    }

    public static int ingresarEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        int valor = sc.nextInt();
        return valor;
    }

    public static double ingresarRealD(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        double valor = sc.nextDouble();
        return valor;
    }

    public static double calcularSalario(int horas, double valorHora) {
        double sueldo = horas * valorHora;
        return sueldo;
    }

    // Ejemplo 2

    public static double determinarSalarioFinal(double salario) {
        double salarioFinal = 0.0;

        if (salario > SALARIOMAXIMO) {
            salarioFinal = SALARIOMAXIMO;
        } else {
            salarioFinal = salario;
        }

        return salarioFinal;
    }

    public static void generarMensajeSalario(double salarioFinal) {
        String mensaje = "El salario final es: $" + salarioFinal;
        System.out.println(mensaje);
    }
}
