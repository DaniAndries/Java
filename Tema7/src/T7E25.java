import java.util.Scanner;

public class T7E25 {
    public static double perimetroRectangulo(double ancho, double alto) {
        return ancho * 2 + alto * 2;
    }

    public static double areaRectangulo(double ancho, double alto) {
        return ancho * alto;
    }


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ancho: ");
        double ancho = lector.nextDouble();

        System.out.print("Alto: ");
        double alto = lector.nextDouble();

        System.out.println("Perímetro: " + perimetroRectangulo(ancho, alto));
        System.out.println("Área: " + areaRectangulo(ancho, alto));
    }
}
