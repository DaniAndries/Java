import java.util.Scanner;

public class T5E12 {
    public static void main(String[] args) {
        Scanner lectror = new Scanner(System.in);
        int numero1 = lectror.nextInt();
        int numero2 = lectror.nextInt();
        System.out.println(Math.pow(numero1, numero2));
        lectror.close();
    }
}