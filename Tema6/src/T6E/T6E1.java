package T6E;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Punto {
    private int x;
    private int y;


    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x_mod) {
        x = x_mod;
    }

    public void setY(int y_mod) {
        y = y_mod;
    }

    public void setXY(int x_mod, int y_mod) {
        x = x_mod;
        y = y_mod;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * Desplaza positiva o negativamente los parámetros
     * @param dx desplaza la x
     * @param dy desplaza la y
     */
    public void desplaza(int dx, int dy) {
        if (dx < 0) this.x = this.x - dx;
        else this.x = this.x + dx;
        if (dy < 0) this.y = this.y - dy;
        else this.y = this.y + dy;
    }

    /**
     * Calcula la distancia entre dos puntos distintos
     * @param p Algo
     * @return Devuelve el resultado del cálculo
     */
    public int distancia (Punto p) {
        return (int) Math.abs(Math.sqrt(Math.pow((p.x - this.x), 2) + (Math.pow((p.y - this.y), 2))));
    }

    public void imprimir() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }

    /**
     * Constructor de puntos aleatorios
     * @return Devuelve un punto con variables x e y aleatorias
     */
    public static Punto creaPuntoAleatorio(){
        int x = ThreadLocalRandom.current().nextInt(-100,100);
        int y = ThreadLocalRandom.current().nextInt(-100,100);
        return new Punto(x, y);
    }

}

public class T6E1 {
    public static void main(String[] args) {

        Punto punto1 = new Punto(5, 0);

        Punto punto2 = new Punto(10, 10);

        Punto punto3 = new Punto(3, 7);


        System.out.println(" ");
        System.out.println("Primera parte: ");

        punto1.imprimir();
        punto2.imprimir();
        punto3.imprimir();

        punto1.setX(punto1.getX() + punto2.getY());
        punto1.setY(punto1.getX() * punto2.getX());

        punto2.setX(punto3.getX() / punto3.getY());
        punto2.setY(punto2.getY() - punto3.getX());

        punto3.setXY(punto1.getX() + punto1.getY(), punto3.getY() + punto2.getX());

        System.out.println(" ");
        System.out.println("Segunda parte: ");

        punto1.imprimir();
        punto2.imprimir();
        punto3.imprimir();

        System.out.println(" ");
        System.out.println("Tecera parte: ");

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce los valores del punto1: ");
        punto1.setX(lector.nextInt());
        punto1.setY(lector.nextInt());

        System.out.println("Introduce los valores del punto2: ");
        punto2.setX(lector.nextInt());
        punto2.setY(lector.nextInt());

        System.out.println("Introduce los valores del punto3: ");
        punto3.setX(lector.nextInt());
        punto3.setY(lector.nextInt());

        lector.close();

        punto1.imprimir();
        punto2.imprimir();
        punto3.imprimir();

        System.out.println("Prueba de desplazamiento:");

        punto1.desplaza(4, 9);
        punto2.desplaza(-8, 2);
        punto3.desplaza(-2, 1);

        punto1.imprimir();
        punto2.imprimir();
        punto3.imprimir();

        System.out.println("Distancia entre puntos:");
        System.out.println(punto1.distancia(punto2));
        System.out.println(punto2.distancia(punto1));
        System.out.println(punto3.distancia(punto2));


        System.out.println("Puntos Aleatorios");
        Punto punto4 = Punto.creaPuntoAleatorio() ;
        punto4.imprimir();

        Punto punto5 = Punto.creaPuntoAleatorio() ;
        punto5.imprimir();

        Punto punto6 = Punto.creaPuntoAleatorio() ;
        punto6.imprimir();
    }
}
