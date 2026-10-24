import java.util.Scanner;

public class DescuentoTienda {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿La compra es mayor a $100.000? (true/false): ");
        boolean condicion1 = sc.nextBoolean();

        System.out.print("¿El cliente tiene membresía? (true/false): ");
        boolean condicion2 = sc.nextBoolean();

        System.out.print("¿Es un cliente frecuente? (true/false): ");
        boolean condicion3 = sc.nextBoolean();

        System.out.print("¿Tiene cupón de descuento? (true/false): ");
        boolean condicion4 = sc.nextBoolean();

        System.out.print("¿La compra supera $200.000? (true/false): ");
        boolean condicion5 = sc.nextBoolean();

        if (condicion1) {
            if (condicion2) {
                if (condicion4) {
                    System.out.println("a: Descuento del 20%.");
                }
            } else {
                System.out.println("b: Descuento del 5%.");
            }
        } else {
            if (condicion3) {
                if (condicion5) {
                    System.out.println("c: Descuento del 15%.");
                } else {
                    System.out.println("d: Descuento del 10%.");
                }
            }
        }

        sc.close();
    }
}