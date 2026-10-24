public class Parcial2 {
    // Constantes del problema, vienen del parcial: mayúsculas para constantes siempre, y minúsculas para variables siempre.
    public static final double META = 500000; // Tenemos como una meta de ventas, literalmente, comienza en 500.000.
    public static final double PORCENTAJE_INCREMENTO = 0.10; // La tienda busca desea como estimar lo que pasaria si se presenta un incremento del 10%, toca buscar como hacer eso
    public static final double PROMEDIO_ALTO = 100000; //En el dado caso que las ventas de la tienda supere los 500.000 o sea igual a este, se debera calcular si el promedio de los pedidos superan los 100.000 o no

    public static void main(String[] args) {

        //METODOS -> tarea especifica que realiza un programa
        ejecutarPrograma();
    }

    public static void ejecutarPrograma() {
        int cantidadPedidos = solicitarCantidadPedidos(); //obvio, int ya que no hay pérdidos con décimales
        //cantidadPedidos guardará los perdidos

        // ACA ponemos las llamadas a los metodos, cada método varia segun lo que se requiera a usar, abajo abajo colocamos lo que ellas ejecutaran
        double totalVentas = calcularTotalVentas(cantidadPedidos); //Pues se da como resultados el valor total de las ventas
        double promedioVentas = calcularPromedioVentas(totalVentas, cantidadPedidos); //se dividen entre si esas variables, y nos dará un valor que segun el dato, varia
        double cumplimientoVentas = calcularCumplimientoVentas(totalVentas); //Se evalua si se cumplio lo que pidio el enunciado
        double incrementoVentas = calcularIncrementoVentas(totalVentas); //Se incremento luego del ejercicio del 10%
        double ventasProyectadas = calcularVentasProyectadas(totalVentas, incrementoVentas); //se suma el total con el imprementoVentas y dara un resultado
        String resultadoJornada = calcularResultadoJornada(totalVentas, promedioVentas);  // nos dice si es bajo o alto el promedio, o Alto promedio en ventas o Bajas. EN TEXTO
        mostrarResultados(
                cantidadPedidos, totalVentas, promedioVentas,
                cumplimientoVentas, incrementoVentas, ventasProyectadas, resultadoJornada
        );
    }

  /*
                Declaración de metodos
     */

    // aca se va a solicitar la cantidad de pedidos
    public static int solicitarCantidadPedidos() {
        int cantidadPedidos = Reutilizacion.ingresarEnteroMayorQue(
                "Ingrese la cantidad de pedidos por favor: ", 0
        ); //debe de tener valor minimo
        return cantidadPedidos; //PARCIAL DICE QUE TODO CON RETURN
    }

    // Suma el valor de todos los pedidos
    public static double calcularTotalVentas(int cantidadPedidos) {
        double totalVentas = 0; //Acumulador

        //for inicia desde el 0 mismo
        for (int contarpedidos = 0; contarpedidos < cantidadPedidos; contarpedidos++) {
            double valorPedido = Reutilizacion.ingresarRealMayorQue("Por favor señor usuario, coloque el valor del pedido: ", 0); //precio perdido mayor a 0 SIEMPRE
            totalVentas = totalVentas + valorPedido; // totalventas inicia en 0 y se va sumando las ganancias de los perdidos
        }

        return totalVentas;
    }

    // Calcula el promedio de ventas por cada perdido

    public static double calcularPromedioVentas(double totalVentas, int cantidadPedidos) {
        double promedioVentas = totalVentas / cantidadPedidos;
        return promedioVentas;
    }

    // Calcula el porcentaje de cumplimiento de la meta (Constante es)
    public static double calcularCumplimientoVentas(double totalVentas) {
        double cumplimientoVentas = (totalVentas / META) * 100;
        return cumplimientoVentas;
    }

    // Este metodo va calcular el incremento del 10 % sobre las ventas
    public static double calcularIncrementoVentas(double totalVentas) {
        double incrementoVentas = totalVentas * PORCENTAJE_INCREMENTO; //CONSTANTE
        return incrementoVentas; //Da el valor
    }

    // Esto va a calcular el total proyectado con el incremento
    public static double calcularVentasProyectadas(double totalVentas, double incrementoVentas) {
        double ventasProyectadas = totalVentas + incrementoVentas;
        return ventasProyectadas;
    }

    // Ahora usamos un if para lograr según el total de ventas, diferir el mensaje al señor usuario del programa este
    public static String calcularResultadoJornada(double totalVentas, double promedioVentas) {
        String resultadoJornada;

        //si es mayor a 500.000 entrar al if, caso general y por a su vez usamos la constante de la meta y del promedio obvio
        if (totalVentas >= META) {
            if (promedioVentas >= PROMEDIO_ALTO) {
                resultadoJornada = "Ventas con alto promedio por pedido"; //si es mayor tanto las ventas superiores a 500.000 y el promedio de cada perdido es mayora 100.000, sale el primer System.out.println
            } else {
                resultadoJornada = "Ventas con bajo promedio por pedido"; //A lo contrario sale esto, en cualquier caso que no sea una de las dos, pero debe de ser mayor a 500.000 las ventas
            }
        } else {
            resultadoJornada = "Ventas por debajo de la meta"; //Si no entra aca, al final
        }
        return resultadoJornada;
    }

    // Finalmente solo imprimiremos todo los modulos hechos
    public static void mostrarResultados(
            int cantidadPedidos,
            double totalVentas,
            double promedioVentas,
            double cumplimientoVentas,
            double incrementoVentas,
            double ventasProyectadas,
            String resultadoJornada) {

        System.out.println("La cantidad de pedidos es: " + cantidadPedidos);
        System.out.println("La total de las ventas son: $" + totalVentas);
        System.out.println("El promedio por pedido es de: $" + promedioVentas);
        System.out.println("Cumplimiento de la meta: " + cumplimientoVentas + "%");
        System.out.println("El incremento del 10% es: $" + incrementoVentas);
        System.out.println("Las ventas proyectadas serán: $" + ventasProyectadas);
        System.out.println("El resultado de la jornada es: " + resultadoJornada);
    }
  }
