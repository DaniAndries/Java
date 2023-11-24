package SegundaParte;

import java.util.Scanner;

class CuentaBancaria {
    private String IBAN;
    private String titular;
    private double saldo = 0;

    //Constructor
    public CuentaBancaria(String IBAN, String titular) {
        setIBAN(IBAN);
        setTitular(titular);
        this.saldo = 0;
    }

    //Getters
    public String getIBAN() {
        return IBAN;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    //Setters
    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //Métodos
    public void ingreso(double ingreso) {
        if (ingreso > 0) {
            this.saldo += ingreso;
            System.out.println("Ingreso completado con éxito");
        } else System.err.println("Cantidad inválida");
        if (ingreso >= 3000) System.err.println("AVISO: Notificar a hacienda");
    }

    public void retirada(double retirada) {
        if (retirada > 0 && this.saldo > -50 && this.saldo - retirada >= -50) {
            this.saldo += retirada;
            System.out.println("Retirada completada con éxito");
        } else System.err.println("Cantidad inválida");
        if (this.saldo < 0) System.err.println("AVISO: Saldo negativo");
        if (retirada >= 3000) System.err.println("AVISO: Notificar a hacienda");
    }

    public void imprimirDatos() {
        System.out.println("Titular: ");
        System.out.print(getTitular());
        System.out.println("IBAN: ");
        System.out.print(getIBAN());
        System.out.println("Saldo: ");
        System.out.print(getSaldo());
        System.out.println();
    }
}

public class T6E7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion;

        System.out.println("Primero creémos su cuenta :D");
        CuentaBancaria cuenta = new CuentaBancaria("ES6621000418401234567891", lector.nextLine());
        System.out.println("Cuenta creada con éxito");

        do {
            System.out.println("1. Datos de la cuenta.");
            System.out.println("2. IBAN");
            System.out.println("3. Titular");
            System.out.println("4. Saldo");
            System.out.println("5. Ingreso");
            System.out.println("6. Retirada");
            System.out.println("7. Salir");

            opcion = lector.nextInt();

            if (opcion < 1 || opcion > 7) System.err.println("Opción inválida, vuelve a intentarlo!");

            switch (opcion) {
                case 1:
                    cuenta.imprimirDatos();
                    break;
                case 2:
                    System.out.println(cuenta.getIBAN());
                    break;
                case 3:
                    System.out.println(cuenta.getTitular());
                    break;
                case 4:
                    System.out.println(cuenta.getSaldo());
                    break;
                case 5:
                    System.out.println("Indique la cantidad a ingresar (Sólo múltiplos de 5)");
                    cuenta.ingreso(lector.nextInt());
                    break;
                case 6:
                    System.out.println("Indique la cantidad a retirar (Sólo múltiplos de 5)");
                    cuenta.retirada(lector.nextInt());
                    break;
                case 7:
                    System.out.println("Un placer ofrecerte nuestros servicios, hasta más ver");
                    break;
            }
        } while (opcion != 7);
    }
}
