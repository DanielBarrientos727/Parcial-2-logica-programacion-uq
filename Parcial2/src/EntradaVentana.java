import javax.swing.JOptionPane;

public class EntradaVentana {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));

        JOptionPane.showMessageDialog(null,"Hola " + nombre + ", tienes " + edad + " años.");
    }
}