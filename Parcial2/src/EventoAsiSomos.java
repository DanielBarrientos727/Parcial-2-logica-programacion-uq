import java.util.Scanner;

public class EventoAsiSomos {

    static final int MAYORIAEDAD = 18;

    public static void main(String[] args) {

        int edad = ingresarEntero(
                "Ingrese la edad de la persona: "
        );

        generarMensaje(edad);
    }

    public static int ingresarEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        int valor = sc.nextInt();
        return valor;
    }

    public static void generarMensaje(int edad) {

        String mensaje = "";

        if (edad >= MAYORIAEDAD) {
            mensaje = "Cumple con los requisitos para ingresar al evento.";
        } else {
            mensaje = "No cumple con los requisitos para ingresar al evento.";
        }

        System.out.println(mensaje);
    }
}
