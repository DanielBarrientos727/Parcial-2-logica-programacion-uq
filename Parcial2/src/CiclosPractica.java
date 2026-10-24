
public class CiclosPractica {

    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 1: Restar múltiplos de 3 ===");
        ejercicio1DoWhile();
        ejercicio1For();

        System.out.println("\n=== EJERCICIO 2: Cubos del 1 al 10 ===");
        ejercicio2DoWhile();
        ejercicio2For();

        System.out.println("\n=== EJERCICIO 3: Sumar cuadrados del 1 al 15 ===");
        ejercicio3DoWhile();
        ejercicio3For();

        System.out.println("\n=== EJERCICIO 4: Factorial de 8 ===");
        ejercicio4DoWhile();
        ejercicio4For();

        System.out.println("\n=== EJERCICIO 5: Sumar múltiplos de 5 ===");
        ejercicio5DoWhile();
        ejercicio5For();

        System.out.println("\n=== EJERCICIO 6: Serie de fracciones ===");
        ejercicio6DoWhile();
        ejercicio6For();

        System.out.println("\n=== EJERCICIO 7: Cuadrados de pares ===");
        ejercicio7DoWhile();
        ejercicio7For();
    }

    // 1. Restar múltiplos de 3 desde 90 hasta 3
    public static void ejercicio1DoWhile() {
        int numero = 90;
        do {
            System.out.println(numero);
            numero = numero - 3;
        } while (numero >= 3);
    }

    public static void ejercicio1For() {
        for (int numero = 90; numero >= 3; numero = numero - 3) {
            System.out.println(numero);
        }
    }

    // 2. Imprimir el cubo de los números del 1 al 10
    public static void ejercicio2DoWhile() {
        int numero = 1;
        do {
            System.out.println(numero * numero * numero);
            numero = numero + 1;
        } while (numero <= 10);
    }

    public static void ejercicio2For() {
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println(numero * numero * numero);
        }
    }

    // 3. Sumar los cuadrados del 1 al 15
    public static void ejercicio3DoWhile() {
        int numero = 1;
        int suma = 0;
        do {
            suma = suma + numero * numero;
            numero = numero + 1;
        } while (numero <= 15);
        System.out.println("Suma: " + suma);
    }

    public static void ejercicio3For() {
        int suma = 0;
        for (int numero = 1; numero <= 15; numero++) {
            suma = suma + numero * numero;
        }
        System.out.println("Suma: " + suma);
    }

    // 4. Calcular el factorial de 8
    public static void ejercicio4DoWhile() {
        int numero = 1;
        int factorial = 1;
        do {
            factorial = factorial * numero;
            numero = numero + 1;
        } while (numero <= 8);
        System.out.println("Factorial: " + factorial);
    }

    public static void ejercicio4For() {
        int factorial = 1;
        for (int numero = 1; numero <= 8; numero++) {
            factorial = factorial * numero;
        }
        System.out.println("Factorial: " + factorial);
    }

    // 5. Sumar los múltiplos de 5 entre 1 y 50
    public static void ejercicio5DoWhile() {
        int numero = 5;
        int suma = 0;
        do {
            suma = suma + numero;
            numero = numero + 5;
        } while (numero <= 50);
        System.out.println("Suma: " + suma);
    }

    public static void ejercicio5For() {
        int suma = 0;
        for (int numero = 5; numero <= 50; numero = numero + 5) {
            suma = suma + numero;
        }
        System.out.println("Suma: " + suma);
    }

    // 6. Sumar la serie 1/1 + 1/2 + ... + 1/10
    public static void ejercicio6DoWhile() {
        int numero = 1;
        double suma = 0;
        do {
            suma = suma + 1.0 / numero;
            numero = numero + 1;
        } while (numero <= 10);
        System.out.println("Suma de la serie: " + suma);
    }

    public static void ejercicio6For() {
        double suma = 0;
        for (int numero = 1; numero <= 10; numero++) {
            suma = suma + 1.0 / numero;
        }
        System.out.println("Suma de la serie: " + suma);
    }

    // 7. Sumar los cuadrados de los pares del 2 al 20
    public static void ejercicio7DoWhile() {
        int numero = 2;
        int suma = 0;
        do {
            suma = suma + numero * numero;
            numero = numero + 2;
        } while (numero <= 20);
        System.out.println("Suma: " + suma);
    }

    public static void ejercicio7For() {
        int suma = 0;
        for (int numero = 2; numero <= 20; numero = numero + 2) {
            suma = suma + numero * numero;
        }
        System.out.println("Suma: " + suma);
    }
}
