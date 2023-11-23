package PrimeraParte.T6D;

public class Punto {
    private int x;
    private int y;


    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x_mod) {
        x = x_mod;
    }

    public void setY(int y_mod) {
        y = y_mod;
    }

    public void setXY(int x_mod, int y_mod) {
        x = x_mod;
        y = y_mod;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * Desplaza positiva o negativamente los parámetros
     *
     * @param dx desplaza la x
     * @param dy desplaza la y
     */
    public void desplaza(int dx, int dy) {
        if (dx < 0) this.x = this.x - dx;
        else this.x = this.x + dx;
        if (dy < 0) this.y = this.y - dy;
        else this.y = this.y + dy;
    }

    /**
     * Calcula la distancia entre dos puntos distintos
     *
     * @param p Algo
     * @return Devuelve el resultado del cálculo
     */
    public double distancia(Punto p) {
        return (int) Math.abs(Math.sqrt(Math.pow((p.x - this.x), 2) + (Math.pow((p.y - this.y), 2))));
    }

    public void imprimir() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
}
