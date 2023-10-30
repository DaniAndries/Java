import java.util.Scanner;

public class T5E4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.print(i + " ");
        }
        lector.close();
    }
}