import java.util.Scanner;

public class T7E28 {
    public static int contarCeros(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '0') contador++;
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String cadena = lector.nextLine();

        System.out.println(contarCeros(cadena));
    }
}
