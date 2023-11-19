package T6E;

import java.util.Scanner;

class Articulo {
    private String nombre;
    private double precio;
    private static final int iva = 21;
    private static final int ivaReducido = 10;
    private static final int ivaSuperReducido = 4;
    private int cuantosQuedan;
    private final int tipoIVA;

    public Articulo(String nombre, double precio, int cuantosQuedan, int tipoIVA) {
        this.nombre = nombre;
        if (precio < 0) System.err.println("Parametro inválido");
        else this.precio = precio;
        if (cuantosQuedan < 0) System.err.println("Parametro inválido");
        this.cuantosQuedan = cuantosQuedan;
        if (tipoIVA == 1) this.tipoIVA = iva;
        else if (tipoIVA == 2) this.tipoIVA = ivaReducido;
        else if (tipoIVA == 3) this.tipoIVA = ivaSuperReducido;
        else {
            System.err.println("Parametro inválido");
            this.tipoIVA = iva;
        }
    }

    /**
     * Te indica que tipo de impuesto se el aplica
     * @return Devuelve la cantidad de impuestos del producto.
     */
    public int getTipoIVA() {
        if (this.tipoIVA == 1) return iva;

        else if (this.tipoIVA == 2) return ivaReducido;

        return ivaSuperReducido;
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
        if (precio < 0) {
            this.precio = 0;
            System.err.println("Parámetro inválido");
        } else this.precio = precio;
    }


    public void setCuantosQuedan(int cuantosQuedan) {
        if (cuantosQuedan < 0) {
            this.cuantosQuedan = 0;
            System.err.println("Parámetro inválido");
        } else this.cuantosQuedan = cuantosQuedan;
    }

    /**
     * Calcula el precio una vez añadido el IVA
     *
     * @return Devuelve el precio una vez aplicado el IVA
     */
    public double getPVP() {
        double iva = this.precio * ((double) this.tipoIVA / 100);
        return (this.precio + iva);
    }

    /**
     * Calcula y aplica un descuento a unos productos
     *
     * @param descuento es la cantidad del descuento a aplicar
     * @return Devuelve el precio una vez aplicado el descuento
     */
    public double getPVPDescuento(int descuento) {
        return (this.precio - (this.precio * ((double) descuento / 100)));
    }

    /**
     * Resta una cantidad al inventario
     *
     * @param vender es la cantidad a restar
     * @return Devuelve un boolean dependiendo si se puede o no restar esa cantidad
     */
    public boolean vender(int vender) {
        if (this.cuantosQuedan - vender < 0) return false;
        else {
            this.cuantosQuedan = this.cuantosQuedan - vender;
            return true;
        }
    }

    /**
     * Añade más cantidad al inventario
     *
     * @param almacenar la cantidad a añadir
     * @return Devuelve true or false si se puede o no añadir más al inventario
     */
    public boolean almacenar(int almacenar) {
        if (this.cuantosQuedan + almacenar < 0) return false;
        else {
            this.cuantosQuedan = this.cuantosQuedan + almacenar;
            return true;
        }
    }

    public void imprimir() {
        System.out.println(this.nombre + " - Precio:" + this.precio + " - IVA:" + this.getTipoIVA() + " - PVP:" + this.getPVP() + " - Quedan:" + this.cuantosQuedan);
    }
}

public class T6E4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cree dos articulos empezando por el nombre, seguido del precio, la cantidad y el tipo de impuesto (1-21%, 2-10% y 3-4%)");
        Articulo articulo = new Articulo(lector.nextLine(), lector.nextDouble(), lector.nextInt(), lector.nextInt());
        Articulo articulo2 = new Articulo(lector.nextLine(), lector.nextDouble(), lector.nextInt(), lector.nextInt());

        articulo.imprimir();
        articulo2.imprimir();

        System.out.println("Indique otro precio:");
        articulo.setPrecio(lector.nextDouble());
        articulo2.setPrecio(lector.nextDouble());

        articulo.imprimir();
        articulo2.imprimir();

        System.out.println("Indique cuantos has vendido de cada producto");

        System.out.println(articulo.getNombre());
        articulo.vender(lector.nextInt());

        System.out.println(articulo2.getNombre());
        articulo2.vender(lector.nextInt());

        System.out.println("Indique cuantos has añadido al inventario de cada producto");

        System.out.println(articulo.getNombre());
        articulo.almacenar(lector.nextInt());

        System.out.println(articulo2.getNombre());
        articulo2.almacenar(lector.nextInt());

        articulo.imprimir();
        articulo2.imprimir();
    }
}
