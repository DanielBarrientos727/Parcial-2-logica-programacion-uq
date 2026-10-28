
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RelojASCII {

    public static void main(String[] args) throws InterruptedException {

        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("HH:mm:ss");

        // Ocultar el cursor de la terminal
        System.out.print("\033[?25l");

        try {

            for (;;) {

                String hora = LocalTime.now().format(formato);

                // Volver al inicio de la misma posicion
                System.out.print("\033[H");

                System.out.println("  +--------------------------+");
                System.out.println("  |       RELOJ LINUX        |");
                System.out.println("  +--------------------------+");
                System.out.println();

                System.out.println("       " + hora);

                System.out.println();
                System.out.println("  +--------------------------+");
                System.out.println("  |     SISTEMA: ACTIVO      |");
                System.out.println("  +--------------------------+");

                System.out.flush();

                Thread.sleep(200);
            }

        } finally {
            // Mostrar el cursor nuevamente al salir
            System.out.print("\033[?25h");
            System.out.flush();
        }
    }
}
