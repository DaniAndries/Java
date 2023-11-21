package PrimeraParte.T6E;

import java.util.Scanner;

class Persona {
    private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private final static int mayoriaEdad = 18;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



    public void imprime() {
        System.out.print(getNombre() + " " + getApellidos() + " con DNI " + getDni());
    }

    /**
     * Comprueba la mayoría de edad
     * @return Devuelve un booleano dependiendo si es mayor o no de edad
     */
    public boolean esMayorEdad() {
        if (this.edad >= mayoriaEdad) return true;
        else return false;
    }

    /**
     * Comprueba si es jubilado o no
     * @return Devuelve un booleano dependiendo si es jubilado o no
     */
    public boolean esJubilado() {
        if (this.edad >= 65) return true;
        else return false;
    }

    /**
     * Calcula la diferencia de edad entre 2 personas
     * @param p es la edad de la segunda persona
     * @return Devuelve la diferencia de edad entre las 2 personas
     */
    public int diferenciaEdad(Persona p) {
        if (this.edad - p.edad < 0) return Math.abs(this.edad - p.edad);
        else return (this.edad - p.edad);
    }
}

public class T6E2 {
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
