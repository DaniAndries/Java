import java.util.Scanner;

class Rectangulo {
    double x1;
    double y1;
    double x2;
    double y2;
}

public class T6A3 {
    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo();

        Scanner lector = new Scanner(System.in);

        double lado1 = 0;
        double lado2 = 0;
        double altura1 = 0;
        double altura2 = 0;

        rectangulo1.x1 = 0;
        rectangulo1.y1 = 0;
        rectangulo1.x2 = 5;
        rectangulo1.y2 = 5;

        rectangulo2.x1 = 7;
        rectangulo2.y1 = 9;
        rectangulo2.x2 = 2;
        rectangulo2.y2 = 3;

        int contador = 0;

        do {

            if (rectangulo1.x1 > rectangulo1.x2) {
                lado1 = rectangulo1.x1 - rectangulo1.x2;
            } else {
                lado1 = rectangulo1.x2 - rectangulo1.x1;
            }

            if (rectangulo1.y1 > rectangulo1.y2) {
                altura1 = rectangulo1.y1 - rectangulo1.y2;
            } else {
                altura1 = rectangulo1.y2 - rectangulo1.y1;
            }

        double lados1 = lado1 + lado1 + altura1 + altura1;
        double perimetro1=altura1*lado1;


            if (rectangulo2.x1 > rectangulo2.x2) {
                lado2 = rectangulo2.x1 - rectangulo2.x2;
            } else {
                lado2 = rectangulo2.x2 - rectangulo2.x1;
            }

            if (rectangulo2.y1 > rectangulo2.y2) {
                altura2 = rectangulo2.y1 - rectangulo2.y2;
            } else {
                altura2 = rectangulo2.y2 - rectangulo2.y1;
            }

        double lados2 = lado2 + lado2 + altura2 + altura2;
        double perimetro2 = altura2*lado2;

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
