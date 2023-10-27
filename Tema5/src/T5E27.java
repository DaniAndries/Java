import java.util.Scanner;

public class T5E27 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();
        if (numero < 0) {
            System.out.println("*");
        }
        for (int i = 0; i < numero; i++) {
            System.out.print("* ");
        }
        System.out.println("");
        lector.close();
    }
}