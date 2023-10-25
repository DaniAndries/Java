public class T5E14 {
    public static void main(String[] args) {
        int numero=860;
        while (numero>459) {
            System.out.println(numero);
            numero=numero-10;
        }
        numero=860;
        do {
            System.out.println(numero);
            numero=numero-10;
        } while (numero>459);
        for (int i = 860; i > 459;) {
            System.out.println(i);
            i=i-10;
        }
    }
}