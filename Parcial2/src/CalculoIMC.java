
import javax.swing.JOptionPane;

public class CalculoIMC {

    public static void main(String[] args) {

        String nombre = ingresarTexto("Ingrese el nombre del usuario:");
        double peso = ingresarRealD("Ingrese el peso en kilogramos:");
        double estatura = ingresarRealD("Ingrese la estatura en metros:");

        double imc = calcularIMC(peso, estatura);
        String mensajeEstado = verificarSobrepeso(imc);

        generarMensaje(nombre, imc, mensajeEstado);
    }

    public static String ingresarTexto(String mensaje) {
        String texto = JOptionPane.showInputDialog(mensaje);
        return texto;
    }

    public static double ingresarRealD(String mensaje) {
        double valor = Double.parseDouble(
                JOptionPane.showInputDialog(mensaje)
        );
        return valor;
    }

    public static double calcularIMC(double peso, double estatura) {
        double imc = peso / (estatura * estatura);
        return imc;
    }

    public static String verificarSobrepeso(double imc) {
        String estado;

        if (imc < 18.5) {
            estado = "Bajo peso";
        } else if (imc < 25) {
            estado = "Peso normal";
        } else if (imc < 30) {
            estado = "Sobrepeso";
        } else {
            estado = "Obesidad";
        }

        return estado;
    }

    public static void generarMensaje(
            String nombre, double imc, String mensajeEstado) {

        String mensaje = "Nombre: " + nombre
                + "\nIMC: " + String.format("%.2f", imc)
                + "\nEstado: " + mensajeEstado;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
