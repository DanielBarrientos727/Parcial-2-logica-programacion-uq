
public class Ahorro {

    public static void main(String[] args) {
        double capital = Reutilizacion.ingresarRealMayorQue(
                "Ingrese el capital inicial: ", 0);

        double meta = Reutilizacion.ingresarRealMayorQue(
                "Ingrese la meta de ahorro: ", 0);

        double interes = Reutilizacion.ingresarRealMayorQue(
                "Ingrese el interés mensual en decimal: ", 0);

        int meses = calcularMeses(capital, meta, interes);
        generarMensaje(meses);
    }

    public static int calcularMeses(
            double capital, double meta, double interes) {

        int meses = 0;

        while (capital < meta) {
            capital = capital + capital * interes;
            meses++;
        }

        return meses;
    }

    public static void generarMensaje(int meses) {
        System.out.println(
                "María necesita " + meses
                        + " meses para alcanzar su meta de ahorro.");
    }
}
