package T6C;

import java.util.Scanner;

class Articulo {
    private String nombre;
    private double precio;
    private static final int iva = 21;
    private int cuantosQuedan;

    public Articulo(String nombre, double precio, int cuantosQuedan){
        this.nombre = nombre;
        if (precio < 0) System.err.println("Parametro inválido");
        else this.precio = precio;
        if (cuantosQuedan < 0) System.err.println("Parametro inválido");
        this.cuantosQuedan = cuantosQuedan;
    }

    public int getIVA(){
        return iva;
    }
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if(precio<0){
            this.precio = 0;
            System.err.println("Parámetro inválido");
        }
        else this.precio = precio;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        if(cuantosQuedan < 0){
            this.cuantosQuedan = 0;
            System.err.println("Parámetro inválido");
        }
        else this.cuantosQuedan = cuantosQuedan;
    }
}

public class T6C4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Articulo articulo = new Articulo(lector.nextLine(), lector.nextDouble(), lector.nextInt());

        double iva = articulo.getPrecio() * ((double) articulo.getIVA() / 100);

        double pvp = articulo.getPrecio() + iva;

        System.out.println(articulo.getNombre() + " - Precio:" + articulo.getPrecio() + " - IVA:" + articulo.getIVA() + " - PVP:" + pvp + " - Quedan:" + articulo.getCuantosQuedan());

        System.out.println("Indique otro precio:");
        articulo.setPrecio(lector.nextDouble());

        iva = articulo.getPrecio() * ((double) articulo.getIVA() / 100);
        pvp = articulo.getPrecio() + iva;

        System.out.println(articulo.getNombre() + " - Precio:" + articulo.getPrecio() + " - IVA:" +  " - PVP:" + pvp + " - Quedan:" + articulo.getCuantosQuedan());

    }
}
