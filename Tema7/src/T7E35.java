import java.util.Scanner;

public class T7E35 {
    public static int masPrimo(int numero) {
        int numeroPrimo = 0;

        for (int i = numero + 1; i < numero * 20; i++) {
            if (T7E33.divisores(i) == 2) {
                numeroPrimo = i;
                break;
            }
        }
        return numeroPrimo;
    }

    public static int digitos(int numero) {
        int digitos = 0;

        String cadena = String.valueOf(numero);
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ' || cadena.charAt(i) == '.' || cadena.charAt(i) == ',') continue;
            else digitos++;
        }
        return digitos;
    }

    public static String digitoN(int numerin, int posicion) {
        String digito = "";
        String numero = String.valueOf(numerin);
        if (posicion >= 0 && posicion < numero.length()) {
            digito = String.valueOf(numero.charAt(posicion));
            return digito;
        } else return "-1";
    }

    public static int posicionDigito(int numerin, int digito) {
        String numero = String.valueOf(numerin);
        return numero.indexOf(String.valueOf(digito)) + 1;
    }


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //A
        System.out.print("A- Indique un número: ");
        int numero = lector.nextInt();
        System.out.print("Siguiente número primo: ");
        System.out.print(masPrimo(numero));

        System.out.println();

        //B
        System.out.print("B- Indique un número: ");
        numero = lector.nextInt();
        System.out.println("El número tiene: " + digitos(numero) + " dígitos");

        //C
        System.out.print("C- Indique un número: ");
        numero = lector.nextInt();
        System.out.print("Indique la posición del dígito que quieres: ");
        int posicion = lector.nextInt();

        System.out.println(digitoN(numero, posicion));

        //D
        System.out.println("D- Indiqie un número: ");
        numero = lector.nextInt();
        System.out.println("Indique el dígito a buscar: ");
        int digito = lector.nextInt();

        System.out.println(posicionDigito(numero, digito));
    }
}
