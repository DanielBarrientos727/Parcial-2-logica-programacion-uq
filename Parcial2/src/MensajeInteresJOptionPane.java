/*
Programa para generar y mostrar un mensaje personalizado de interés.
Autor: Área de programación
Fecha: agosto 2026
Licencia: GNU GPL v3 (es una licencia de software libre y código abierto)
*/

import javax.swing.JOptionPane;
public class MensajeInteresJOptionPane{
    public static void main(String[] args) {
        String mensajeInteres = ingresarTexto("Ingrese el mensaje de interés: ");
        generarMensajeInteres(mensajeInteres);
    }
    public static String ingresarTexto(String mensaje) {
        String texto=JOptionPane.showInputDialog(mensaje);
        return texto;
    }
    public static void generarMensajeInteres(String mensajeInteres) {
        String mensaje= "La secretaría de transporte le informa que: " + mensajeInteres;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}