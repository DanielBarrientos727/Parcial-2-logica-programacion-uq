
import java.util.Scanner;

public class BibliotecaLecturaExtendida {

    static final int MAXLIBROSESTANTERIA = 25;

    public static void main(String[] args) {

        int libros = ingresarEntero(
                "Ingrese la cantidad de libros de la colección: "
        );

        int librosAdicionales = ingresarEntero(
                "Ingrese la cantidad de libros que se agregarán en el futuro: "
        );

        int estanterias = calcularEstanterias(libros);
        int estanteriasFuturas = calcularEstanterias(
                libros + librosAdicionales
        );

        generarMensaje(estanterias, estanteriasFuturas);
    }

    public static int ingresarEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        int valor = sc.nextInt();
        return valor;
    }

    public static int calcularEstanterias(int libros) {
        int cantidad = libros / MAXLIBROSESTANTERIA;

        if (libros % MAXLIBROSESTANTERIA != 0) {
            cantidad = cantidad + 1;
        }

        return cantidad;
    }

    public static void generarMensaje(
            int estanterias, int estanteriasFuturas) {

        int espacioAdicional = estanteriasFuturas - estanterias;

        String mensaje = "Estanterías necesarias actualmente: "
                + estanterias
                + "\nEstanterías necesarias en el futuro: "
                + estanteriasFuturas
                + "\nEstanterías adicionales necesarias: "
                + espacioAdicional;

        System.out.println(mensaje);
    }
}
