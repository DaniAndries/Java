package SegundaParte;

class Triangulo {
    private int a1, a2, b1, b2, c1, c2;

    public Triangulo(int a1, int a2, int b1, int b2, int c1, int c2) {
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
        this.c1 = c1;
        this.c2 = c2;
    }

    public int perimetro() {
        int x = (int) Math.abs(Math.sqrt(Math.pow((this.b1 - this.a1), 2) + (Math.pow((this.b2 - this.a2), 2))));
        int y = (int) Math.abs(Math.sqrt(Math.pow((this.c1 - this.b1), 2) + (Math.pow((this.c2 - this.b2), 2))));
        int z = (int) Math.abs(Math.sqrt(Math.pow((this.a1 - this.c1), 2) + (Math.pow((this.a2 - this.b2), 2))));
        return (x + y + z);
    }
}

public class T6E1 {
    public static void main(String[] args) {
    Triangulo triangulo1 = new Triangulo(5,6,7,9,4,5);
        System.out.println(triangulo1.perimetro());
    }
}
