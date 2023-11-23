package SegundaParte;

class Bombillas {
    private boolean interruptor;
    private static boolean interruptorGeneral = true;

    /**
     * Constructor del interruptor de la bombilla
     * @param interruptor Crea el interruptor de la bombilla
     */
    public Bombillas(boolean interruptor) {
        this.interruptor = interruptor;
    }

    /**
     * Imprime el estado del interruptor específico
     * @return Imprime el estado del interruptor específico
     */
    public boolean getInterruptor() {
        return interruptor;
    }

    /**
     * Imprime el estado del interruptor general
     * @return Imprime el estado del interruptor general
     */
    public static boolean getInterruptorGeneral() {
        return interruptorGeneral;
    }

    /**
     * Establece el estado del interruptor específico
     * @param interruptor Establece el estado del interruptor específico
     */
    public void setInterruptor(boolean interruptor) {
        this.interruptor = interruptor;
    }

    /**
     * Establece el estado del interruptor general
     * @param interruptorGeneral Establece el estado del interruptor general
     */
    public static void setInterruptorGeneral(boolean interruptorGeneral) {
        Bombillas.interruptorGeneral = interruptorGeneral;
    }

    /**
     * Imprime el estado del interruptor
     */
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
