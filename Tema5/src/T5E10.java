import java.util.Scanner;

public class T5E10 {
    public static void main(String[] args) {
        Scanner lectror=new Scanner(System.in);
        int finBucle=0;
        int nota10=0;
        while (finBucle!=-1){
            int nota=lectror.nextInt();
            if (nota == 10){
                nota10=nota10+1;
            }
            else if (nota==-1){
                finBucle=-1;
            }
            else if (nota<-1 || nota>10){
                System.out.println("La nota no es válida");
            }
        }
        System.out.println("Han habido "+nota10+" dieces");
        lectror.close();
    }
}