import java.util.Scanner;

public class T7E4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = lector.nextLine();

        System.out.print("Primer apellido: ");
        String apellido1 = lector.nextLine();

        System.out.print("Segundo apellido: ");
        String apellido2 = lector.nextLine();

        lector.close();

        // Concatena los carácteres en las posiciones 0, 1 y 2 del nombre y los apellidos a un nuevo String después de ponerl las letras en mayúsculas
        String nombreFormateado = nombre.substring(0,3).toUpperCase() + apellido1.substring(0, 3).toUpperCase() + apellido2.substring(0, 3).toUpperCase();

        System.out.println(nombreFormateado);
    }
}
