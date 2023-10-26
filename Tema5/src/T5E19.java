import java.util.Scanner;

public class T5E19 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int numero=lector.nextInt();

        for (int i = numero; i >1 ; i--) {
            if (numero%i==0){
                System.out.println(i);
            }
        }
        lector.close();
    }
}