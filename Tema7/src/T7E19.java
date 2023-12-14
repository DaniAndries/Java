import java.util.Scanner;

public class T7E19 {

    public static double multiplica(double a, double b) {
        return a * b;
    }


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double numero1 = lector.nextDouble();
        double numero2 = lector.nextDouble();

        System.out.println(multiplica(numero1, numero2));
    }
}
