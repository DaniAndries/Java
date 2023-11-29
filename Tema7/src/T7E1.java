import java.util.Scanner;

public class T7E1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String cadena1 = lector.nextLine();


        //Muestra la cadena en mayúsculas y minúscula

        System.out.println(cadena1.toUpperCase());
        System.out.println(cadena1.toLowerCase());

        if (cadena1.contains("a"))
            System.out.println("En la cadena hay al menos una a");
        else
            System.out.println("En la cadena no hay una a");

        if (cadena1.length() > 9)
            System.out.println("La cadena tiene 10 o más carácteres");
        else
            System.out.println("La cadena no tiene 10 o más carácteres");

        if (cadena1.indexOf("b", 3) >= 1)
            System.out.println("En la cadena hay al menos una b");
        else
            System.out.println("En la cadena no hay una b");

        int longitud = cadena1.length();


        //Crea una cadena con los 5 primeros carácteres de la cadena inicial

        String cadena2 = "Predeterminado";
        if (longitud < 5) {
            System.out.println("La cadena 1 no es lo suficientemente larga");
        } else {
            cadena2 = cadena1.substring(0, 5);
            System.out.println("Cadena 2: " + cadena2);
        }

        //Crea una cadena con los 5 últimos carácteres de la cadena inicial

        String cadena3 = "Predeterminado";
        if (longitud < 5) {
            System.out.println("La cadena 1 no es lo suficientemente larga");
        } else {
            cadena3 = cadena1.substring(longitud - 5, longitud);
            System.out.println("Cadena 3: " + cadena3);
        }

        String hola = new String("hola");

        if (cadena1.equals(hola))
            System.out.println("La cadena 1 es igual a hola");

        if (cadena2.equals(hola))
            System.out.println("La cadena 2 es igual a hola");

        if (cadena3.equals(hola))
            System.out.println("La cadena 3 es igual a hola");

        String cadena1Entera = lector.nextLine();
        int entero = Integer.parseInt(cadena1Entera);
        System.out.println(entero);

        
    }
}
