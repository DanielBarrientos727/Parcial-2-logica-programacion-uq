public static void generarMensajeNota(double
                                              notaDefinitiva) {
    String mensaje;
    if (notaDefinitiva < 3.0) {
        mensaje = "Insuficiente";
    } else if (notaDefinitiva <= 3.5) {
        mensaje = "Aceptable";
    } else if (notaDefinitiva <= 4.0) {
        mensaje = "Sobresaliente";
    } else {
        mensaje = "Excelente";
    }
    System.out.println(mensaje);
}

void main() {
}