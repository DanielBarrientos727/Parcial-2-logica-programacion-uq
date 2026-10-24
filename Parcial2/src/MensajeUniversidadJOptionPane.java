/*
 * Ejemplo 4
 * Programa para la medición del pH.
 * Autor: Área de programación
 * Fecha: agosto 2026
 * Licencia: GNU GPL v3 (es una licencia de software libre y código abierto)
 */

import javax.swing.JOptionPane;

public class MensajeUniversidadJOptionPane {

    public static void main(String[] args) {
        double valorPH = ingresarRealD("Ingrese el valor del pH: ");
        generarMensajePH(valorPH);
    }

    public static double ingresarRealD(String mensaje) {
        double valorReal = Double.parseDouble(
                JOptionPane.showInputDialog(mensaje)
        );
        return valorReal;
    }

    public static void generarMensajePH(double valorPH) {
        String mensaje = "El valor del pH de la sustancia es de: " + valorPH;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

// MensajeUniversidadJOptionPane
