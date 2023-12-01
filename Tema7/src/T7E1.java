import java.util.Scanner;

public class T7E1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String cadena1 = lector.nextLine();


        //A - Muestra la cadena en mayúsculas y minúscula
        System.out.println("A");
        System.out.println();


        System.out.println(cadena1.toUpperCase());
        System.out.println(cadena1.toLowerCase());

        //B
        System.out.println("B");
        System.out.println();


        if (cadena1.contains("a"))
            System.out.println("En la cadena hay al menos una a");
        else
            System.out.println("En la cadena no hay una a");

        //C
        System.out.println("C");
        System.out.println();


        if (cadena1.length() > 9)
            System.out.println("La cadena tiene 10 o más carácteres");
        else
            System.out.println("La cadena no tiene 10 o más carácteres");

        //D
        System.out.println("D");
        System.out.println();


        if (cadena1.indexOf("b", 3) >= 1)
            System.out.println("En la cadena hay al menos una b");
        else
            System.out.println("En la cadena no hay una b");

        int longitud = cadena1.length();


        //E - Crea una cadena con los 5 primeros carácteres de la cadena inicial
        System.out.println("E");
        System.out.println();


        String cadena2 = "Predeterminado";
        if (longitud < 5) {
            System.out.println("La cadena 1 no es lo suficientemente larga");
        } else {
            cadena2 = cadena1.substring(0, 5);
            System.out.println("Cadena 2: " + cadena2);
        }

        //F - Crea una cadena con los 5 últimos carácteres de la cadena inicial
        System.out.println("F");
        System.out.println();


        String cadena3 = "Predeterminado";
        if (longitud < 5) {
            System.out.println("La cadena 1 no es lo suficientemente larga");
        } else {
            cadena3 = cadena1.substring(longitud - 5, longitud);
            System.out.println("Cadena 3: " + cadena3);
        }

        //G
        System.out.println("G");
        System.out.println();


        if (cadena1.equals("hola"))
            System.out.println("La cadena 1 es igual a hola");
        else
            System.out.println("La cadena 1 no es igual a hola");

        if (cadena2.equals("hola"))
            System.out.println("La cadena 2 es igual a hola");
        else
            System.out.println("La cadena 2 no es igual a hola");

        if (cadena3.equals("hola"))
            System.out.println("La cadena 3 es igual a hola");
        else
            System.out.println("La cadena 3 no es igual a hola");

        //H
        System.out.println("H - Dime un entero");
        System.out.println();


        String cadena1Entera = lector.nextLine();
        int entero = Integer.parseInt(cadena1Entera);
        System.out.println(entero);

        //I
        System.out.println("I - Dime un hexadecimal");
        System.out.println();


        String hexadecimal = lector.nextLine();

        int conversion = Integer.parseInt(hexadecimal, 16);

        System.out.println("Resultado de la conversión: " + conversion);

        //J
        System.out.println("J");
        System.out.println();


        String prueba = "prueva";
        System.out.println(prueba);
        prueba = prueba.replace("prueva", "prueba");
        System.out.println(prueba);

        //K
        System.out.println("K");
        System.out.println();


        if (cadena1.charAt(0) == cadena1.charAt(cadena1.length() - 1))
            System.out.println("La primera y última letra son iguales");
        else System.out.println("La primera y última letra son distintas");

        //L
        System.out.println("L");
        System.out.println();


        int contador = 0;
        for (int i = 0; i < cadena1Entera.length(); i++) {
            if (Character.isDigit(cadena1Entera.charAt(i))) {
                contador++;
            }
        }
        System.out.println("La cadena tiene: " + contador + "digitos númericos");

        //M
        System.out.println("M");
        System.out.println();

        contador = 0;
        String cadenaM = lector.nextLine();
        String cadenaM2 = cadenaM;
        for (int i = cadenaM.length() - 1; i >= 0; i--) {
            if (cadenaM.charAt(i) == cadenaM2.charAt(i))
                contador++;
            else break;
        }
        if (contador == cadenaM2.length()) System.out.println("Son iguales");
        else System.out.println("No son iguales");

        //N
        System.out.println("N");
        System.out.println();

        String cadenaN = lector.nextLine();
        String cadenaN2 = cadenaN;

        cadenaN2 = cadenaN2.replace(cadenaN2.charAt((cadenaN2.length() - 1)), (cadenaN.charAt(0)));
        System.out.println(cadenaN2);
        cadenaN2 = cadenaN2.replace(cadenaN2.charAt(0), cadenaN.charAt((cadenaN.length() - 1)));

        System.out.println(cadenaN);
        System.out.println(cadenaN2);
    }
}
