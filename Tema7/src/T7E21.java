import java.util.Scanner;

public class T7E21 {
    public static int minimo(int a, int b){
        return (Math.min(a, b));
    }


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int numero1 = lector.nextInt();
        int numero2 = lector.nextInt();

        System.out.println(minimo(numero1, numero2));
    }
}
