import java.util.concurrent.ThreadLocalRandom;

public class T7E9 {
    public static void main(String[] args) {
        StringBuilder password = new StringBuilder();
        String opciones = "abcdefghij";

        for (int i = 0; i < opciones.length(); i++) {
            //Crea un número aleatorio entre 0 y 10
            int posibilidadAleatoria = ThreadLocalRandom.current().nextInt(0, opciones.length() - 1);

            //Almacena el carácter específico
            char caracterAleatorio = opciones.charAt(posibilidadAleatoria);

            //Añade a la cadena password el carácter específico
            password.append(caracterAleatorio);
        }

        System.out.println(password);
    }
}
