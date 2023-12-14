import java.util.GregorianCalendar;
import java.util.Scanner;

public class T7E31 {
    public static int calcularDiasMes(int año, int mes) {
        int numeroDias = -1;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                if (esBisiesto(año)) {
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
                break;
        }
        return numeroDias;
    }

    /**
     * Indica si un año es bisiesto o no
     *
     * @param año Año
     * @return True = Es bisiesto
     */
    public static boolean esBisiesto(int año) {
        GregorianCalendar calendar = new GregorianCalendar();
        return calendar.isLeapYear(año);
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int año = lector.nextInt();
        int mes = lector.nextInt();

        System.out.println(calcularDiasMes(año, mes));
    }
}
