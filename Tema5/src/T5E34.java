import java.util.Scanner;

public class T5E34 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = lector.nextInt();
        System.out.println("Los dígitos del número son:");
        while (numero != 0) {
            int digito = numero % 10;
            System.out.println(digito);
            numero = numero / 10;
        }
        lector.close();
    }
}
