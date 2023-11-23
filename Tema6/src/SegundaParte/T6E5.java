package SegundaParte;

import java.util.Scanner;

class Trabajador{
    private String nombre;
    private String dni;
    private double sueldoBase;
    private int horasExtra;
    private static double importeHoraExra;
    private static int numeroTrabajadores;
    private double tipoIrpf;


    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public double getImporteHoraExra() {
        return importeHoraExra;
    }

    public int getNumeroTrabajadores() {
        return numeroTrabajadores;
    }

    public double getTipoIrpf() {
        return tipoIrpf;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public static void setImporteHoraExra(double importeHoraExra) {
        Trabajador.importeHoraExra = importeHoraExra;
    }

    public void setNumeroTrabajadores(int numeroTrabajadores) {
        Trabajador.numeroTrabajadores = numeroTrabajadores;
    }

    public void setTipoIrpf(double tipoIrpf) {
        this.tipoIrpf = tipoIrpf;
    }


    //Metodos

    /**
     * Calcula el importe de las horas extra
     * @return Devuelve el resultado
     */
    public double calcularImporteHorasExtra(){
        return (importeHoraExra*this.horasExtra);
    }

    /**
     * Calcula el sueldo bruto
     * @return devuelve el total del sueldo bruto
     */
    public double calcularSueldoBruto(){
        return (this.sueldoBase+this.calcularImporteHorasExtra());
    }

    /**
     * Calcula el porcentaje de la retención de IRPF
     * @return devuelve el total a restar
     */
    public double retencionIrpf(){
        return (this.calcularSueldoBruto()*(this.tipoIrpf/100));
    }

    /**
     * Calcula el sueldo
     * @return Devuelve el sueldo una vez restada la retención IRPF
     */
    public double calcularSueldo(){
        return (this.calcularSueldoBruto()-this.retencionIrpf());
    }

    /**
     * Imprime los datos del trabajador
     * @return Devuelve los datos del trabajador
     */
    public String toString() {
        return (this.dni+" "+this.nombre+"\n"+"Sueldo Base: "+this.sueldoBase+"\n"+"Horas Extras: "+this.horasExtra+"\n"+"Tipo IRPF: "+this.tipoIrpf+"\n"+"Sueldo Bruto: "+this.calcularSueldoBruto()+"\n"+"Retención por IRPF: "+this.retencionIrpf()+"\n"+"Sueldo Neto: "+this.calcularSueldo());
    }

    public static void leerTrabajador(Trabajador t){
        Scanner lector = new Scanner(System.in);

        System.out.print("DNI: ");
        t.setDni(lector.nextLine());

        System.out.print("Nombre: ");
        t.setNombre(lector.nextLine());

        System.out.print("Sueldo Base: ");
        t.setSueldoBase(lector.nextDouble());

        System.out.print("Cantidad de horas extra: ");
        t.setHorasExtra(lector.nextInt());

        System.out.print("Tipo de IRPF: ");
        t.setTipoIrpf(lector.nextDouble());

        t.setNumeroTrabajadores(numeroTrabajadores = numeroTrabajadores + 1);
    }
}

public class T6E5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Indique el precio de las horas extra: ");
        Trabajador.setImporteHoraExra(lector.nextDouble());

        Trabajador t1 = new Trabajador();
        Trabajador.leerTrabajador(t1);

        System.out.println();
        Trabajador t2 = new Trabajador();
        Trabajador.leerTrabajador(t2);

        System.out.println();
        Trabajador t3 = new Trabajador();
        Trabajador.leerTrabajador(t3);

        System.out.print("Números de trabajadores: ");
        System.out.print(t1.getNumeroTrabajadores());
        System.out.println();
        System.out.println();


        System.out.println("<----Nominas de trabajadores---->");
        System.out.println(t1.toString());
        System.out.println();
        System.out.println(t2.toString());
        System.out.println();
        System.out.println(t3.toString());
    }
}
