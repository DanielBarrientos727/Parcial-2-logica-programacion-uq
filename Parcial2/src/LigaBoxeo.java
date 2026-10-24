
public class LigaBoxeo {

    public static void main(String[] args) {

        double peso = Reutilizacion.ingresarRealD(
                "Ingrese el peso del luchador en kg: "
        );

        String categoria = determinarCategoriaBoxeo(peso);

        generarMensaje(categoria);
    }

    public static String determinarCategoriaBoxeo(double peso) {

        String categoria;

        if (peso < 47) {
            categoria = "No cumple con el peso mínimo";
        } else if (peso <= 47) {
            categoria = "Mínimo";
        } else if (peso <= 52) {
            categoria = "Mosca";
        } else if (peso <= 55) {
            categoria = "Gallo";
        } else if (peso <= 64) {
            categoria = "Pluma";
        } else if (peso <= 77) {
            categoria = "Mediano";
        } else if (peso <= 90) {
            categoria = "Crucero";
        } else {
            categoria = "Pesado";
        }

        return categoria;
    }

    public static void generarMensaje(String categoria) {

        String mensaje = "La categoría a la que pertenece el luchador es: "
                + categoria;

        System.out.println(mensaje);
    }
}
