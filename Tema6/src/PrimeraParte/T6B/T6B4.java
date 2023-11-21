package PrimeraParte.T6B;

import java.util.Scanner;

class Articulo {
    String nombre;
    double precio;
    static final int iva = 21;
    int cuantosQuedan;

    public Articulo(String nombre, double precio, int cuantosQuedan){
        this.nombre = nombre;
        if (precio < 0) System.err.println("Parametro inválido");
        else this.precio = precio;
        if (cuantosQuedan < 0) System.err.println("Parametro inválido");
        this.cuantosQuedan = cuantosQuedan;
    }

}

public class T6B4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Articulo articulo = new Articulo(lector.nextLine(), lector.nextDouble(), lector.nextInt());

        double iva = articulo.precio * ((double) Articulo.iva / 100);

        double pvp = articulo.precio + iva;

        System.out.println(articulo.nombre + " - Precio:" + articulo.precio + " - IVA:" + Articulo.iva + " - PVP:" + pvp + " - Quedan:" + articulo.cuantosQuedan);

        System.out.println("Indique otro precio:");
        articulo.precio = lector.nextDouble();

        iva = articulo.precio * ((double) Articulo.iva / 100);
        pvp = articulo.precio + iva;

        System.out.println(articulo.nombre + " - Precio:" + articulo.precio + " - IVA:" + Articulo.iva + " - PVP:" + pvp + " - Quedan:" + articulo.cuantosQuedan);

    }
}
