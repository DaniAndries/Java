import java.util.Scanner;

public class T5E21 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();
        int contador = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                contador = contador + 1;
            }
        }
        if (contador > 2) {
            System.out.println("No es Primo");
        } else {
            System.out.println("Es primo");
        }
        lector.close();
    }
}