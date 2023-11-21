package SegundaParte;

class Aparato {
    private String Nombre;
    private double Consumo;
    private boolean Estado = false;

    public Aparato(String Nombre, double Consumo, boolean Estado) {
        this.Nombre = Nombre;
        this.Consumo = Consumo;
        this.Estado = Estado;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getConsumo() {
        return Consumo;
    }

    public boolean getEstado() {
        return Estado;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setConsumo(double consumo) {
        Consumo = consumo;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
        System.out.println(this.Consumo);
    }

}

public class T6E2 {
    public static void main(String[] args) {
        double consumoActual = 0;
        Aparato bombilla = new Aparato("Bombilla", 100, false);
        Aparato radiador = new Aparato("Radiador", 2000, false);
        Aparato plancha = new Aparato("Plancha", 1200, false);
        System.out.println(consumoActual);
        bombilla.setEstado(true);
        plancha.setEstado(true);
        consumoActual = (bombilla.getConsumo() + plancha.getConsumo());
        System.out.println(consumoActual);
        plancha.setEstado(false);
        radiador.setEstado(true);
        consumoActual = bombilla.getConsumo() + radiador.getConsumo();
        System.out.println(consumoActual);
    }
}
