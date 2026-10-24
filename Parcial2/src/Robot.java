public class Robot {

    public static void main(String[] args) {
        double limite = Reutilizacion.ingresarRealMayorQue(
                "Ingrese el límite de la altura: ", 0);

        int dias = calcularDias(limite);
        generarMensajeRobot(dias);
    }

    public static int calcularDias(double limite) {
        double suma = 0;
        int dias = 0;

        while (suma < limite) {
            dias++;
            suma += dias * dias;
        }

        return dias;
    }

    public static void generarMensajeRobot(int dias) {
        String mensaje = "Se necesitan " + dias
                + " días de entrenamiento para alcanzar "
                + "o superar la altura.";
        System.out.println(mensaje);
    }
}