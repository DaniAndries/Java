import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class T5E32 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int contador = 0;
        int aleatorio = 0;
        while (aleatorio != 5) {
            aleatorio = ThreadLocalRandom.current().nextInt(1, 7);
            System.out.println(aleatorio);
            contador = contador + 1;
        }
        System.out.println("Se ha lanzado: " + contador + " veces");
        lector.close();
    }
}
