import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Indique dos números");
        Scanner lector = new Scanner(System.in);
        int numero1 = lector.nextInt();
        int numero2 = lector.nextInt();
        if (numero1 > numero2) {
            System.out.println("El número mayor es: " + numero1);
        } else {
            System.out.println("El número mayor es: " + numero2);
        }
        lector.close();
    }
}