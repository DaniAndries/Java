package PrimeraParte.T6D;

import java.util.Scanner;

public class T6D1 {
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
        System.out.printf("%.2f unidades \n", punto1.distancia(punto3));
        System.out.printf("%.2f unidades \n", punto2.distancia(punto1));
        System.out.printf("%.2f unidades \n", punto3.distancia(punto2));


    }
}
