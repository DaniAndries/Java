import java.util.Scanner;

public class T7E16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca un número decimal
        System.out.print("Introduce un número decimal: ");
        int decimalNumber = scanner.nextInt();

        // Obtener la representación hexadecimal utilizando la función personalizada
        String hexadecimalCustom = decimalToHexadecimalCustom(decimalNumber);

        // Obtener la representación hexadecimal utilizando las clases de Java
        String hexadecimalJava = Integer.toHexString(decimalNumber).toUpperCase();

        // Mostrar los resultados
        System.out.println("Resultado utilizando la función personalizada: " + hexadecimalCustom);
        System.out.println("Resultado utilizando las clases de Java: " + hexadecimalJava);

        // Comparar los resultados
        if (hexadecimalCustom.equals(hexadecimalJava)) {
            System.out.println("Los resultados son iguales.");
        } else {
            System.out.println("Los resultados son diferentes.");
        }
    }

    // Función para convertir decimal a hexadecimal (sin utilizar las clases de Java)
    private static String decimalToHexadecimalCustom(int decimalNumber) {
        StringBuilder hexadecimal = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 16;
            char hexDigit = (char) (remainder < 10 ? remainder + '0' : remainder - 10 + 'A');
            hexadecimal.insert(0, hexDigit);
            decimalNumber /= 16;
        }

        return hexadecimal.toString();
    }
}
