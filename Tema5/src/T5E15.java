import java.util.Scanner;

public class T5E15 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.println("Introduce un número");
            numero = lector.nextInt();
        } while (numero < 1 || numero > 9);

        for (int i = 0; i < 10; i++) {
            System.out.println(numero * i);
        }
        lector.close();
    }
}