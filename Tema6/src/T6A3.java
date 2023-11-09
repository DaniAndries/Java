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

        double lado1 = rectangulo1.x1 - rectangulo1.x2;
        double altura1 = rectangulo1.y1 - rectangulo1.y2;
        double lados1 = lado1 + lado1 + altura1 + altura1;
        double perimetro1=altura1*lado1;

        rectangulo2.x1 = 7;
        rectangulo2.y1 = 9;
        rectangulo2.x2 = 2;
        rectangulo2.y2 = 3;

        double lado2 = rectangulo2.x1 - rectangulo2.x2;
        double altura2 = rectangulo2.y1 - rectangulo2.y2;
        double lados2 = lado2 + lado2 + altura2 + altura2;
        double perimetro2 = altura2*lado2;

        System.out.println("Rectángulo 1. Lados: " + lados1 + " área: " + perimetro1);
        System.out.println("Rectángulo 2. Lados: " + lados2 + " área: " + perimetro2);

    }
}
