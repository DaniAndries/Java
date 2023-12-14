import java.util.Scanner;

public class T7E22 {
    public static int dimeSigno(int a) {
        return (a >= 0 ? 1 : -1);
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int numero = lector.nextInt();

        System.out.println(dimeSigno(numero));
    }
}
