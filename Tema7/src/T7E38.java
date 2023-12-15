import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class T7E38 {
    public static String contraseña (int numeroCaracteres, int nivelSeguridad){
        // Restricciones
        if (numeroCaracteres < 8) {
            numeroCaracteres = 8;
            nivelSeguridad = 2;
        } if (nivelSeguridad > numeroCaracteres) {
            nivelSeguridad = numeroCaracteres;
        }

        // Conjuntos de caracteres
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String letrasMayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        String simbolos = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";

        /**
         * Concatena las cadenas de carácteres permitidos dependiendo del nivel de seguridad
         */
        String caracteresPermitidos = "";
        switch (nivelSeguridad) {
            case 1:
                caracteresPermitidos = letrasMinusculas;
                break;
            case 2:
                caracteresPermitidos = letrasMinusculas + letrasMayusculas;
                break;
            case 3:
                caracteresPermitidos = letrasMinusculas + letrasMayusculas + numeros;
                break;
            case 4:
                caracteresPermitidos = letrasMinusculas + letrasMayusculas + numeros + simbolos;
                break;
        }

        /**
         * Genera la contraseña basandose en la longitud y en los carácteres permitidos generando un número aleatorio
         * Crea un número aleatorio y selecciona el carácter específico de la cadena caracteresPermitidos
         * Después lo añade a contraseñaGenerada
         */
        StringBuilder contraseñaGenerada = new StringBuilder();
        for (int i = 0; i < numeroCaracteres; i++) {
            int random = ThreadLocalRandom.current().nextInt(0, caracteresPermitidos.length());
            contraseñaGenerada.append(caracteresPermitidos.charAt(random));
        }

        return contraseñaGenerada.toString();
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Indica el numero de caractenes: ");
        int numeroCaracteres = lector.nextInt();
        System.out.println("Indica el nivel de seguridad de la contraseña: ");
        int nivelSeguridad = lector.nextInt();

        String password = contraseña(numeroCaracteres, nivelSeguridad);

        System.out.println("Tu contraseña es: " + password);
    }
}
