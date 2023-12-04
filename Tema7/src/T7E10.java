import java.util.concurrent.ThreadLocalRandom;

public class T7E10 {
    public static void main(String[] args) {
        StringBuilder password = new StringBuilder();
        StringBuilder opciones = new StringBuilder("abcdefghij");
        int cantidad = ThreadLocalRandom.current().nextInt(5, 11);

        for (int i = 0; i < cantidad; i++) {
            //Crea un número aleatorio entre 0 y 10
            int posibilidadAleatoria = ThreadLocalRandom.current().nextInt(0, opciones.length()-1);

            //Almacena el carácter específico
            char caracterAleatorio = opciones.charAt(posibilidadAleatoria);

            //Eliminamos el carácter aleatorio de la cadena de opciones para que no se repita
            opciones.deleteCharAt(posibilidadAleatoria);

            //Añade a la cadena password el carácter específico
            password.append(caracterAleatorio);
        }

        System.out.println(password);
    }
}
