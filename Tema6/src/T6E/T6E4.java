package T6E;

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

    public double getPVP(){
        double iva = this.precio * ((double) this.getIVA() / 100);
        return (this.precio + iva);
    }

    public double getPVPDescuento(int descuento){
        return (this.precio-(this.precio * ((double) descuento/ 100)));
    }

    public boolean vender(int vender){
        if (this.cuantosQuedan - vender < 0) return false;
        else{
            this.cuantosQuedan = this.cuantosQuedan - vender;
            return true;
        }
    }

    public boolean almacenar(int almacenar){
        if (this.cuantosQuedan + almacenar < 0) return false;
        else{
            this.cuantosQuedan = this.cuantosQuedan + almacenar;
            return true;
        }
    }

    public void imprimir(){
        System.out.println(this.nombre + " - Precio:" + this.precio + " - IVA:" + this.getIVA() + " - PVP:" + this.getPVP() + " - Quedan:" + this.cuantosQuedan);
    }
}

public class T6D4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Articulo articulo = new Articulo(lector.nextLine(), lector.nextDouble(), lector.nextInt());
        Articulo articulo2 = new Articulo(lector.nextLine(), lector.nextDouble(), lector.nextInt());


        articulo.imprimir();
        articulo2.imprimir();

        System.out.println("Indique otro precio:");
        articulo.setPrecio(lector.nextDouble());
        articulo2.setPrecio(lector.nextDouble());

        articulo.imprimir();
        articulo2.imprimir();



    }
}
