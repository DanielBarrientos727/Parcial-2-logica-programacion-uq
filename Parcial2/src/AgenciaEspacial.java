
public class AgenciaEspacial {

    public static void main(String[] args) {
        int valorInicial = Reutilizacion.ingresarEntero(
                "Ingresar el valor inicial de la cuenta regresiva: "
        );

        int valorFinal = Reutilizacion.ingresarEntero(
                "Ingresar el valor final de la cuenta regresiva: "
        );

        generarMensajeCohete(valorInicial, valorFinal);
    }

    public static void generarMensajeCohete(
            int valorInicial, int valorFinal) {

        String mensaje = "";

        while (valorInicial >= valorFinal) {
            mensaje += valorInicial + "\n";
            valorInicial--;
        }

        mensaje += "¡Despegue exitoso!";
        System.out.println(mensaje);
    }
}
