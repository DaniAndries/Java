import java.util.Scanner;

public class T7E15 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean longitudCorrecta = false;
        StringBuilder cadena;

        do {
            System.out.println("Introduce una cadena de texto de 7 carácteres");
            cadena = new StringBuilder(lector.nextLine());
            if (cadena.length() != 7) {
                System.out.println("Longitud incorrecta");
            } else {
                longitudCorrecta = true;
            }

        } while (!longitudCorrecta);

        int caracterRepetido;

        do {
            caracterRepetido = 0;

            for (int i = 0; i < cadena.length(); i++) {

                for (int j = i+1; j < cadena.length(); j++) {

                    char caracterAComprobar = cadena.charAt(i);

                    if (caracterAComprobar == cadena.charAt(j)) {
                        System.out.println("El carácter: " + caracterAComprobar + " está repetido");
                        caracterRepetido = 1;
                        break;
                    }
                }
                if (caracterRepetido == 1) break;
            }

            if (caracterRepetido != 0) {
                System.out.println("Vuelve a introducir otra cadena");

                System.out.println("Introduce una cadena de texto de 7 carácteres");
                cadena = new StringBuilder(lector.nextLine());
            }

        } while (caracterRepetido != 0);
        System.out.println("Ningún carácter repetido");
    }
}
