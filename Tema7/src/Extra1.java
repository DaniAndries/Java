import java.util.Scanner;

public class Extra1 {
    public static boolean comprobador(String texto) {
        return texto.matches("^(\\d+\\{(.[^{}])+})+$");
    }

    public static int numerin(String texto) {
        return Integer.parseInt(texto.substring(0, texto.indexOf("{")));
    }

    public static String extractorCadena(String texto) {
        return texto.substring(texto.indexOf("{") + 1, texto.indexOf("}"));
    }

    public static void repetidor(int cantidad, String cadena) {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(cadena);
        }
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String cadena;
        do {
            cadena = lector.nextLine();
            System.out.println(comprobador(cadena));
        } while (!comprobador(cadena));
        int numero = numerin(cadena);
        String cadenaExtraida = extractorCadena(cadena);

        repetidor(numero, cadenaExtraida);
    }
}
