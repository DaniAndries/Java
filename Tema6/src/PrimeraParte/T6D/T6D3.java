package PrimeraParte.T6D;

import java.util.Scanner;

class Rectangulo {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        if (x1 > x2 && y1 > y2) {
            System.err.println("ERROR al instanciar Rectángulo...");
        }
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        if (x1 > this.x2) System.err.println("Parámetro inválido");
        else this.x1 = x1;

    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        if (y1 > this.y2) System.err.println("Parámetro inválido");
        else this.y1 = y1;

    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setX1Y1(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    public void setX2Y2(int x2, int y2) {
        this.x2 = x2;
        this.y2 = y2;
    }

    public void setAll(int x1, int y1, int x2, int y2) {
        if (x1 > this.x2) System.err.println("Parámetro inválido");
        else this.x1 = x1;
        if (y1 > this.y2) System.err.println("Parámetro inválido");
        else this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Calcula el perímetro del rectángulo
     * @return Devuelve el perímetro del rectángulo
     */
    public int getPerimetro() {
        int lado = this.x2 - this.x1;
        int altura = this.y2 - this.y1;

        return (altura * lado);
    }

    /**
     * Calcula el area del rectángulo
     * @return devuelve el area del rectángulo
     */
    public int getArea() {
        int lados = this.x2 - this.x1;
        int altura = this.y2 - this.y1;

        return ((lados * 2) + (altura * 2));
    }

    public void imprimir(){
        System.out.println("Lados: " + getPerimetro() + " área: " + getArea());
    }
}

public class T6D3 {
    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo rectangulo2 = new Rectangulo(7, 9, 2, 3);

        Scanner lector = new Scanner(System.in);

        int contador = 0;

        do {

            rectangulo1.imprimir();
            rectangulo2.imprimir();

            System.out.println();

            System.out.println("Modifica las coordenadas");

            System.out.println("Coordenadas del 1er Rectángulo:");

            rectangulo2.setAll(lector.nextInt(), lector.nextInt(), lector.nextInt(), lector.nextInt());

            System.out.println("Coordenadas del 2ndo Rectángulo:");

            rectangulo2.setAll(lector.nextInt(), lector.nextInt(), lector.nextInt(), lector.nextInt());

            contador++;

        } while (contador != 2);
    }
}

