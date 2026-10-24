public static String validarReserva(double valorReserva) {
    String mensaje;

    if (valorReserva >= 50000) {
        if (valorReserva > 200000) {
            mensaje = "Reserva de valor alto";
        } else {
            mensaje = "Reserva de valor medio";
        }
    } else {
        mensaje = "Reserva de valor básico";
    }

    return mensaje;
}

void main() {
}