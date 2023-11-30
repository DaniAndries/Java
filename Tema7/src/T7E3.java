import java.util.Scanner;

public class T7E3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String cadena1 = lector.nextLine();
        String cadena2 = lector.nextLine();

        if (cadena1.compareTo(cadena2) == 0){
            System.out.println("Son iguales, mayúsculas incluidas");
        }
        else System.out.println("No son iguales, contando las mayúsculas");

        if (cadena1.compareToIgnoreCase(cadena2) == 0){
            System.out.println("Son iguales, sin mayúsculas incluidas");
        }
        else System.out.println("No son iguales, sin contar las mayúsculas");
    }
}
