
import javax.swing.JOptionPane;

public class MultaBiblioteca {

    public static void main(String[] args) {
        String nombre = ingresarTexto("Ingrese el nombre del estudiante:");
        int diasRetraso = ingresarEntero(
                "Ingrese la cantidad de días de retraso:"
        );

        double multa = calcularMulta(diasRetraso);

        generarMensaje(nombre, multa);
    }

    public static String ingresarTexto(String mensaje) {
        String texto = JOptionPane.showInputDialog(mensaje);
        return texto;
    }

    public static int ingresarEntero(String mensaje) {
        int valor = Integer.parseInt(
                JOptionPane.showInputDialog(mensaje)
        );
        return valor;
    }

    public static double calcularMulta(int dias) {
        double multa = 0.0;

        if (dias > 3) {
            multa = multa + 5000;
        }

        if (dias > 7) {
            multa = multa + 3000;
        }

        if (dias > 15) {
            multa = multa + 10000;
        }

        return multa;
    }

    // Ejemplo 3

    public static void generarMensaje(String nombre, double multa) {
        String mensaje = "Nombre del estudiante: " + nombre
                + "\nValor total de la multa: $" + multa;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
