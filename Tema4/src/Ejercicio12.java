import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Indique dos números");
        Scanner lector = new Scanner(System.in);
        int numero1 = lector.nextInt();
        int numero2 = lector.nextInt();
        if (numero1 > numero2)
            System.out.println("El mayor es: " + numero1);
        else if (numero2 > numero1)
            System.out.println("El mayor es: " + numero2);
        else if (numero1 == numero2)
            System.out.println("Ambos números son iguales");
        lector.close();
    }
}