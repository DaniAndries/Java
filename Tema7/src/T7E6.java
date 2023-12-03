import java.util.Scanner;

public class T7E6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingresa una frase:");
        String frase = lector.nextLine();

        lector.close();

        // Convertir la frase a minúsculas para no diferenciar entre mayúsculas y minúsculas
        frase = frase.toLowerCase();

        // Variables para contar las vocales de cada tipo
        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        // Seleccionar individualmente carácter por carácter
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            // Verificar si el caracter es una vocal y actualizar el contador correspondiente
            switch (caracter) {
                case 'a':
                    contadorA++;
                    break;
                case 'e':
                    contadorE++;
                    break;
                case 'i':
                    contadorI++;
                    break;
                case 'o':
                    contadorO++;
                    break;
                case 'u':
                    contadorU++;
                    break;
            }
        }

        System.out.println("Cantidad de vocales 'a': " + contadorA);
        System.out.println("Cantidad de vocales 'e': " + contadorE);
        System.out.println("Cantidad de vocales 'i': " + contadorI);
        System.out.println("Cantidad de vocales 'o': " + contadorO);
        System.out.println("Cantidad de vocales 'u': " + contadorU);
    }
}
