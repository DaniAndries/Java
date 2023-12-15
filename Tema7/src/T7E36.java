import java.util.Scanner;

public class T7E36 {
    public static char letraNIF(int dni) {
        int calculo = 0;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String letra = "";
        if (dni < 100000000 || dni > 999999999) {
            return '-';
        } else {
            dni = Integer.parseInt(String.valueOf(dni));
            calculo = dni % 23;
        }
        return letras.charAt(calculo);
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce un DNI: ");
        int dni = lector.nextInt();

        System.out.println("El DNI: " + dni + " tiene la letra: " + letraNIF(dni));
    }
}
