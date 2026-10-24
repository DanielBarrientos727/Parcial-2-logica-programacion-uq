public class CompetenciaMatematica {

    public static void main(String[] args) {
        int m = Reutilizacion.ingresarEntero(
                "Ingrese el límite inferior M: ");

        int n = Reutilizacion.ingresarEnteroMayorQue(
                "Ingrese el límite superior N: ", m);

        generarSumatoria(m, n);
    }

    public static void generarSumatoria(int m, int n) {
        int sumaPares = 0;
        int sumaImpares = 0;

        while (m <= n) {
            if (m % 2 == 0) {
                sumaPares = sumaPares + m;
            } else {
                sumaImpares = sumaImpares + m;
            }

            m = m + 1;
        }

        System.out.println("Suma de números pares: " + sumaPares);
        System.out.println("Suma de números impares: " + sumaImpares);
    }
}