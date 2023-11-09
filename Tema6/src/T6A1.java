class Punto {
    int x;
    int y;
}

public class T6A1 {
    public static void main(String[] args) {

        Punto punto1 = new Punto();
        Punto punto2 = new Punto();

        Punto punto3 = new Punto();

        punto1.x = 5;
        punto1.y = 0;
        punto2.x = 10;
        punto2.y = 10;
        punto3.x = -3;
        punto3.y = 7;

        System.out.println(" ");
        System.out.println("Primera parte: ");
        System.out.println("(" + punto1.x + "," + punto1.y + ")");
        System.out.println("(" + punto2.x + "," + punto2.y + ")");
        System.out.println("(" + punto3.x + "," + punto3.y + ")");

        punto1.x = 2 + 5;
        punto1.y = 5 * 8;
        punto2.x = 7 / 10;
        punto2.y = 90 * 10;
        punto3.x = 8 / -3;
        punto3.y = 4 - 7;

        System.out.println(" ");
        System.out.println("Segunda parte: ");
        System.out.println("(" + punto1.x + "," + punto1.y + ")");
        System.out.println("(" + punto2.x + "," + punto2.y + ")");
        System.out.println("(" + punto3.x + "," + punto3.y + ")");

    }
}
