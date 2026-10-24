
import javax.swing.JOptionPane;

public class BeneficioMatricula {

    public static void main(String[] args) {
        String nombre = ingresarTexto("Ingrese el nombre del estudiante:");
        int edad = ingresarEntero("Ingrese la edad:");
        double promedio = ingresarRealD("Ingrese el promedio académico:");
        int estrato = ingresarEntero("Ingrese el estrato socioeconómico:");

        String beneficios = evaluarBeneficios(edad, promedio, estrato);

        generarMensaje(nombre, beneficios);
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

    public static double ingresarRealD(String mensaje) {
        double valor = Double.parseDouble(
                JOptionPane.showInputDialog(mensaje)
        );
        return valor;
    }

    // Ejemplo 4

    public static String evaluarBeneficios(
            int edad, double promedio, int estrato) {

        String mensaje = "";

        if (promedio >= 4.5 && estrato <= 2) {
            mensaje = mensaje
                    + "Obtiene descuento del 30% en la matrícula.\n";
        }

        if (edad < 18) {
            mensaje = mensaje
                    + "Recibe bono adicional de $100.000.\n";
        }

        if (promedio >= 4.8) {
            mensaje = mensaje
                    + "Recibe reconocimiento académico.\n";
        }

        return mensaje;
    }

    public static void generarMensaje(
            String nombre, String beneficios) {

        String mensajeFinal = "Estudiante: " + nombre;

        if (!beneficios.equals("")) {
            mensajeFinal = mensajeFinal
                    + "\nBeneficios obtenidos:\n" + beneficios;
        } else {
            mensajeFinal = mensajeFinal
                    + "\nNo obtiene beneficios.";
        }

        JOptionPane.showMessageDialog(null, mensajeFinal);
    }
}
