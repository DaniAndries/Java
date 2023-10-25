import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Indique dos números");
        Scanner lector = new Scanner(System.in);
        int numero1 = lector.nextInt();
        int numero2 = lector.nextInt();
        int calculoSuma = numero1 + numero2;
        int calculoResta = numero1 - numero2;
        int calculoDivision = numero1 / numero2;
        int calculoProducto = numero1 * numero2;

        System.out.println("La suma de ambos número es: " + calculoSuma);
        System.out.println("La resta de ambos números es: " + calculoResta);
        System.out.println("El producto de ambos números es: " + calculoProducto);
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("ERROR - No se puede dividir entre 0");
        } else {
            System.out.println("La división de ambos números es: " + calculoDivision);
        }
        lector.close();
    }
}