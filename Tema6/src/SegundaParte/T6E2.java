package SegundaParte;

class Aparato {
    private String nombre;
    private int consumo;
    private boolean estado = false;
    private static int consumoActual = 0;

    public Aparato(String nombre, int consumo, boolean estado) {
        setNombre(nombre);
        setConsumo(consumo);
        setEstado(estado);
    }

    public String getNombre() {
        return nombre;
    }

    public double getConsumo() {
        return consumo;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    /**
     * Establece el estado del aparato teniendo en cuenta unas restricciones
     * @param estado devuelve el consumo total y establece el estado del aparato
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
        if (estado == true) consumoActual = consumoActual+this.consumo;
        else consumoActual = consumoActual - this.consumo;
        if (consumoActual < 0) consumoActual = 0;
        System.out.println(consumoActual);
    }
    public void imprimir(){
        System.out.println(getNombre()+" "+getConsumo()+" "+getEstado());
    }
}

public class T6E2 {
    public static void main(String[] args) {
        Aparato bombilla = new Aparato("Bombilla", 100, false);
        Aparato radiador = new Aparato("Radiador", 2000, false);
        Aparato plancha = new Aparato("Plancha", 1200, false);

        bombilla.imprimir();
        radiador.imprimir();
        plancha.imprimir();

        bombilla.setEstado(true);
        plancha.setEstado(true);
        plancha.setEstado(false);
        radiador.setEstado(true);
    }
}
