public class concurso {

    static final double PUNTAJEMINIMO = 0.0;
    static final double PUNTAJEMINIMAAPROBAR = 75.0;
    static final double PUNTAJEMAXIMO = 100.0;

    public static void main(String[] args) {
        double puntaje = ingresarRealRango(
                "Ingrese su puntaje final: ",
                PUNTAJEMINIMO,
                PUNTAJEMAXIMO
        );

        generarMensajePuntaje(puntaje);
    }

    public static double ingresarRealRango(
            String mensaje, double valorMinimo, double valorMaximo) {

        boolean repetir = true;
        double valor = 0.0;

        while (repetir) {
            valor = Reutilizacion.ingresarRealD(mensaje);

            if (valor < valorMinimo || valor > valorMaximo) {
                System.out.println(
                        "El valor no está entre "
                                + valorMinimo + " y " + valorMaximo
                );
            } else {
                repetir = false;
            }
        }

        return valor;
    }

    public static void generarMensajePuntaje(double puntaje) {
        if (puntaje >= PUNTAJEMINIMAAPROBAR) {
            System.out.println("¡Felicitaciones! Ha aprobado el concurso.");
        } else {
            System.out.println("No ha alcanzado el puntaje mínimo para aprobar.");
        }
    }
}