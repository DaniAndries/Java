package SegundaParte;

import PrimeraParte.T6D.Punto;

class Triangulo {
    private Punto p1, p2, p3;

    public Triangulo(Punto p1, Punto p2, Punto p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void perimetro() {
        System.out.println(this.p1.distancia(this.p2) + this.p2.distancia(this.p3) + this.p3.distancia(this.p1));
    }
}

public class T6E1 {
    public static void main(String[] args) {
        Punto punto1 = new Punto(8, 9);
        Punto punto2 = new Punto(1, 6);
        Punto punto3 = new Punto(4, 7);

        Triangulo triangulo1 = new Triangulo(punto1, punto2, punto3);

        triangulo1.perimetro();
    }
}
