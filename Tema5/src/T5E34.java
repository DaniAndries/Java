import java.util.Scanner;

public class T5E34 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();
        while (numero > 0) {
            int digito = numero % 10;
            numero /= 10;
            System.out.print(digito + " ");

        }
        lector.close();
    }
}
