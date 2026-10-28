
public class NeoFetch {

    // Colores ANSI para la terminal
    public static final String RESET = "\u001B[0m";
    public static final String CYAN = "\u001B[36m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String WHITE = "\u001B[37m";
    public static final String BOLD = "\u001B[1m";

    public static void main(String[] args) {

        String[] logo = {
                "       _,met$$$$$gg.",
                "    ,g$$$$$$$$$$$$$$$P.",
                "  ,g$$P\"\"       \"\"\"Y$$.\".",
                " ,$$P'              `$$$.",
                "',$$P       ,ggs.     `$$b:",
                "`d$$'     ,$P\"'   .    $$$",
                " $$P      d$'     ,    $$P",
                " $$:      $$.   -    ,d$$'",
                " $$;      Y$b._   _,d$P'",
                " Y$$.    `.`\"Y$$$$P\"'",
                " `$$b      \"-.__",
                "  `Y$$",
                "   `Y$$.",
                "     `$$b.",
                "       `Y$$b.",
                "          `\"Y$b._",
                "              `\"\"\""
        };

        String[] info = {
                "usuario@debian",
                "-------------------------",
                "OS: Debian GNU/Linux 6.0",
                "Host: Dell OptiPlex 780",
                "Kernel: 2.6.32-5-686",
                "Uptime: 2 hours, 17 mins",
                "Packages: 1248 (dpkg)",
                "Shell: bash 4.1.5",
                "Resolution: 1280x1024",
                "DE: GNOME 2.30.2",
                "WM: Metacity",
                "Theme: Clearlooks",
                "Terminal: GNOME Terminal",
                "CPU: Intel Core 2 Duo E8400",
                "     (2) @ 3.00 GHz",
                "GPU: Intel GMA 4500",
                "Memory: 742 MiB / 1980 MiB",
                "",
                "Debian GNU/Linux 6.0 (squeeze)",
                "Linux since 1991."
        };

        System.out.println();

        int filas = Math.max(logo.length, info.length);

        for (int i = 0; i < filas; i++) {

            // Mostrar el logo de Debian simulado
            if (i < logo.length) {
                System.out.printf("%s%-31s%s",
                        CYAN + BOLD, logo[i], RESET);
            } else {
                System.out.print("                               ");
            }

            // Mostrar la informacion del sistema
            if (i < info.length) {

                String texto = info[i];

                if (texto.startsWith("usuario@")) {
                    System.out.print(GREEN + BOLD + texto + RESET);
                } else if (texto.startsWith("---")) {
                    System.out.print(CYAN + texto + RESET);
                } else if (texto.startsWith("OS:")
                        || texto.startsWith("CPU:")
                        || texto.startsWith("GPU:")
                        || texto.startsWith("Memory:")) {

                    int separador = texto.indexOf(':');

                    System.out.print(WHITE + BOLD
                            + texto.substring(0, separador + 1)
                            + RESET
                            + texto.substring(separador + 1));
                } else {
                    System.out.print(texto);
                }
            }

            System.out.println();
        }

        System.out.println();
        System.out.println(BLUE
                + "  [####] [####] [####] [####] [####]"
                + RESET);
        System.out.println();
    }
}
