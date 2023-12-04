public class T7E14 {
    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String cadena = teclado.nextLine();
        StringBuilder cadenaSB = new StringBuilder(cadena);
        int pos;

        do {
            pos = cadenaSB.indexOf(" ");
            if (pos != -1) cadenaSB.deleteCharAt(pos);
        } while (pos != -1);

        System.out.println(cadenaSB);

        //El código elimina los espacios y no contiene ningún error
    }
}
