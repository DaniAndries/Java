import java.util.Scanner;

public class T7E12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //Método String
        System.out.print("Indique una cadena de carácteres: ");
        String cadena = lector.nextLine();

        System.out.print("Indique un carácter: ");
        String caracter = lector.nextLine();

        System.out.print("Indique un número: ");
        int posicion = lector.nextInt();

        String nuevaCadena = cadena.substring(0, posicion-1) + caracter + cadena.substring(posicion);

        System.out.println(nuevaCadena);


        //Método String Builder
        StringBuilder cadenaSB = new StringBuilder(cadena);

        cadenaSB.replace(posicion-1, posicion, caracter);

        System.out.println(cadenaSB);
    }
}
