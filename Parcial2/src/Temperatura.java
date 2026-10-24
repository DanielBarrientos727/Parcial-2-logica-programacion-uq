
import javax.swing.JOptionPane;

public class Temperatura {

    public static void main(String[] args) {
        double celsius = ingresarRealD(
                "Ingrese la temperatura en grados Celsius:"
        );

        double kelvin = calcularKelvin(celsius);
        double fahrenheit = calcularFahrenheit(celsius);

        generarMensaje(celsius, kelvin, fahrenheit);
    }

    public static double ingresarRealD(String mensaje) {
        double valor = Double.parseDouble(
                JOptionPane.showInputDialog(mensaje)
        );
        return valor;
    }

    public static double calcularKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double calcularFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static void generarMensaje(
            double celsius, double kelvin, double fahrenheit) {

        String mensaje = "Temperatura en Celsius: " + celsius + " °C"
                + "\nTemperatura en Kelvin: " + kelvin + " K"
                + "\nTemperatura en Fahrenheit: " + fahrenheit + " °F";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
