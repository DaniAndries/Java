import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Indique dos números");
        Scanner lector = new Scanner(System.in);
        int numero1 = lector.nextInt();
        int numero2 = lector.nextInt();
        if (numero1 > numero2)
            System.out.println(numero2 + " , " + numero1);
        else
            System.out.println(numero1 + " , " + numero2);
        lector.close();
    }
}