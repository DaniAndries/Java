import java.util.Scanner;

public class T5E22 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero1 = lector.nextInt();
        int numero2 = lector.nextInt();

        for (int i = numero1; i < numero2; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " es multiplo de 3");
            }
        }
        lector.close();
    }
}