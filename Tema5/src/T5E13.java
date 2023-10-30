import java.util.Scanner;

public class T5E13 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int algo = 0;
        salir:
        while (algo == 0) {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            int numero = lector.nextInt();
            switch (numero) {
                case 1:
                    System.out.println("Sumar");
                    break;
                case 2:
                    System.out.println("Restar");
                    break;
                case 3:
                    System.out.println("Multiplicar");
                    break;
                case 4:
                    System.out.println("Dividir");
                    break;
                case 0:
                    System.out.println("Salir");
                    break salir;
                default:
                    System.out.println("Numero erroneo");
                    break;
            }
        }
        lector.close();
    }
}