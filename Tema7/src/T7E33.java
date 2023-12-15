import java.util.Scanner;

public class T7E33 {
    public static int divisores(int numero) {
        int contador =0;
        if (numero < 0) return -1;
        for (int i = 1; i <= numero; i++) {
            if (numero%i == 0) contador++;
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Indique un número: ");
        int numero = lector.nextInt();
        System.out.println(divisores(numero));
    }
}
