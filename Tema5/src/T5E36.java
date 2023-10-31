public class T5E36 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Ejercicio A");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Ejercicio B");
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(a);
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Ejercicio C");
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Ejercicio D");
        for (int h = 9; h >= 1; h--) {
            for (int y = 9; y >= h; y--) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
