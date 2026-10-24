import javax.swing.JOptionPane;

public class SumaJOptionPane {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el primer numero:")
        );

        double num2 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el segundo numero:")
        );

        double suma = num1 + num2;

        JOptionPane.showMessageDialog(
                null, "La suma es: " + suma
        );
    }
}
