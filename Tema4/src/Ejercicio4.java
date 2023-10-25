import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Indique primeramente el total de la cena y posteriormente el total de comensales");
        Scanner lector = new Scanner(System.in);

        Integer total = lector.nextInt();

        Integer comensal = lector.nextInt();

        Integer calculo = total / comensal;

        System.out.println("Tenéis que pagar " + calculo + " cada uno");
        lector.close();
    }
}