public static int ingresarEnteroRango(
        String mensaje, int valorMinimo, int valorMaximo) {

    boolean repetir = true;
    int valor = 0;

    while (repetir) {
        valor = Reutilizacion.ingresarEntero(mensaje);

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

void main() {
}