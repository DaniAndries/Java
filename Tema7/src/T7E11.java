import java.util.Scanner;

public class T7E11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        StringBuilder correo = new StringBuilder(lector.nextLine());
        lector.close();

        //Almacena la posición dónde se encuentra el @
        int cantidad = correo.indexOf("@");

        //Se elimina todos los carácteres que hayan antes del @
        for (int i = 0; i < cantidad+1; i++) {
            correo.deleteCharAt(0);
        }

        //Almacena la posición dónde se encuentra el .com
        cantidad = correo.lastIndexOf(".com");

        //Se elimina todos los carácteres que hayan después del .com
        for (int i = 0; i < 4; i++) {
            correo.deleteCharAt(cantidad);
        }

        System.out.println(correo);
    }
}