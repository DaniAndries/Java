import java.util.Scanner;

public class T7E26 {
    public static int sumatorio(int numero) {
        int sumatorio = 0;
        for (int i = 0; i < numero; i++) {
            sumatorio += i;
        }
        return sumatorio;
    }

    public static int producto(int numero) {
        int producto = 1;
        for (int i = 0; i < numero; i++) {
            producto *= i;
        }
        return producto;
    }

    public static double intermedio(int numero) {
        double intermedio = 0;
        for (int i = 0; i < numero; i++) {
            intermedio /= i;
        }
        return intermedio;
    }


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();

        System.out.println("Sumatorio: " + sumatorio(numero));
        System.out.println("Producto: " + producto(numero));
        System.out.println("Intermedio: " + intermedio(numero));
    }
}
