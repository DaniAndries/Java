import java.util.Scanner;

public class T5E7 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int negativos=0;
        int positivos=0;
        for (int i = 0; i < 10; i++) {
            int numero=lector.nextInt();
            if (numero<0){
            System.out.println("Negativo");
            negativos=negativos+1;
            }
            else{
            System.out.println("Positivo");
            positivos=positivos+1;
            }
        }
        System.out.println("Han habido "+positivos+" positivos "+negativos+" negativos");
        lector.close();
    }
}