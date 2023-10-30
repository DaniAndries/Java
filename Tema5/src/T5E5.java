import java.util.Scanner;

public class T5E5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();
        if (numero < 0)
            System.out.println("El numero introducino no es positivo");
        else {
            int factorial = 1;
            int contador = 1;
            while (contador <= numero) {
                factorial = factorial * contador;
                contador = contador + 1;
            }
            System.out.println(numero + " " + factorial);
        }
        lector.close();
    }
}