package SegundaParte;

class Bombillas {
    private boolean interruptor;
    private static boolean interruptorGeneral = true;

    public Bombillas(boolean interruptor) {
        this.interruptor = interruptor;
    }

    public boolean getInterruptor() {
        return interruptor;
    }

    public static boolean getInterruptorGeneral() {
        return interruptorGeneral;
    }

    public void setInterruptor(boolean interruptor) {
        this.interruptor = interruptor;
    }

    public static void setInterruptorGeneral(boolean interruptorGeneral) {
        Bombillas.interruptorGeneral = interruptorGeneral;
    }

    public void imprimir() {
        if (!this.interruptor || !interruptorGeneral)
            System.out.println("El interruptor está apagado por lo que no da luz");
        else System.out.println("los interruptores está encendido por lo que da luz");
    }
}

public class T6E3 {
    public static void main(String[] args) {
        Bombillas salon = new Bombillas(false);
        Bombillas cocina = new Bombillas(false);

        salon.imprimir();
        cocina.imprimir();

        salon.setInterruptor(true);
        cocina.setInterruptor(true);

        salon.imprimir();
        cocina.imprimir();

        Bombillas.setInterruptorGeneral(false);

        salon.imprimir();
        cocina.imprimir();

        System.out.println("Estado de los interruptores:");

        System.out.println("Interruptor del salon " + salon.getInterruptor());
        System.out.println("Interruptor de la cocina " + cocina.getInterruptor());
        System.out.println("Interruptor general " + Bombillas.getInterruptorGeneral());
    }
}
