import java.util.Scanner;

public class T7E23 {

    public static double millasKilometros(int millas) {
        return millas * 1.60934;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int millas = lector.nextInt();

        double kilometros = millasKilometros(millas);

        System.out.println(kilometros);
    }
}
