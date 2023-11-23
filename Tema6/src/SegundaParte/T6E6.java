package SegundaParte;

import java.lang.ref.SoftReference;
import java.text.DecimalFormat;

class Prepago {
    private int numeroMovil;
    private float costeEstableceLLamada;
    private float costeMinutoLlamada;
    private float costeConsumoMB;
    private float saldo;

    public Prepago(int numeroMovil, float costeEstableceLLamada, float costeMinutoLlamada, float costeConsumoMB, float saldo){
        this.numeroMovil= numeroMovil;
        this.costeEstableceLLamada = costeEstableceLLamada;
        this.costeMinutoLlamada = costeMinutoLlamada;
        this.costeConsumoMB = costeConsumoMB;
        this.saldo = saldo;
    }

    //Getters
    public int getNumeroMovil() {
        return numeroMovil;
    }

    public String getCosteEstableceLLamada() {
        DecimalFormat formato = new DecimalFormat("#.00");
        return formato.format(costeEstableceLLamada);
    }

    public String getCosteMinutoLlamada() {
        DecimalFormat formato = new DecimalFormat("#.00");
        return formato.format(this.costeMinutoLlamada);
    }

    public String getCosteConsumoMB() {
        DecimalFormat formato = new DecimalFormat("#.00");
        return formato.format(this.costeConsumoMB);
    }

    public String getSaldo() {
        DecimalFormat formato = new DecimalFormat("#.00");
        return formato.format(this.saldo);
    }

    //Setters
    public void setNumeroMovil(int numeroMovil) {
        this.numeroMovil = numeroMovil;
    }

    public void setCosteEstableceLLamada(float costeEstableceLLamada) {
        this.costeEstableceLLamada = costeEstableceLLamada;
    }

    public void setCosteMinutoLlamada(float costeMinutoLlamada) {
        this.costeMinutoLlamada = costeMinutoLlamada;
    }

    public void setCosteConsumoMB(float costeConsumoMB) {
        this.costeConsumoMB = costeConsumoMB;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //Metodos

    /**
     * Resta saldo dependiendo de la duración de la llamada
     * @param segundos Cantidad a restar al saldo total
     */
    public void efectuarLlamada (int segundos){
        if (this.saldo <= 0) System.err.println("Fin de la llamda (No tienes saldo)");
        else{
            float minutos = segundos * 60;
            this.saldo = minutos / this.costeMinutoLlamada;
        }
    }

    /**
     * Resta saldo dependiendo de los MB de navegación
     * @param MB Cantidad a restar al saldo total
     */
    public void navegar(int MB){
        if (this.saldo <= 0) System.err.println("(No tienes saldo)");
        else this.saldo -= MB;
    }

    /**
     * Añade saldo dependiendo del importe
     * @param importe Cantidad a sumar
     * @return Boolean si se efectúa o no la recarga
     */
    public boolean recargar(int importe){
        if (importe % 5 == 0 && importe >= 5){
            this.saldo += importe;
            return true;
        }
        else return false;
    }

    /**
     * Se efectua un cálculo para que el número sólo tenta dos decimales
     * @return Imprime por pantalla el saldo total
     */
    public float consultarSaldo(){
        return (float) (Math.round(this.saldo * Math.pow(10, 2)) / Math.pow(10, 2));
    }
}

public class T6E6 {
    public static void main(String[] args) {


    }
}
