import java.util.Scanner;

public class T5E35 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int suma = 0;
        salida: for (int i = 0; i < 15; i++) {
            int numero = lector.nextInt();
            suma = suma + numero;
            if (numero > 1000) {
                break salida;
            }
        }
        System.out.println(suma);
        lector.close();
    }
}
