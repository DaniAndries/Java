import java.util.Scanner;

public class T7E37 {
    public static void menu() {
        Scanner lector = new Scanner(System.in);
        String opcion;
        do {
            System.out.println("1- Área de círculo \n2- Área de cuadrado \n3- Salir");
            System.out.print("Elija una opción");
            opcion = lector.nextLine();
            switch (opcion) {
                case "1": // Ejecuta la función circunferencia
                    System.out.println("Circunferencia del círculo: " + circunferencia(pideRadio()));
                    System.out.println();
                    break;
                case "2": // Ejecuta la función areaCirculo
                    System.out.println("Área del círculo: " + area(pideRadio()));
                    System.out.println();
                    break;
                case "3": //Ejecuta la funcion volumen
                    System.out.println("Volúmen del círculo: " + volumen(pideRadio()));
                    System.out.println();
                    break;
                case "4": // Ejecuta todas las funciones
                    double radio = pideRadio();
                    System.out.println("Circunferencia del círculo: " + circunferencia(radio));
                    System.out.println("Área del círculo: " + area(radio));
                    System.out.println("Volúmen del círculo: " + volumen(radio));
                    System.out.println();
                    break;
                case "5": //Finaliza el programa
                    System.out.println("Fin del programa: ");
                    break;
                default: // Muestra un mensaje de error al introducir una opción inválida
                    System.err.println("Opción inválida, vuelve a intentarlo");
                    System.out.println();
                    break;
            }
        } while (!opcion.equals("3"));
    }

    public static double pideRadio(){
        Scanner lector = new Scanner(System.in);
        return lector.nextDouble();
    }

    public static double circunferencia(double radio){
        return 2 * Math.PI * (Math.pow(radio, 2));
    }

    public static double area(double radio) {
        return Math.PI * (Math.pow(radio, 2));
    }

    public static double volumen(double radio){
        return (double) 4/3*Math.PI * (Math.pow(radio, 3));
    }

    public static void main(String[] args) {
        menu();
    }
}
