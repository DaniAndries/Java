package T6C;

import java.util.Scanner;

class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

public class T6C2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce los datos del primer usuario (DNI, Nombre, Apellidos y Edad");
        Persona persona1 = new Persona(lector.nextLine(), lector.nextLine(), lector.nextLine(), lector.nextInt());

        lector.nextLine();

        System.out.println("Introduce los datos del segundo usuario (DNI, Nombre, Apellidos y Edad");
        Persona persona2 = new Persona(lector.nextLine(), lector.nextLine(), lector.nextLine(), lector.nextInt());

        lector.close();

        System.out.print(persona1.getNombre() + " " + persona1.getApellidos() + " con DNI " + persona1.getDni());
        if (persona1.getEdad() >= 18)
            System.out.print(" es mayor de edad");
        else
            System.out.print(" no es mayor de edad");

        System.out.println(" ");
        System.out.print(persona2.getNombre() + " " + persona2.getApellidos() + " con DNI " + persona2.getDni());
        if (persona2.getEdad() >= 18)
            System.out.print(" es mayor de edad");
        else
            System.out.print(" no es mayor de edad");
    }
}
