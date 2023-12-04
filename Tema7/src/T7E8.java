import java.util.Scanner;

public class T7E8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int contador = 0;

        System.out.print("Indique una cadena de carácteres: ");
        String cadena = lector.nextLine();

        //Convertir cadena a minúscula
        cadena = cadena.toLowerCase();

        System.out.print("Indique el carácter a contar: ");
        String caracter = lector.nextLine();

        //comparar carácter por carácter con el carácter propuesto por el usuario
        for (int i = 0; i < cadena.length(); i++) {
            String caracterI = String.valueOf(cadena.charAt(i));
            if (caracterI.equals(caracter)) contador++;
        }

        System.out.println("Han habido " + contador +" "+ caracter + "'s");
        lector.close();
    }
}
