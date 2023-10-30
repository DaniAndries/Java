import java.util.Scanner;

public class T5E29 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero1 = lector.nextInt();
        int numero2 = lector.nextInt();
        int contador = 0;
        for (int i = numero1; i < numero2 + 1; i++) {
            if (i % 2 == 0) {
                contador = contador + 1;
            }
            System.out.print(i + " ");
        }
        System.out.println("Han habido " + contador + " pares");
        lector.close();
    }
}