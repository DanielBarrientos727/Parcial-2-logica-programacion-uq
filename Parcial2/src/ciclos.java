import java.util.Scanner;

public class ciclos {
    public static void main(String[] args){

        /*
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        */
        //While

        //primero ve si es verdad, si es verdad ejecuta y sigue normal,

        Scanner entrada = new Scanner(System.in);
        int i =1,contador;
        System.out.println("Digite por favor el numero que quieres en pantalla: ");
        contador = entrada.nextInt();

        while(i<=contador) {
            System.out.println(i);
            i+=2;

        }
    }
}
