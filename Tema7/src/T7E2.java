import java.util.Scanner;

public class T7E2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroDni = lector.nextInt();
        int calculo = 0;
        String letras= "TRWAGMYFPDXBNJZSQVHLCKE";
        String dni = new String();
        String letra = new String();
        if (numeroDni < 000000000 && numeroDni > 999999999){
            System.out.println("Numero incorrecto");
        }
        else{
            dni = String.valueOf(numeroDni);
            calculo = numeroDni % 23;
        }

        letra = String.valueOf(letras.charAt(calculo));
        dni = dni + letra;

        System.out.println(dni);
    }
}
