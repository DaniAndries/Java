package T6D;

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

    public void imprime() {
        if (edad >= 18)
            System.out.print(getNombre() + " " + getApellidos() + " con DNI " + getDni() + "es mayor de edad");
        else System.out.print(getNombre() + " " + getApellidos() + " con DNI " + getDni() + "no es mayor de edad");
    }

    public boolean esMayorEdad() {
        if (edad >= 18) return true;
        else return false;
    }

    public boolean esJubilado() {
        if (edad >= 65) return true;
        else return false;
    }

    public int diferenciaEdad(Persona p) {
        if (this.edad - getEdad() < 0) return Math.abs(this.edad - p.edad);
        else return (this.edad - p.edad);
    }
}

public class T6D2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce los datos del primer usuario (DNI, Nombre, Apellidos y Edad");
        Persona persona1 = new Persona(lector.nextLine(), lector.nextLine(), lector.nextLine(), lector.nextInt());

        lector.nextLine();

        System.out.println("Introduce los datos del segundo usuario (DNI, Nombre, Apellidos y Edad");
        Persona persona2 = new Persona(lector.nextLine(), lector.nextLine(), lector.nextLine(), lector.nextInt());

        lector.close();

        persona1.imprime();
        System.out.println();
        persona2.imprime();
        System.out.println();

        System.out.println("Prueba si es mayor de Edad");
        System.out.println(persona1.esMayorEdad());
        System.out.println(persona1.esMayorEdad());

        System.out.println("Prueba si es jubilado");
        System.out.println(persona1.esJubilado());
        System.out.println(persona1.esJubilado());

        System.out.println("Prueba de diferencia de edad");
        int diferencia1 = persona1.diferenciaEdad(persona2);
        int diferencia2 = persona2.diferenciaEdad(persona1);

        System.out.println(diferencia1);
        System.out.println(diferencia2);
    }
}
