
import javax.swing.JOptionPane;

public class LiquidacionJOptionPane {
    public static void main(String[] args) {
        double salario = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el salario mensual:")
        );

        int diasLaborados = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese los dias laborados:")
        );

        if (salario <= 0 || diasLaborados <= 0) {
            JOptionPane.showMessageDialog(
                    null, "El salario y los dias deben ser mayores que cero."
            );
        } else {
            double prima = (salario * diasLaborados) / 360;
            double cesantias = (salario * diasLaborados) / 360;
            double interesesCesantias =
                    cesantias * (0.12 * diasLaborados / 360);
            double vacaciones = (salario * diasLaborados) / 720;

            double total = prima + cesantias
                    + interesesCesantias + vacaciones;

            String resultado = String.format(
                    "--- LIQUIDACION LABORAL ---\n"
                            + "Prima: $%.2f\n"
                            + "Cesantias: $%.2f\n"
                            + "Intereses a las cesantias: $%.2f\n"
                            + "Vacaciones: $%.2f\n"
                            + "Total liquidacion: $%.2f",
                    prima, cesantias, interesesCesantias,
                    vacaciones, total
            );

            JOptionPane.showMessageDialog(null, resultado);
        }
    }
}
