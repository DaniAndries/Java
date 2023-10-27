import java.util.Scanner;

public class T5E24 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero1 = lector.nextInt();

        for (int i = 1; i < numero1; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " es multiplo de 3");
            }
        }
        lector.close();
    }
}