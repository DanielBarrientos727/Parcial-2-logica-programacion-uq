
public class Reloj {
    public static void main(String[] args) throws InterruptedException {

        for (int segundo = 0; segundo < 60; segundo++) {
            System.out.println("Segundo: " + segundo);
            Thread.sleep(1000);
        }

    }
}
