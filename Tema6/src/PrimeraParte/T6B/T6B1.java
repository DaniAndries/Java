package PrimeraParte.T6B;


class Punto {
    int x;
    int y;


    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void modificaValores(int x_mod, int y_mod) {
        x = x_mod;
        y = y_mod;
    }
}

public class T6B1 {
    public static void main(String[] args) {

        Punto punto1 = new Punto(5, 0);

        Punto punto2 = new Punto(10, 10);

        Punto punto3 = new Punto(3, 7);


        System.out.println(" ");
        System.out.println("Primera parte: ");
        System.out.println("(" + punto1.x + "," + punto1.y + ")");
        System.out.println("(" + punto2.x + "," + punto2.y + ")");
        System.out.println("(" + punto3.x + "," + punto3.y + ")");

        punto1.modificaValores(punto1.x+ punto2.x, punto3.y* punto2.x);
        punto2.modificaValores(punto2.x- punto3.y, punto2.y/ punto1.x );
        punto3.modificaValores(punto3.y+ punto3.x, punto1.x- punto3.y );

        System.out.println(" ");
        System.out.println("Segunda parte: ");
        System.out.println("(" + punto1.x + "," + punto1.y + ")");
        System.out.println("(" + punto2.x + "," + punto2.y + ")");
        System.out.println("(" + punto3.x + "," + punto3.y + ")");

    }
}
