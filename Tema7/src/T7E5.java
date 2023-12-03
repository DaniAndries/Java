import java.util.Scanner;

public class T7E5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingresa una cadena de texto:");
        String cadena = lector.nextLine();

        lector.close();

        int longitud = cadena.length();
        StringBuilder palabraActual = new StringBuilder();

        System.out.println("Palabras en líneas separadas:");

        for (int i = 0; i < longitud; i++) {
            char caracterActual = cadena.charAt(i);

            // Si el caracter no es un espacio en blanco, agregarlo a la palabra actual
            if (caracterActual != ' ') {
                palabraActual.append(caracterActual);
            } else {
                // Si es un espacio en blanco, imprimir la palabra actual
                System.out.println(palabraActual);
                palabraActual.setLength(0);
            }
        }

        // Imprimir la última palabra si la cadena no termina con un espacio en blanco
        if (!palabraActual.isEmpty()) {
            System.out.println(palabraActual);
        }
    }
}
