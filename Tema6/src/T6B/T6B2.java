package T6B;

import java.util.Scanner;

class Persona {
    String dni;
    String nombre;
    String apellidos;
    int edad;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
}

public class T6B2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce los datos del primer usuario (DNI, Nombre, Apellidos y Edad");
        Persona persona1 = new Persona(lector.nextLine(), lector.nextLine(), lector.nextLine(), lector.nextInt());

        lector.nextLine();

        System.out.println("Introduce los datos del segundo usuario (DNI, Nombre, Apellidos y Edad");
        Persona persona2 = new Persona(lector.nextLine(), lector.nextLine(), lector.nextLine(), lector.nextInt());

        lector.close();

        System.out.print(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni);
        if (persona1.edad >= 18)
            System.out.print(" es mayor de edad");
        else
            System.out.print(" no es mayor de edad");

        System.out.println(" ");
        System.out.print(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni);
        if (persona2.edad >= 18)
            System.out.print(" es mayor de edad");
        else
            System.out.print(" no es mayor de edad");
    }
}
