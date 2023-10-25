import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        System.out.println("Indique cuántas pintas se ha tomado");

        Scanner lector = new Scanner(System.in);

        Integer pintas = lector.nextInt();

        Double calculo = pintas * 0.473176;

        System.out.println("Usted ha consumido " + calculo + " litros");
        lector.close();

    }
}
