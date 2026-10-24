
public static String verificarSobrepeso(double imc) {
    String mensajeEstado = "El usuario se encuentra en un peso normal.";

    if (imc > 25) {
        mensajeEstado = "El usuario se encuentra en sobrepeso.";
    }

    return mensajeEstado;
}

public static void generarMensaje(
        String nombre, double imc, String mensajeEstado) {

    String mensaje = "Nombre: " + nombre
            + "\nIMC calculado: " + imc
            + "\n" + mensajeEstado;

    //JOptionPane.showMessageDialog(null, mensaje);
}

void main() {
}
