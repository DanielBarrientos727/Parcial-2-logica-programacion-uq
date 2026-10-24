/*
Programa para generar y mostrar un mensaje personalizado de interés.
Autor: Área de programación
Fecha: agosto 2026
Licencia: GNU GPL v3 (es una licencia de software libre y código abierto)
*/

import java.util.Scanner;
public class MensajeInteresScanner{
    public static void main(String[] args) {
        String mensajeInteres = ingresarTexto("Ingrese el mensaje de interés: ");
        generarMensajeInteres(mensajeInteres);
    }
    public static String ingresarTexto(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        String texto = sc.nextLine();
        return texto;
    }
    public static void generarMensajeInteres(String mensajeInteres) {
        String mensaje= "La secretaría de transporte le informa que: " + mensajeInteres;
        System.out.println(mensaje);
    }
}