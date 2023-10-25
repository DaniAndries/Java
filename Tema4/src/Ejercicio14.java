import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("Indique su calificación");
        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();
        switch (numero) {
            case 0, 1, 2:
                System.out.println("Muy deficiente");
                break;
            case 3, 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Bien");
                break;
            case 6, 7, 8:
                System.out.println("Notable");
                break;
            case 9, 10:
                System.out.println("Sobresaliente");
                break;
            default:
            System.out.println("ERROR: La nota es incorrecta.");
        }
        lector.close();
    }
}