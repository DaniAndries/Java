import java.util.Scanner;

class Articulo {
    String nombre;
    double precio;
    double iva;
    int cuantosQuedan;
}

public class T6A4 {
    public static void main(String[] args) {
        Articulo articulo = new Articulo();
        Scanner lector = new Scanner(System.in);

        System.out.println("Indique el nombre del producto:");
        articulo.nombre = lector.nextLine();
        System.out.println("Indique el precio del producto:");
        articulo.precio = lector.nextDouble();
        System.out.println("Indique el IVA del producto:");
        articulo.iva = lector.nextDouble();
        System.out.println("Indique cuántos quedan");
        articulo.cuantosQuedan = lector.nextInt();

        double iva = articulo.precio * (articulo.iva / 100);

        double pvp = articulo.precio + iva;

        System.out.println(articulo.nombre+" - Precio:"+articulo.precio+" - IVA:"+articulo.iva+" - PVP:"+pvp+" - Quedan:"+articulo.cuantosQuedan);

        System.out.println("Indique otro precio:");
        articulo.precio = lector.nextDouble();

        iva = articulo.precio * (articulo.iva / 100);
        pvp = articulo.precio + iva;

        System.out.println(articulo.nombre+" - Precio:"+articulo.precio+" - IVA:"+articulo.iva+" - PVP:"+pvp+" - Quedan:"+articulo.cuantosQuedan);

    }
}
