import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        String nombre;
        String apellidos;

        Scanner lector = new Scanner(System.in);

        System.out.println("Indique su nombre");

        nombre = lector.nextLine();

        System.out.println("Indique sus apellidos");

        apellidos = lector.nextLine();

        System.out.println("Buenos días " + nombre + " " + apellidos + "!");
        lector.close();
    }
}