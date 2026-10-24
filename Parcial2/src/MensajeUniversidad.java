/*
 * Ejemplo 4
 * Programa para la medición del pH.
 * Autor: Área de programación
 * Fecha: agosto 2026
 * Licencia: GNU GPL v3
 */

import java.util.Scanner;

public class MensajeUniversidad {

    public static void main(String[] args) {
        double valorPH = ingresarRealD("Ingrese el valor del pH: ");
        generarMensajePH(valorPH);
    }

    public static double ingresarRealD(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        double valorReal = sc.nextDouble();
        return valorReal;
    }

    public static void generarMensajePH(double valorPH) {
        String mensaje = "El valor del pH de la sustancia es de: " + valorPH;
        System.out.println(mensaje);
    }
}
