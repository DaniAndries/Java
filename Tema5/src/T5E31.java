import java.util.Scanner;

public class T5E31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int año, mes, dia;

        do {
            System.out.println("Célculo del día de la semana");

            System.out.print("Escriba el número del día: ");
            dia = teclado.nextInt();

            System.out.print("Escriba el número del mes: ");
            mes = teclado.nextInt();

            System.out.print("Escriba el número del año (a partir de 1583): ");
            año = teclado.nextInt();

            if (año < 1583) {
                System.out.println("Año inválido");
                continue;
            }

            int A = (14 - mes) / 12;
            int B = año - A;
            int C = mes + (12 * A) - 2;
            int D = B / 4;
            int E = B / 100;
            int F = B / 400;
            int G = (C * 31) / 12;
            int H = dia + B + D - E + F + G;
            int I = H % 7;

            switch (I) {
                case 0:
                    System.out.println("El dia " + dia + " del mes " + mes + " del año " + año + " es" + " domingo");
                    break;

                case 1:
                    System.out.println("El dia " + dia + " del mes " + mes + " del año " + año + " es" + " lunes");
                    break;

                case 2:
                    System.out.println("El dia " + dia + " del mes " + mes + " del año " + año + " es" + " martes");
                    break;

                case 3:
                    System.out.println("El dia " + dia + " del mes " + mes + " del año " + año + " es" + " miercoles");
                    break;

                case 4:
                    System.out.println("El dia " + dia + " del mes " + mes + " del año " + año + " es" + " jueves");
                    break;

                case 5:
                    System.out.println("El dia " + dia + " del mes " + mes + " del año " + año + " es" + " viernes");
                    break;

                case 6:
                    System.out.println("El dia " + dia + " del mes " + mes + " del año " + año + " es" + " sabado");
                    break;

                default:
                    break;
            }
        } while (año != 0);
        teclado.close();
    }
}
