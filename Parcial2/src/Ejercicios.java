import java.util.Scanner;

public class Ejercicios {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n========== MENU DE EJERCICIOS ==========");
            System.out.println("1. Billete Capicua");
            System.out.println("2. Ciclos de Carga de Bateria");
            System.out.println("3. Contar Digitos Mayores que X");
            System.out.println("4. Plan de Ahorro Personal");
            System.out.println("5. Llenado del Tanque de Jardin");
            System.out.println("6. Busqueda de Ofertas");
            System.out.println("7. Factoriales Pares");
            System.out.println("8. Numeros Primos");
            System.out.println("9. Clasificacion de Codigo de Libro");
            System.out.println("10. Simulacion Energetica");
            System.out.println("11. Monitoreo de Solicitudes a Servidor");
            System.out.println("12. Crecimiento Poblacional");
            System.out.println("13. Estructuras de Decision Anidada");
            System.out.println("14. Ejemplos de Impresion A, B, C y D");
            System.out.println("0. Salir");

            opcion = ingresarEntero("Seleccione una opcion: ");

            switch (opcion) {
                case 1: ejercicio01(); break;
                case 2: ejercicio02(); break;
                case 3: ejercicio03(); break;
                case 4: ejercicio04(); break;
                case 5: ejercicio05(); break;
                case 6: ejercicio06(); break;
                case 7: ejercicio07(); break;
                case 8: ejercicio08(); break;
                case 9: ejercicio09(); break;
                case 10: ejercicio10(); break;
                case 11: ejercicio11(); break;
                case 12: ejercicio12(); break;
                case 13: ejercicio13(); break;
                case 14: ejercicio14(); break;
                case 0: System.out.println("Programa finalizado."); break;
                default: System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);
    }

    public static int ingresarEntero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public static long ingresarLong(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLong();
    }

    public static double ingresarReal(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    // EJERCICIO 1: BILLETE CAPICUA
    public static void ejercicio01() {
        long numeroSerie = ingresarLong("Ingrese el numero de serie del billete: ");

        if (numeroSerie <= 0) {
            System.out.println("El numero de serie debe ser un entero positivo mayor a 0.");
        } else if (esCapicua(numeroSerie)) {
            System.out.println("El billete es VERDADERO.");
        } else {
            System.out.println("El billete es FALSO.");
        }
    }

    public static boolean esCapicua(long numero) {
        long original = numero;
        long invertido = 0;

        while (numero > 0) {
            long digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }

        return original == invertido;
    }

    // EJERCICIO 2: CICLOS DE CARGA DE BATERIA
    public static void ejercicio02() {
        double cargaActual = ingresarReal("Ingrese el nivel actual de carga (0 a 100): ");

        if (cargaActual < 0 || cargaActual > 100) {
            System.out.println("Nivel de carga fuera del rango valido (0 - 100).");
        } else {
            int ciclos = 0;
            double carga = cargaActual;

            while (carga < 100) {
                carga += 15;
                ciclos++;
            }

            System.out.println("Ciclos necesarios para completar la bateria: " + ciclos);
        }
    }

    // EJERCICIO 3: CONTAR DIGITOS MAYORES QUE X
    public static void ejercicio03() {
        long numero = ingresarLong("Ingrese un numero entero positivo: ");
        int x = ingresarEntero("Ingrese el valor de X (0 a 9): ");

        if (numero <= 0) {
            System.out.println("El numero ingresado debe ser un entero positivo.");
        } else if (x < 0 || x > 9) {
            System.out.println("X debe estar entre 0 y 9.");
        } else {
            int contador = contarDigitosMayores(numero, x);
            System.out.println("Cantidad de digitos mayores que " + x + ": " + contador);
        }
    }

    public static int contarDigitosMayores(long numero, int x) {
        int contador = 0;
        long temp = numero;

        while (temp > 0) {
            long digito = temp % 10;
            if (digito > x) {
                contador++;
            }
            temp /= 10;
        }

        return contador;
    }

    // EJERCICIO 4: PLAN DE AHORRO PERSONAL
    public static void ejercicio04() {
        int semanas = ingresarEntero("Ingrese el numero de semanas que desea ahorrar: ");

        if (semanas <= 0) {
            System.out.println("El numero de semanas debe ser mayor que cero.");
            return;
        }

        double totalAcumulado = 0;

        System.out.println("\n--- Registro Semana a Semana ---");
        for (int i = 1; i <= semanas; i++) {
            double ahorroSemana = ingresarReal("Ingrese el valor ahorrado en la semana " + i + ": ");
            totalAcumulado += ahorroSemana;
            System.out.println("Semana " + i + " - Acumulado: $" + totalAcumulado);
        }

        System.out.println("\nTotal ahorrado al finalizar el plan: $" + totalAcumulado);
    }

    // EJERCICIO 5: LLENADO DEL TANQUE DE JARDIN
    public static void ejercicio05() {
        double capacidadTanque = ingresarReal("Ingrese la capacidad del tanque en litros: ");
        double capacidadCubo = ingresarReal("Ingrese la capacidad del cubo en litros: ");

        if (capacidadTanque <= 0 || capacidadCubo <= 0) {
            System.out.println("Las capacidades deben ser numeros positivos mayores a cero.");
        } else {
            int veces = 0;
            double aguaAcumulada = 0;

            while (aguaAcumulada < capacidadTanque) {
                aguaAcumulada += capacidadCubo;
                veces++;
            }

            System.out.println("Veces que debe llenar y vaciar el cubo: " + veces);
        }
    }

    // EJERCICIO 6: BUSQUEDA DE OFERTAS
    public static void ejercicio06() {
        int precioMin = ingresarEntero("Ingrese el precio minimo del rango: ");
        int precioMax = ingresarEntero("Ingrese el precio maximo del rango: ");

        if (precioMax < precioMin) {
            System.out.println("El precio maximo debe ser mayor o igual al minimo.");
            return;
        }

        int sumaPrecios = 0;

        for (int precio = precioMin; precio <= precioMax; precio++) {
            if (precio % 5 == 0 && precio % 2 == 0) {
                sumaPrecios += precio;
            }
        }

        System.out.println("La suma de los precios pares y multiplos de 5 en el rango es: " + sumaPrecios);
    }

    // EJERCICIO 7: FACTORIALES PARES
    public static void ejercicio07() {
        int n = ingresarEntero("Ingrese un numero entero N: ");

        if (n < 1) {
            System.out.println("N debe ser mayor o igual a 1.");
            return;
        }

        int contadorPares = 0;

        for (int i = 1; i <= n; i++) {
            long factorial = calcularFactorial(i);
            if (factorial % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("Cantidad de factoriales pares entre 1 y " + n + ": " + contadorPares);
        System.out.println("Nota: los factoriales grandes pueden desbordar el tipo long.");
    }

    public static long calcularFactorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // EJERCICIO 8: NUMEROS PRIMOS
    public static void ejercicio08() {
        int limite = ingresarEntero("Ingrese el numero limite: ");

        System.out.println("Numeros primos menores o iguales a " + limite + ":");
        for (int i = 2; i <= limite; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    // EJERCICIO 9: CLASIFICACION DE CODIGO DE LIBRO
    public static void ejercicio09() {
        long codigo = ingresarLong("Ingrese el codigo del libro (entero positivo): ");

        if (codigo <= 0) {
            System.out.println("El codigo debe ser un entero positivo.");
            return;
        }

        int sumaDigitos = 0;
        long temp = codigo;

        while (temp > 0) {
            sumaDigitos += temp % 10;
            temp /= 10;
        }

        String clasificacion;

        if (sumaDigitos < 10) {
            clasificacion = "Codigo invalido";
        } else if ((sumaDigitos >= 10 && sumaDigitos <= 20)
                || (sumaDigitos >= 50 && sumaDigitos <= 60)) {
            clasificacion = "Codigo regular";
        } else {
            clasificacion = "Codigo valido y seguro";
        }

        System.out.println("Suma de los digitos: " + sumaDigitos);
        System.out.println("Clasificacion: " + clasificacion);
    }

    // EJERCICIO 10: SIMULACION ENERGETICA
    public static void ejercicio10() {
        int n = ingresarEntero("Ingrese la cantidad de iteraciones (entero positivo): ");

        if (n <= 0) {
            System.out.println("Las iteraciones deben ser mayores a 0.");
            return;
        }

        double s = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                s += Math.pow(i, 2);
            } else {
                s -= Math.pow(i, 3);
            }
        }

        double valorRetornado;

        if (s % 2 == 0 && s >= 10) {
            valorRetornado = Math.pow(s, 2);
        } else if (s % 2 != 0
                && ((s >= 10 && s <= 20) || (s >= 50 && s <= 60))) {
            valorRetornado = Math.sqrt(s);
        } else {
            valorRetornado = 0;
        }

        System.out.println("Cantidad de iteraciones: " + n);
        System.out.println("Resultado de la operacion (S): " + s);
        System.out.println("Valor retornado en decisiones anidadas: " + valorRetornado);
    }

    // EJERCICIO 11: MONITOREO DE SOLICITUDES A SERVIDOR
    public static void ejercicio11() {
        int n = ingresarEntero("Ingrese el numero de intervalos a analizar: ");

        if (n < 0) {
            System.out.println("El numero de intervalos no puede ser negativo.");
            return;
        }

        long totalAcumulado = 0;
        long solicitudesIntervalo = 1;

        for (int i = 1; i <= n; i++) {
            totalAcumulado += solicitudesIntervalo;
            solicitudesIntervalo = (solicitudesIntervalo * 2) + 1;
        }

        String clasificacion;

        if (totalAcumulado < 100) {
            clasificacion = "Codigo invalido";
        } else if ((totalAcumulado >= 100 && totalAcumulado <= 200)
                || (totalAcumulado >= 500 && totalAcumulado <= 600)) {
            clasificacion = "Codigo regular";
        } else {
            clasificacion = "Codigo valido y seguro";
        }

        System.out.println("Total acumulado de solicitudes recibidas: " + totalAcumulado);
        System.out.println("Clasificacion: " + clasificacion);
    }

    // EJERCICIO 12: CRECIMIENTO POBLACIONAL
    public static void ejercicio12() {
        int n = ingresarEntero("Ingrese el numero de generaciones: ");

        boolean cumpleEraGeneracional =
                (n % 4 == 0 && n % 100 != 0) || (n % 400 == 0);

        if (cumpleEraGeneracional) {
            System.out.println("El numero de generaciones " + n
                    + " CUMPLE con la era generacional.");
        } else {
            System.out.println("El numero de generaciones " + n
                    + " NO cumple con la era generacional.");
        }

        System.out.println("Secuencia poblacional generada:");
        imprimirPoblacion(n);
    }

    public static void imprimirPoblacion(int n) {
        if (n <= 0) {
            return;
        }

        long g1 = 0;
        long g2 = 1;
        long g3 = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(g1 + " ");
            } else if (i == 2) {
                System.out.print(g2 + " ");
            } else if (i == 3) {
                System.out.print(g3 + " ");
            } else {
                long siguiente = g1 + g2 + g3;
                System.out.print(siguiente + " ");
                g1 = g2;
                g2 = g3;
                g3 = siguiente;
            }
        }

        System.out.println();
    }

    // EJERCICIO 13: DECISIONES ANIDADAS
    public static void ejercicio13() {
        int opcion;

        do {
            System.out.println("\n--- EJERCICIO 13 ---");
            System.out.println("1. Biblioteca Lectura Rapida");
            System.out.println("2. Supermercado Fresh Market");
            System.out.println("3. Tienda ElectroZone");
            System.out.println("0. Volver al menu principal");

            opcion = ingresarEntero("Seleccione una opcion: ");

            switch (opcion) {
                case 1: ejercicio13A(); break;
                case 2: ejercicio13B(); break;
                case 3: ejercicio13C(); break;
                case 0: break;
                default: System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);
    }

    public static void ejercicio13A() {
        int diasRetraso = ingresarEntero("Ingrese los dias de retraso: ");
        int numeroCarnet = ingresarEntero("Ingrese el numero de carnet del usuario: ");
        double valorLibro = ingresarReal("Ingrese el valor del libro: ");

        double porcentajeMulta;

        if (diasRetraso > 5) {
            if (numeroCarnet % 2 == 0) {
                porcentajeMulta = 0.10;
            } else {
                porcentajeMulta = 0.15;
            }
        } else {
            if (numeroCarnet % 2 == 0) {
                porcentajeMulta = 0.05;
            } else {
                porcentajeMulta = 0.08;
            }
        }

        double valorMulta = valorLibro * porcentajeMulta;
        System.out.println("El valor de la multa es: $" + valorMulta);
    }

    public static void ejercicio13B() {
        System.out.print("Es miembro VIP? (true/false): ");
        boolean esVIP = scanner.nextBoolean();

        double kilos = ingresarReal("Ingrese los kilos comprados: ");
        double totalAntes = ingresarReal("Ingrese el valor total antes del descuento: ");

        double porcentajeDescuento = 0.0;

        if (esVIP) {
            if (kilos > 5) {
                porcentajeDescuento = 0.15;
            } else if (kilos >= 3) {
                porcentajeDescuento = 0.10;
            } else {
                porcentajeDescuento = 0.05;
            }
        } else {
            if (kilos > 5) {
                porcentajeDescuento = 0.05;
            } else if (kilos >= 3) {
                porcentajeDescuento = 0.02;
            } else {
                porcentajeDescuento = 0.00;
            }
        }

        double valorDescuento = totalAntes * porcentajeDescuento;
        double precioFinal = totalAntes - valorDescuento;

        System.out.println("Total antes del descuento: $" + totalAntes);
        System.out.println("Valor del descuento: $" + valorDescuento);
        System.out.println("Precio final con descuento: $" + precioFinal);
    }

    public static void ejercicio13C() {
        int tipoCliente = ingresarEntero(
                "Ingrese el tipo de cliente (1: Fiel, 2: Nuevo): ");
        double montoCompra = ingresarReal("Ingrese el monto total de la compra: ");

        double porcentajeBonificacion = 0.0;

        if (tipoCliente == 1) {
            if (montoCompra > 2000000) {
                porcentajeBonificacion = 0.20;
            } else if (montoCompra >= 1000000) {
                porcentajeBonificacion = 0.10;
            } else {
                porcentajeBonificacion = 0.05;
            }
        } else if (tipoCliente == 2) {
            if (montoCompra > 2000000) {
                porcentajeBonificacion = 0.10;
            } else if (montoCompra >= 1000000) {
                porcentajeBonificacion = 0.05;
            } else {
                porcentajeBonificacion = 0.00;
            }
        } else {
            System.out.println("Tipo de cliente no valido.");
            return;
        }

        double ahorro = montoCompra * porcentajeBonificacion;
        double totalAPagar = montoCompra - ahorro;

        System.out.println("Total a pagar con bonificacion: $" + totalAPagar);
        System.out.println("Monto ahorrado: $" + ahorro);
    }

    // EJERCICIO 14: EJEMPLOS DE IMPRESION
    public static void ejercicio14() {
        System.out.println("\n--- CODIGO A ---");
        System.out.println("1");
        System.out.println("12");
        System.out.println("123");
        System.out.println("1234");

        System.out.println("\n--- CODIGO B ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("*****");
        }

        System.out.println("\n--- CODIGO C ---");
        System.out.println("1235813");

        System.out.println("\n--- CODIGO D ---");
        System.out.println("6666");
    }
}
