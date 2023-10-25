import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("Indique primero la hora, después los minutos y por último los segundos");
        Scanner lector = new Scanner(System.in);
        int hora = lector.nextInt();
        int minutos = lector.nextInt();
        int segundos = lector.nextInt();
        if (segundos == 59){
            segundos = 00;
            minutos += 1;
        }
        else
            segundos += 1;
        
        if(minutos == 59){
            minutos = 00;
            hora += 1;
        }
        else
            minutos += 1;
        if (hora == 24){
            hora = 00;
            minutos = 00;
            segundos = 00;
        }
        System.out.println(hora +":"+ minutos +":"+ segundos);
        lector.close();
    }
}