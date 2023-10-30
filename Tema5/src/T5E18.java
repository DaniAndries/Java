import java.util.Scanner;

public class T5E18 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = 2;
        while (numero % 5 != 0) {
            numero = lector.nextInt();
        }
        if (numero >= 500) {
            int b500 = numero / 500;
            numero = numero % 500;
            System.out.println("500 " + b500);
        }
        if (numero >= 200) {
            int b200 = numero / 200;
            numero = numero % 200;
            System.out.println("200 " + b200);
        }
        if (numero >= 100) {
            int b100 = numero / 100;
            numero = numero % 100;
            System.out.println("100 " + b100);
        }
        if (numero >= 50) {
            int b50 = numero / 50;
            numero = numero % 50;
            System.out.println("50 " + b50);
        }
        if (numero >= 20) {
            int b20 = numero / 20;
            numero = numero % 20;
            System.out.println("20 " + b20);
        }
        if (numero >= 10) {
            int b10 = numero / 10;
            numero = numero % 10;
            System.out.println("10 " + b10);
        }
        if (numero >= 5) {
            int b5 = numero / 5;
            numero = numero % 5;
            System.out.println("5 " + b5);
        }
        lector.close();
    }
}