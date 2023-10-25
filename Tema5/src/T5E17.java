import java.util.Scanner;

public class T5E17 {
    public static void main(String[] args) {
        int limiteInferior=1;
        int limiteSuperior=100;
        int numero=0;
        int propuesta=0;
        Scanner lector=new Scanner(System.in);
        
        while (numero!=3) {
            propuesta=(limiteInferior+limiteSuperior)/2;
            System.out.println(propuesta);
            numero=lector.nextInt();
            if (numero==1){
                limiteInferior=propuesta+1;
            }
            else if (numero==2){
                limiteSuperior=propuesta-1;
            }
        }
        System.out.println(numero);
        lector.close();
    }
}