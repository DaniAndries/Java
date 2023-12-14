import java.util.Scanner;

public class T7E18 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        StringBuilder cadena = new StringBuilder(lector.nextLine());

        for (int i = 0; i < cadena.length(); i++) {
            if (i % 2 == 1) {
                cadena.delete(i, i + 1);
                cadena.insert(i, '*');
            }
        }
        System.out.println(cadena);
    }
}
