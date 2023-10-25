import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Integer numero1;
        Integer numero2;
        Integer numero3;

        System.out.println("Indique tres numeros");

        Scanner lector = new Scanner(System.in);

        numero1 = lector.nextInt();
        numero2 = lector.nextInt();
        numero3 = lector.nextInt();

        Integer calculo = (numero1 + numero2) * numero3;

        System.out.println(calculo);
        lector.close();
    }
}