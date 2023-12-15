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
        GregorianCalendar calendario = new GregorianCalendar();
        return calendario.isLeapYear(año);
    }

    /**
     * Calcula los días pasados desde el inicio de año hasta el día indicado
     * @param año Año indicado
     * @param mes Mes indicado
     * @return Devuelve los días pasados
     */
    public static int diasPasados (int año, int mes){
        Scanner lector = new Scanner(System.in);
        int diasPasados = 0;
        for (int i = 0; i <= mes; i++) {
            diasPasados += calcularDiasMes(año, i);
        }
        System.out.print("Indique el día exacto: ");
        int diaExacto = lector.nextInt();

        diaExacto =calcularDiasMes(año, mes) - diaExacto;

        diasPasados = diasPasados - diaExacto;

        return diasPasados;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Indique el año: ");
        int año = lector.nextInt();
        System.out.print("Indique el mes: ");
        int mes = lector.nextInt();

        System.out.println("Tiene " + calcularDiasMes(año, mes) + " días");
        System.out.println("Han pasado " + diasPasados(año, mes) + " días desde el 1 de enero");
    }
}
