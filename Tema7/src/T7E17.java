import java.util.Scanner;

public class T7E17 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        StringBuilder cadenaStringBuilder = new StringBuilder(lector.nextLine());

        //A
        if (cadenaStringBuilder.length() > 3) cadenaStringBuilder.deleteCharAt(3);
        else System.err.println("A- Longitud de cadena insuficiente");
        System.out.println("A- " + cadenaStringBuilder);

        //B
        if (cadenaStringBuilder.length() > 5) cadenaStringBuilder.insert(5, 'x');
        else System.err.println("A- Longitud de cadena insuficiente");
        System.out.println("B- " + cadenaStringBuilder);

        //C
        if (cadenaStringBuilder.length() > 1) cadenaStringBuilder.setCharAt(1, 'z');
        else System.err.println("A- Longitud de cadena insuficiente");
        System.out.println("C- " + cadenaStringBuilder);

        //D
        if (cadenaStringBuilder.length() > 10) cadenaStringBuilder.delete(5, 10);
        else System.err.println("A- Longitud de cadena insuficiente");
        System.out.println("D- " + cadenaStringBuilder);

        //E
        cadenaStringBuilder.reverse();
        System.out.println("E- " + cadenaStringBuilder);

        //F
        String cadenaString = cadenaStringBuilder.toString();
        System.out.println("F- " + cadenaString);
    }
}
