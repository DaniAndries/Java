import java.util.Scanner;

public class T7E32 {
    public static void verificador() {
        Scanner lector = new Scanner(System.in);
        int numero = 0;
        boolean correcto = false;
        do {
            System.out.print("Indique un número: ");
            numero = lector.nextInt();
            if (numero < 1 || numero > 20) System.err.println("Numero inválido");
            else correcto = true;
        } while (!correcto);
        System.out.print("El factorial del número es: ");
        System.out.print(factorial(numero));
    }

    public static int factorial(int numero) {
        int factorial = 1;
        for (int i = numero; i > 0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        verificador();
    }
}
