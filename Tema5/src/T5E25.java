import java.util.Scanner;

public class T5E25 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int numero=1;
        int numero2=0;
        int contador=0;
        while (numero!=0) {
            numero=lector.nextInt();
            contador=contador+1;
            if (numero<numero2 && numero!=0){
                System.out.println("error, el numero es menor");
            }
            else if (numero>numero2){
                numero2=numero;
            }
            else if (numero==0){
                System.out.println("Total de numeros introducidos: "+(contador-1));
            }
        }
        lector.close();
    }
}