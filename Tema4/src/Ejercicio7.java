import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        System.out.println("Indique de cuántos pupitres dispones");

        Scanner lector = new Scanner(System.in);

        Integer pupitres = lector.nextInt();

        Integer aulas = pupitres / 24;

        Integer pupitresRestantes = pupitres % 24;

        System.out.println("Se llenarán un total de " + aulas + " y sobran " + pupitresRestantes + " pupitres");
        lector.close();

    }
}
