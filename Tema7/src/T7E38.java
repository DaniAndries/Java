import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class T7E38 {
    public static String password (int numeroCaracteres, int nivelSeguridad){
        // Restricciones
        if (numeroCaracteres < nivelSeguridad) {
            numeroCaracteres = 8;
            nivelSeguridad = 2;
        }

        // Conjuntos de caracteres
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String letrasMayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        String simbolos = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";

        /**
          Concatena las cadenas de carácteres permitidos dependiendo del nivel de seguridad
         */
        String caracteresPermitidos = switch (nivelSeguridad) {
            case 1 -> letrasMinusculas;
            case 2 -> letrasMinusculas + letrasMayusculas;
            case 3 -> letrasMinusculas + letrasMayusculas + numeros;
            case 4 -> letrasMinusculas + letrasMayusculas + numeros + simbolos;
            default -> "";
        };

        /**
         * Genera la contraseña basándose en la longitud y en los carácteres permitidos generando un número aleatorio
         * Crea un número aleatorio y selecciona el carácter específico de la cadena caracteresPermitidos
         * Después lo añade a contraseñaGenerada
         */
        StringBuilder passwordGenerada = new StringBuilder();
        for (int i = 0; i < numeroCaracteres; i++) {
            int random = ThreadLocalRandom.current().nextInt(0, caracteresPermitidos.length());
            passwordGenerada.append(caracteresPermitidos.charAt(random));
        }

        return passwordGenerada.toString();
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Indica el numero de caractenes: ");
        int numeroCaracteres = lector.nextInt();
        System.out.print("Indica el nivel de seguridad de la contraseña: ");
        int nivelSeguridad = lector.nextInt();

        String password = password(numeroCaracteres, nivelSeguridad);

        System.out.println("Tu contraseña es: " + password);
    }
}
