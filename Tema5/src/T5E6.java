import java.util.Scanner;

public class T5E6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int numero = lector.nextInt();
            if (numero < 0)
                System.out.println("negativo");
            else
                System.out.println("Positivo");
        }
        lector.close();
    }
}