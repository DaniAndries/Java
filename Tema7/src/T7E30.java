import java.util.Scanner;

public class T7E30 {
    public static void menu() {
        Scanner lector = new Scanner(System.in);
        String opcion;
        do {
            System.out.println("A- Área de círculo \nB- Área de cuadrado \nC- Área de triángulo \nD- Salir");
            System.out.print("Elija una opción");
            opcion = lector.nextLine();
            switch (opcion) {
                case "A": // Ejecuta la función areaCirculo
                    System.out.println("Área del círculo: " + areaCirculo());
                    System.out.println();
                    break;
                case "B": // Ejecuta la función areaCuadrado
                    System.out.println("Área del cuadrado: " + areaCuadrado());
                    System.out.println();
                    break;
                case "C": // Ejecuta la función areaTriangulo
                    System.out.println("Área del triángulo: " + areaTriangulo());
                    System.out.println();
                    break;
                case "D": //Finaliza el programa
                    System.out.println("Fin del programa: ");
                    break;
                default: // Muestra un mensaje de error al introducir una opción inválida
                    System.err.println("Opción inválida, vuelve a intentarlo");
                    System.out.println();
                    break;
            }
        } while (!opcion.equals("D"));
    }

    /**
     * Función que calcula el área de un círculo mediante el radio que introduce el usuario
     *
     * @return Devuelve el valor del área del círculo
     */
    public static double areaCirculo() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Indique el radio para continuar: ");
        double radio = lector.nextDouble();

        return Math.PI * (Math.pow(radio, 2));
    }

    /**
     * Función que calcula el área de un cuadrado mediante un lado que introduce el usuario
     *
     * @return Devuelve el valor del área del cuadrado
     */
    public static double areaCuadrado() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Indique un lado del cuadrado: ");
        double lado = lector.nextDouble();

        return lado * lado;
    }

    /**
     * Función que calcula el área de un triángulo mediante una base y una altura que introduce un usuario
     *
     * @return Devuelve el valor del área del triángulo
     */
    public static double areaTriangulo() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Indique la base del triángulo: ");
        double base = lector.nextDouble();

        System.out.print("Indique la altura del triángulo: ");
        double altura = lector.nextDouble();

        return base * altura / 2;
    }

    public static void main(String[] args) {
        menu();
    }
}
