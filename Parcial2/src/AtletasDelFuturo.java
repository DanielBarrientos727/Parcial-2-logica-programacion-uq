
import java.util.Scanner;

public class AtletasDelFuturo {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String nombre = ingresarTexto("Ingrese el nombre del estudiante: ");
        int edad = ingresarEntero("Ingrese la edad: ");
        double tiempo = ingresarRealD("Ingrese el tiempo en 100 metros (segundos): ");
        int abdominales = ingresarEntero("Ingrese la cantidad de abdominales: ");
        int flexiones = ingresarEntero("Ingrese la cantidad de flexiones: ");

        int puntosCarrera = calcularPuntosCarrera(tiempo);
        int puntosAbdominales = calcularPuntosAbdominales(abdominales);
        int puntosFlexiones = calcularPuntosFlexiones(flexiones);

        int puntajeTotal = puntosCarrera + puntosAbdominales + puntosFlexiones;

        String nivel = determinarNivel(puntajeTotal, edad);

        generarMensaje(nombre, edad, puntajeTotal, nivel);
    }

    public static String ingresarTexto(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    public static int ingresarEntero(String mensaje) {
        System.out.print(mensaje);
        return sc.nextInt();
    }

    public static double ingresarRealD(String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    public static int calcularPuntosCarrera(double tiempo) {

        int puntos;

        if (tiempo <= 12) {
            puntos = 50;
        } else if (tiempo <= 15) {
            puntos = 30;
        } else {
            puntos = 10;
        }

        return puntos;
    }

    public static int calcularPuntosAbdominales(int abdominales) {

        int puntos;

        if (abdominales >= 40) {
            puntos = 30;
        } else if (abdominales >= 20) {
            puntos = 20;
        } else {
            puntos = 10;
        }

        return puntos;
    }

    public static int calcularPuntosFlexiones(int flexiones) {

        int puntos;

        if (flexiones >= 30) {
            puntos = 20;
        } else if (flexiones >= 15) {
            puntos = 10;
        } else {
            puntos = 5;
        }

        return puntos;
    }

    public static String determinarNivel(int puntajeTotal, int edad) {

        String nivel;

        if (puntajeTotal >= 80 && edad >= 15) {
            nivel = "Alto";
        } else if (puntajeTotal >= 50 && puntajeTotal <= 79) {
            nivel = "Medio";
        } else if (puntajeTotal < 50) {
            nivel = "Bajo";
        } else {
            nivel = "No cumple los criterios de clasificación por edad";
        }

        return nivel;
    }

    public static void generarMensaje(
            String nombre, int edad, int puntajeTotal, String nivel) {

        String mensaje = "Nombre: " + nombre
                + "\nEdad: " + edad
                + "\nPuntaje total: " + puntajeTotal
                + "\nNivel de rendimiento: " + nivel;

        System.out.println(mensaje);
    }
}
