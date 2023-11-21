package PrimeraParte.T6C;

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
}

public class T6C3 {
    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo rectangulo2 = new Rectangulo(7, 9, 2, 3);

        Scanner lector = new Scanner(System.in);

        int lado1;
        int lado2;
        int altura1;
        int altura2;

        int contador = 0;

        do {

            lado1 = rectangulo1.getX2() - rectangulo1.getX1();

            altura1 = rectangulo1.getY2() - rectangulo1.getY1();

            int lados1 = lado1 + lado1 + altura1 + altura1;
            int perimetro1 = altura1 * lado1;

            lado2 = rectangulo2.getX2() - rectangulo2.getX1();

            altura2 = rectangulo2.getY2() - rectangulo2.getY1();

            int lados2 = lado2 + lado2 + altura2 + altura2;
            int perimetro2 = altura2 * lado2;

            System.out.println("Rectángulo 1. Lados: " + lados1 + " área: " + perimetro1);
            System.out.println("Rectángulo 2. Lados: " + lados2 + " área: " + perimetro2);

            System.out.println();

            System.out.println("Modifica las coordenadas");

            System.out.println("Coordenadas del 1er Rectángulo:");

            System.out.print("X2: ");
            rectangulo1.setX2(lector.nextInt());

            System.out.print("Y2: ");
            rectangulo1.setY2(lector.nextInt());

            System.out.print("X1: ");
            rectangulo1.setX1(lector.nextInt());

            System.out.print("Y1: ");
            rectangulo1.setY1(lector.nextInt());

            System.out.println("Coordenadas del 2ndo Rectángulo:");

            System.out.print("X2: ");
            rectangulo2.setX2(lector.nextInt());

            System.out.print("Y2: ");
            rectangulo2.setY2(lector.nextInt());

            System.out.print("X1: ");
            rectangulo2.setX1(lector.nextInt());

            System.out.print("Y1: ");
            rectangulo2.setY1(lector.nextInt());

            contador++;

        } while (contador != 2);
    }
}

