import java.util.Scanner;

public class T7E16 {

    // Función para convertir decimal a hexadecimal (sin utilizar las clases de Java)

    private static String decimalToHexadecimal(int numeroDecimal) {
        StringBuilder hexadecimal = new StringBuilder();

        while (numeroDecimal > 0) {
            int numeroAlmacenado = numeroDecimal % 16;

            /**
             * Asigna a digito hexadecimal un caracter dependiendo de si es menor de diez se le asigna un número
             * del 0 al 10 si es mayor de diez se le resta y le asigna una letra de la A a la F
             */
            char digitoHexadecimal = (char) (numeroAlmacenado < 10 ? numeroAlmacenado + '0' : numeroAlmacenado - 10 + 'A');
            hexadecimal.insert(0, digitoHexadecimal);
            numeroDecimal /= 16;
        }
        return hexadecimal.toString();
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        int numeroDecimal = lector.nextInt();

        // Obtener la representación hexadecimal utilizando la función personalizada
        String hexadecimalMedianteFuncion = decimalToHexadecimal(numeroDecimal);

        // Obtener la representación hexadecimal utilizando las clases de Java
        String hexadecimalMedianteClasesJava = Integer.toHexString(numeroDecimal).toUpperCase();

        System.out.println("Resultado utilizando la función personalizada: " + hexadecimalMedianteFuncion);
        System.out.println("Resultado utilizando las clases de Java: " + hexadecimalMedianteClasesJava);

        // Comparar los resultados
        if (hexadecimalMedianteFuncion.equals(hexadecimalMedianteClasesJava)) {
            System.out.println("Los resultados son iguales.");
        } else {
            System.out.println("Los resultados son diferentes.");
        }
    }
}
