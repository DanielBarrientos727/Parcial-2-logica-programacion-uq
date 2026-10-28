
public class Descargando {

    public static void main(String[] args) throws InterruptedException {

        String paquete = "linux-firmware-2026.10-1.x86_64.rpm";
        int tamanoTotal = 250;
        int anchoBarra = 40;

        System.out.println(":: Sincronizando bases de datos de paquetes...");
        Thread.sleep(800);

        System.out.println(":: Resolviendo dependencias...");
        Thread.sleep(700);

        System.out.println(":: Preparando transaccion...");
        Thread.sleep(600);

        System.out.println();
        System.out.println(" Paquete: " + paquete);
        System.out.println(" Tamano:  " + tamanoTotal + " MiB");
        System.out.println();

        for (int porcentaje = 0; porcentaje <= 100; porcentaje++) {

            int descargado = tamanoTotal * porcentaje / 100;
            int bloques = anchoBarra * porcentaje / 100;
            int restantes = anchoBarra - bloques;

            String barra = "#".repeat(bloques)
                    + "-".repeat(restantes);

            double velocidad = 8.5 + (porcentaje % 7) * 1.3;
            int tiempoRestante = (100 - porcentaje) / 5;

            System.out.printf(
                    "\r[%s] %3d%% | %3d/%d MiB | %.1f MiB/s | ETA: %02d s",
                    barra,
                    porcentaje,
                    descargado,
                    tamanoTotal,
                    velocidad,
                    tiempoRestante
            );

            System.out.flush();
            Thread.sleep(100);
        }

        System.out.println();
        System.out.println();
        System.out.println("(1/1) Verificando integridad del paquete...");
        Thread.sleep(900);

        System.out.println("(1/1) Comprobando firma digital...");
        Thread.sleep(700);

        System.out.println("(1/1) Preparando archivos...");
        Thread.sleep(600);

        System.out.println();
        System.out.println("Transaccion completada.");
        System.out.println("1 paquete procesado.");
        System.out.println("Estado: EXITO");
    }
}
