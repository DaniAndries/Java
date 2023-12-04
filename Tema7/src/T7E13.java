import java.util.Scanner;

public class T7E13 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        StringBuilder cadenaFinal = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            String cadena = lector.nextLine();
            cadenaFinal.append(cadena.charAt(0));
        }
        System.out.println(cadenaFinal);

    }
}
