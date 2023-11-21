package PrimeraParte.T6B;

import java.util.Scanner;

class Rectangulo {
    int x1;
    int y1;
    int x2;
    int y2;


    public Rectangulo(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        if (x1 > x2 && y1 > y2) {
            System.err.println("ERROR al instanciar Rectángulo...");
        }
    }
}

    public class T6B3 {
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

                lado1 = rectangulo1.x2 - rectangulo1.x1;

                altura1 = rectangulo1.y2 - rectangulo1.y1;

                int lados1 = lado1 + lado1 + altura1 + altura1;
                int perimetro1 = altura1 * lado1;

                lado2 = rectangulo2.x2 - rectangulo2.x1;

                altura2 = rectangulo2.y2 - rectangulo2.y1;

                int lados2 = lado2 + lado2 + altura2 + altura2;
                int perimetro2 = altura2 * lado2;

                System.out.println("Rectángulo 1. Lados: " + lados1 + " área: " + perimetro1);
                System.out.println("Rectángulo 2. Lados: " + lados2 + " área: " + perimetro2);

                System.out.println("Modifica las coordenadas");

                System.out.println("Coordenadas del 1er Rectángulo:");

                System.out.print("X1: ");
                rectangulo1.x1 = lector.nextInt();

                System.out.print("Y1: ");
                rectangulo1.y1 = lector.nextInt();

                System.out.print("X2: ");
                rectangulo1.x2 = lector.nextInt();

                System.out.print("Y2: ");
                rectangulo1.y2 = lector.nextInt();

                System.out.println("Coordenadas del 2ndo Rectángulo:");

                System.out.print("X1: ");
                rectangulo2.x1 = lector.nextInt();

                System.out.print("Y1: ");
                rectangulo2.y1 = lector.nextInt();

                System.out.print("X2: ");
                rectangulo2.x2 = lector.nextInt();

                System.out.print("Y2: ");
                rectangulo2.y2 = lector.nextInt();

                contador++;

            } while (contador != 2);
        }
    }

