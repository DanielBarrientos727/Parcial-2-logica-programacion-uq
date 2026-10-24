
import java.util.Scanner;

public class MatematicaBrillante {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int grado = ingresarEntero("Ingrese el grado escolar (1-6): ");
        int puntaje = ingresarEntero("Ingrese el puntaje de habilidad (1-5): ");

        String clasificacion = determinarGrupo(grado, puntaje);

        generarMensaje(clasificacion);
    }

    public static int ingresarEntero(String mensaje) {
        System.out.print(mensaje);
        return sc.nextInt();
    }

    public static String determinarGrupo(int grado, int puntaje) {

        String grupo = "Estudiante no clasificado";

        if (grado >= 1 && grado <= 6 && puntaje >= 1 && puntaje <= 5) {

            if (grado <= 2) {
                if (puntaje >= 3) {
                    grupo = "Grupo de Primaria - Grupo A";
                } else {
                    grupo = "Grupo de Primaria - Grupo B";
                }

            } else if (grado <= 4) {
                if (puntaje >= 4) {
                    grupo = "Grupo de Grado Intermedio - Grupo A";
                } else {
                    grupo = "Grupo de Grado Intermedio - Grupo B";
                }

            } else {
                if (puntaje == 5) {
                    grupo = "Grupo de Secundaria - Grupo A";
                } else {
                    grupo = "Grupo de Secundaria - Grupo B";
                }
            }
        }

        return grupo;
    }

    public static void generarMensaje(String clasificacion) {
        System.out.println("Clasificación: " + clasificacion);
    }
}
