import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Indique tres números");
        Scanner lector = new Scanner(System.in);
        int numero1 = lector.nextInt();
        int numero2 = lector.nextInt();
        int numero3 = lector.nextInt();

        if (numero1 > numero2 && numero1 > numero3)
            System.out.println("El mayor es: " + numero1);
        else if (numero2 > numero1 && numero2 > numero3)
            System.out.println("El mayor es: " + numero2);
        else if (numero3 > numero1 && numero3 > numero2)
            System.out.println("El mayor es: " + numero3);
        lector.close();
    }
}