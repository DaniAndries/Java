import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        System.out.println("Indique una cantidad de días");

        Scanner lector = new Scanner(System.in);

        Integer dias = lector.nextInt();

        Integer horas = dias * 24;
        Integer minutos = horas * 60;
        Integer segundos = minutos * 60;

        System.out.println("En total serían " + horas + " horas o " + minutos + " minutos o " + segundos + " segundos");
        lector.close();

    }
}