package SegundaParte;

import java.time.LocalDate;

class EjemplarLibro {
    private final String titulo;
    private final LocalDate fecha;
    private final int ejemplar;
    private boolean prestado;

    public EjemplarLibro(String titulo) {
        this.titulo = titulo;
        this.fecha = LocalDate.now();
        this.ejemplar = 1;
        this.prestado = false;
    }

    public EjemplarLibro(EjemplarLibro p) {
        this.titulo = p.titulo;
        this.fecha = p.fecha;
        this.ejemplar = p.ejemplar + 1;
        this.prestado = p.prestado;
    }

    public boolean getPrestado() {
        return prestado;
    }

    public boolean Prestar() {
        if (!this.prestado) {
            this.prestado = true;
            return true;
        } else {
            this.prestado = false;
            return false;
        }
    }

    public boolean Devolver() {
        if (!this.prestado) {
            this.prestado = false;
            return false;
        } else {
            this.prestado = true;
            return true;
        }
    }

    public String toString() {
        return this.titulo + "(" + this.fecha + ")" + "[" + this.ejemplar + "]";
    }

}

public class T6E4 {
    public static void main(String[] args) {
        EjemplarLibro Quijote = new EjemplarLibro("El Quijote");

        EjemplarLibro Quijote2 = new EjemplarLibro(Quijote);

        EjemplarLibro Quijote3 = new EjemplarLibro(Quijote2);

        EjemplarLibro Quijote4 = new EjemplarLibro(Quijote3);

        System.out.println(Quijote.toString());
        System.out.println(Quijote2.toString());
        System.out.println(Quijote3.toString());
        System.out.println(Quijote4.toString());

        Quijote.Devolver();
        Quijote2.Prestar();
        Quijote3.Prestar();
        Quijote4.Devolver();


        System.out.println(Quijote.getPrestado());
        System.out.println(Quijote2.getPrestado());
        System.out.println(Quijote3.getPrestado());
        System.out.println(Quijote4.getPrestado());


        Quijote.Devolver();
        Quijote2.Prestar();
        Quijote3.Prestar();
        Quijote4.Devolver();

        System.out.println(Quijote.getPrestado());
        System.out.println(Quijote2.getPrestado());
        System.out.println(Quijote3.getPrestado());
        System.out.println(Quijote4.getPrestado());

        Quijote.Prestar();
        Quijote2.Devolver();
        Quijote3.Devolver();
        Quijote4.Prestar();

        System.out.println(Quijote.getPrestado());
        System.out.println(Quijote2.getPrestado());
        System.out.println(Quijote3.getPrestado());
        System.out.println(Quijote4.getPrestado());
    }
}
