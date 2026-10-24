
import java.util.Scanner;

public class CalcularFrutas {

    static final int MAXKGCAJA = 20;
    static final int MAXCAJAS = 15;

    public static void main(String[] args) {

        int pedido = ingresarEntero(
                "Ingrese la cantidad de kg de frutas vendida: "
        );

        int cantidadCajas = calcularCantidadCajas(pedido);

        generarMensajeCajas(cantidadCajas);
    }

    public static int ingresarEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        int valor = sc.nextInt();
        return valor;
    }

    public static int calcularCantidadCajas(int pedido) {
        int pedidoFinal = (pedido + MAXKGCAJA - 1) / MAXKGCAJA;
        return pedidoFinal;
    }

    public static void generarMensajeCajas(int cantidadCajas) {

        String mensaje = "";

        if (cantidadCajas <= MAXCAJAS) {
            mensaje = "Cantidad de cajas necesarias: " + cantidadCajas;
        } else {
            mensaje = "El pedido se cancela por falta de cajas disponibles";
        }

        System.out.println(mensaje);
    }
}
