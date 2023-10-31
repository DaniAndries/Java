import java.util.Scanner;

public class T5E37 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int mayor = -999999999;
        int cantidad;
        int entradas;
        System.out.print("Cantidad de entradas a la venta: ");
        cantidad = lector.nextInt();

        do {
            System.out.println("Hay a la venta, " + cantidad + " de entradas");
            System.out.print("Cuantas entradas quieres comprar: ");
            entradas = lector.nextInt();

            while (entradas > 10 || entradas < 0) {
                System.out.println("No puedes comprar mas de diez entradas");
                System.out.print("Introduce de nuevo la cantidad: ");
                entradas = lector.nextInt();
                continue;
            }

            if (entradas > mayor) {
                mayor = entradas;
            }

            cantidad = cantidad - entradas;

        } while (cantidad > 0);
        System.out.println("La mayor cantidad de entradas vendidas: " + mayor);
        lector.close();

    }
}
