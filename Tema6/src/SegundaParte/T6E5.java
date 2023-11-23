package SegundaParte;

class Trabajador{
    private String nombre;
    private String dni;
    private double sueldoBase;
    private int horasExtra;
    private double importeHoraExra;
    private int numeroTrabajadores;
    private double tipoIrpf;

    public void Trabajador(String dni, String nombre, double sueldoBase, int horasExtra, double tipoIrpf){
        this.dni = dni;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.horasExtra = horasExtra;
        this.tipoIrpf = tipoIrpf;
    }

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

    public void setImporteHoraExra(double importeHoraExra) {
        this.importeHoraExra = importeHoraExra;
    }

    public void setNumeroTrabajadores(int numeroTrabajadores) {
        this.numeroTrabajadores = numeroTrabajadores;
    }

    public void setTipoIrpf(double tipoIrpf) {
        this.tipoIrpf = tipoIrpf;
    }





}


public class T6E5 {
    public static void main(String[] args) {

    }
}
