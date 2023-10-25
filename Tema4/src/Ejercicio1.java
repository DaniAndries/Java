import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        String nombre;

        Scanner lector = new Scanner(System.in);

        System.out.println("Indique su nombre");

        nombre = lector.nextLine();

        System.out.println("Buenos días, " + nombre + "!");
        lector.close();

    }
}