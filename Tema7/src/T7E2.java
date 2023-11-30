import java.util.Scanner;

public class T7E2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroDni = lector.nextInt();
        int calculo = 0;
        String dni = new String();
        String letra = new String();
        if (numeroDni < 000000000 && numeroDni > 999999999){
            System.out.println("Numero incorrecto");
        }
        else{
            dni = String.valueOf(numeroDni);
            calculo = numeroDni % 23;
        }

        letra = switch (calculo) {
            case 0 -> "T";
            case 1 -> "R";
            case 2 -> "W";
            case 3 -> "A";
            case 4 -> "G";
            case 5 -> "M";
            case 6 -> "Y";
            case 7 -> "F";
            case 8 -> "P";
            case 9 -> "D";
            case 10 -> "X";
            case 11 -> "B";
            case 12 -> "N";
            case 13 -> "J";
            case 14 -> "Z";
            case 15 -> "S";
            case 16 -> "Q";
            case 17 -> "V";
            case 18 -> "H";
            case 19 -> "L";
            case 20 -> "C";
            case 21 -> "K";
            case 22 -> "E";
            default -> letra;
        };
        dni = dni + letra;
        System.out.println(dni);
    }
}
