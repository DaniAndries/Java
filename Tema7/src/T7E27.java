import java.util.Scanner;

public class T7E27 {
    public static long sumaIntervalo(long numero1, long numero2) {
        int intervalo = 0;
        if (numero2 < numero1 || numero1 < 0 || numero2 < 0) return -1;
        else {
            for (long i = numero1; i < numero2; i++) {
                intervalo += i;
            }
            return intervalo;
        }
    }


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        long numero1 = lector.nextLong();
        long numero2 = lector.nextLong();

        System.out.println(sumaIntervalo(numero1, numero2));
    }
}
