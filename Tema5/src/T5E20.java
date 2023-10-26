import java.util.Scanner;

public class T5E20 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 1;
        int cantidad = lector.nextInt();
        lector.close();
        int contador=cantidad/2;
        for (int i = 0; i < contador; i++) {
            System.out.println(numero1);
            numero1 = numero1 + numero2;
            System.out.println(numero2);
            numero2 = numero1 + numero2;
        }
        if (cantidad%2!=0){
            System.out.println(numero1);        
        }
    }
}