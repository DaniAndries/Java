import java.util.Scanner;

public class T7E7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String cadena = lector.nextLine();
        StringBuilder cadenaSB = new StringBuilder();

        //Convertir la cadena a minúscula
        cadena = cadena.toLowerCase();

        //Quitar los espacios a la cadena
        cadena = cadena.replace(" ", "");

        cadenaSB = new StringBuilder(cadena);

        System.out.println(cadena);
        System.out.println(cadenaSB.reverse());

        //Comparamos cadenaSB con String Builder dándole la vuelta y convirtiendola a String con cadena
        if (cadenaSB.reverse().toString().equals(cadena))
            System.out.println("Es palíndromo");
        else
            System.out.println("No es palíndromo");

        lector.close();
    }
}
