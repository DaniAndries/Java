package T6A;

import java.util.Scanner;

class Persona {
    String dni;
    String nombre;
    String apellidos;
    int edad;
}

public class T6A2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        System.out.println("Introduce el DNI de la siguiente persona:");
        persona1.dni = lector.nextLine();
        System.out.println("Introduce el nombre de la siguiente persona:");
        persona1.nombre = lector.nextLine();
        System.out.println("Introduce los apellidos de la siguiente persona:");
        persona1.apellidos = lector.nextLine();
        System.out.println("Introduce la edad de la siguiente persona:");
        persona1.edad = lector.nextInt();

        lector.nextLine();

        System.out.println("Introduce el DNI de la siguiente persona:");
        persona2.dni = lector.nextLine();
        System.out.println("Introduce el nombre de la siguiente persona:");
        persona2.nombre = lector.nextLine();
        System.out.println("Introduce los apellidos de la siguiente persona:");
        persona2.apellidos = lector.nextLine();
        System.out.println("Introduce la edad de la siguiente persona:");
        persona2.edad = lector.nextInt();

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
