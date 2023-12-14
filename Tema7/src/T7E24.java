import java.util.Scanner;

public class T7E24 {
    public static double precioConIva(double precio) {
        return precio + precio * 21 / 100;
    }


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce 5 precios");

        double precio1 = lector.nextDouble();
        double precio2 = lector.nextDouble();
        double precio3 = lector.nextDouble();
        double precio4 = lector.nextDouble();
        double precio5 = lector.nextDouble();

        System.out.println(precioConIva(precio1));
        System.out.println(precioConIva(precio2));
        System.out.println(precioConIva(precio3));
        System.out.println(precioConIva(precio4));
        System.out.println(precioConIva(precio5));
    }
}
