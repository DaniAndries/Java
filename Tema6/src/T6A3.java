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

        rectangulo1.x1 = 0;
        rectangulo1.y1 = 0;
        rectangulo1.x2 = 5;
        rectangulo1.y2 = 5;
        double lado1=rectangulo1.x1+ rectangulo1.y1;
        double area1 = rectangulo1.x2 + rectangulo1.y2;

        rectangulo2.x1 = 7;
        rectangulo2.y1 = 9;
        rectangulo2.x2 = 2;
        rectangulo2.y2 = 3;

        System.out.println("Rectángulo 1. Lados: "+lado1+" área: "+area1);
        System.out.println("Rectángulo 2. Lados: "+ rectangulo2.x1+rectangulo2.y1+" área: "+rectangulo2.x2*rectangulo2.y2);

    }
}
