public class Main {
    public static void main(String[] args) {
        String texto1 = "Hola";
        String texto2 = "hola";
// Comparación sensible a mayúsculas y minúsculas
        if (texto1.equals(texto2)) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas son diferentes");
        }
    }
}