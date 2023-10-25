import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Indique un número");
        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();
        if (numero < 0)
            System.out.println("El número es negativo");
        else
            System.out.println("El número es positivo");
        lector.close();
    }
}