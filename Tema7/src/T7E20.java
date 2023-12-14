import java.util.Scanner;

public class T7E20 {

    public static boolean esMayorEdad(int a) {
        return (a >= 18);
    }


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int edad = lector.nextInt();

        System.out.println(esMayorEdad(edad));
    }
}
