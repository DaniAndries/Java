import java.util.Scanner;

public class T5E16 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int contador = lector.nextInt();
        int mayor = -999999;
        int menor = 999999;
        int suma = 0;
        for (int i = 0; i < contador; i++) {
            int numero = lector.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero > menor) {
                menor = numero;
            }
            suma = suma + numero;
        }
        System.out.println(suma / contador);
        lector.close();
    }
}