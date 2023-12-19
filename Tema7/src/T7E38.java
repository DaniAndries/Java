import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class T7E38 {
    public static String password (int numeroCaracteres, int nivelSeguridad){
        // Restricciones
        if (numeroCaracteres < nivelSeguridad) {
            numeroCaracteres = 8;
            nivelSeguridad = 2;
        }
        StringBuilder passwordGenerada = new StringBuilder();
        // Conjuntos de caracteres
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String letrasMayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        String simbolos = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";

        /**
          Concatena las cadenas de carácteres permitidos dependiendo del nivel de seguridad
         */
        String caracteresPermitidos = "";
        switch (nivelSeguridad) {
            case 1:
                caracteresPermitidos += letrasMinusculas;
                passwordGenerada.append(letraAzar(letrasMinusculas));
            case 2:
                caracteresPermitidos += letrasMinusculas + letrasMayusculas;
                passwordGenerada.append(letraAzar(letrasMinusculas));
                passwordGenerada.append(letraAzar(letrasMayusculas));
            case 3:
                caracteresPermitidos += letrasMinusculas + letrasMayusculas + numeros;
                passwordGenerada.append(letraAzar(letrasMinusculas));
                passwordGenerada.append(letraAzar(letrasMayusculas));
                passwordGenerada.append(letraAzar(numeros));
            case 4:
                caracteresPermitidos += letrasMinusculas + letrasMayusculas + numeros + simbolos;
                passwordGenerada.append(letraAzar(letrasMinusculas));
                passwordGenerada.append(letraAzar(letrasMayusculas));
                passwordGenerada.append(letraAzar(numeros));
                passwordGenerada.append(letraAzar(simbolos));
        };

        /**
         * Genera la contraseña basándose en la longitud y en los carácteres permitidos generando un número aleatorio
         * Crea un número aleatorio y selecciona el carácter específico de la cadena caracteresPermitidos
         * Después lo añade a contraseñaGenerada
         */
        for (int i = 0; i <= numeroCaracteres - nivelSeguridad - 1; i++) {
            passwordGenerada.append(letraAzar(caracteresPermitidos));
        }


        return desordenar(passwordGenerada.toString());
    }

    public static char letraAzar(String cadena) {
        return cadena.charAt(ThreadLocalRandom.current().nextInt(cadena.length()));
    }

    public static String desordenar(String cadenaOrdenada) {
        StringBuilder desordenado = new StringBuilder();
        StringBuilder cadena = new StringBuilder(cadenaOrdenada);
        int duracion = cadena.length()-1;
        for (int i = 0; i <= duracion; i++) {
            int numeroAleatorio = ThreadLocalRandom.current().nextInt(cadena.length());
            desordenado.append(cadena.charAt(numeroAleatorio));
            cadena.deleteCharAt(numeroAleatorio);
        }
        return desordenado.toString();
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
