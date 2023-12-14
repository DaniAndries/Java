import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class T7E29 {
    public static int aleatorio(int numero1, int numero2){
        if (numero1 < numero2 || numero1 < 0 || numero2 < 0) return -1;
        return ThreadLocalRandom.current().nextInt(numero1, numero2+1);
    }


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero1 = lector.nextInt();
        int numero2 = lector.nextInt();

        System.out.println(aleatorio(numero1, numero2));
    }
}
