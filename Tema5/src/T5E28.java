import java.util.Scanner;

public class T5E28 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();
        while (numero < 0 || numero > 20) {
            System.out.println("Numero inválido");
            numero = lector.nextInt();
        }
        for (int i = 0; i < numero + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        lector.close();
    }
}