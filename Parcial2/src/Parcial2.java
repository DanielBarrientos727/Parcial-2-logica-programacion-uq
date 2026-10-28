public class Parcial2 {
    public static final double META = 500000; // Es la meta fija de ventas.
    public static final double PORCENTAJE_INCREMENTO = 0.10; // Incremento proyectado del 10%.
    public static final double PROMEDIO_ALTO = 100000; // es ya el promedio mínimo para que ventas de alto promedio -> como una puerta.
    public static void main(String[] args) {
        ejecutarPrograma(); // Inicia la ejecución del programa Parcial2.
    }

    // Se ejecutan los métodos del programa.

    public static void ejecutarPrograma() {
        int cantidadPedidos = solicitarCantidadPedidos(); //(1): Es la cantidad de pedidos registrados.
        double totalVentas = calcularTotalVentas(cantidadPedidos); //(2): Es el total de ventas.
        double promedioVentas = calcularPromedioVentas(totalVentas, cantidadPedidos); //(3): Es el promedio por pedido.
        double cumplimientoVentas = calcularCumplimientoVentas(totalVentas); //(4): Es el porcentaje de cumplimiento.
        double incrementoVentas = calcularIncrementoVentas(totalVentas); //(5): El incrementa del 10 %.
        double ventasProyectadas = calcularVentasProyectadas(totalVentas, incrementoVentas); //(6): Es el total proyectado.
        String resultadoJornada = calcularResultadoJornada(totalVentas, promedioVentas); //(7): Es la clasificación de la jornada/turno.

        //Mostrar los datos a pantalla.

        mostrarResultados(
                cantidadPedidos, totalVentas, promedioVentas,
                cumplimientoVentas, incrementoVentas, ventasProyectadas, resultadoJornada
        );
    }

/*
                                    Declaración de métodos
*/

    // Se va a solicitar al usuario la cantidad de pedidos
    public static int solicitarCantidadPedidos() {
        int cantidadPedidos = Reutilizacion.ingresarEnteroMayorQue("Ingrese la cantidad de pedidos: ", 0);
        return cantidadPedidos;
    }

    // Sólo va a tomar el valor de todos los pedidos.

    public static double calcularTotalVentas(int cantidadPedidos) {
        double totalVentas = 0; // Acumulador.

        // Condición, contador e incremento.
        for (int contarPedidos = 0; contarPedidos < cantidadPedidos; contarPedidos++) {
            double valorPedido = Reutilizacion.ingresarRealMayorQue("Ingrese el valor del pedido: ", 0);
            totalVentas = totalVentas + valorPedido;
        }
        return totalVentas;
    }

    // Va a calcular el promedio por pedido.
    public static double calcularPromedioVentas(double totalVentas, int cantidadPedidos) {
        double promedioVentas = totalVentas / cantidadPedidos;
        return promedioVentas;
    }
    // Y este calcula el porcentaje de cumplimiento de la meta.
    public static double calcularCumplimientoVentas(double totalVentas) {
        double cumplimientoVentas = (totalVentas / META) * 100;
        return cumplimientoVentas;
    }
    // Esto solo va a calcular el incremento del 10 %.
    public static double calcularIncrementoVentas(double totalVentas) {
        double incrementoVentas = totalVentas * PORCENTAJE_INCREMENTO;
        return incrementoVentas;
    }
    // Va a calcular el total proyectado de ventas.
    public static double calcularVentasProyectadas(double totalVentas, double incrementoVentas) {
        double ventasProyectadas = totalVentas + incrementoVentas;
        return ventasProyectadas;
    }
    // Clasifica la jornada según las ventas y el promedio.
    public static String calcularResultadoJornada(double totalVentas, double promedioVentas) {
        String resultadoJornada;

        /*

           ESTA ES LA PARTE ANIDADA



         */


        //Imprime y lo rompe
        if (totalVentas >= META) {
            if (promedioVentas >= PROMEDIO_ALTO) {
                resultadoJornada = "Ventas con alto promedio por pedido";
            } else {
                resultadoJornada = "Ventas con bajo promedio por pedido";
            }
        } else {
            resultadoJornada = "Ventas por debajo de la meta";
        }
        return resultadoJornada;
    }

    // Ahora bien, esto muestra los resultados de la jornada.
    public static void mostrarResultados(
            int cantidadPedidos, double totalVentas, double promedioVentas, double cumplimientoVentas, double incrementoVentas, double ventasProyectadas, String resultadoJornada) {

        System.out.println("Cantidad de pedidos: " + cantidadPedidos);
        System.out.println("Total de ventas: $" + totalVentas); //Peso colombiano
        System.out.println("Promedio por pedido: $" + promedioVentas); //Peso colombiano
        System.out.println("Cumplimiento de la meta: " + cumplimientoVentas + "%");
        System.out.println("Incremento del 10 %: $" + incrementoVentas); //Peso colombiano
        System.out.println("Ventas proyectadas: $" + ventasProyectadas); //Peso colombiano
        System.out.println("Resultado de la jornada: " + resultadoJornada);
    }

}