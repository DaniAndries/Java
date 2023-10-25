import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        String nombre = lector.nextLine();
        System.out.print("Introduce las horas trabajadas: ");
        int horasTotales = lector.nextInt();
        System.out.print("Introduce el precio de la tarifa normal: ");
        int precioHoras = lector.nextInt();
        double salarioBruto;

        if (horasTotales > 35) {
            int horasExtra = horasTotales - 35;
            int horas = horasTotales - horasExtra;
            double precioHoraExtra = precioHoras * 1.5;
            int salarioHoras = horas * precioHoras;
            double salarioExtra = horasExtra * precioHoraExtra;
            salarioBruto = salarioHoras + salarioExtra;
        } else {
            int horas = horasTotales;
            int salarioHoras = horas * precioHoras;
            salarioBruto = salarioHoras;
        }
        if (salarioBruto < 500) {
            System.out.println(nombre + ", tu salario bruto es: " + salarioBruto + ", sin tasas y tu salario neto es: "
                    + salarioBruto);
        } else if (salarioBruto > 900) {
            int sintasas = 500;
            double contasa = 400 * 0.25;
            double restante = (salarioBruto - 900) * 0.45;
            double tasas = contasa + restante;
            double salarioNeto = salarioBruto - tasas;
            System.out.println(nombre + ", tu salario bruto es: " + salarioBruto + ", las tasas son: " + tasas
                    + " y tu salario neto es: " + salarioNeto);
        } else if (salarioBruto < 900 || salarioBruto > 500) {
            int sintasas = 500;
            double contasa = (salarioBruto - sintasas) * 0.25;
            double tasas = contasa;
            double salarioNeto = salarioBruto - tasas;
            System.out.println(nombre + ", tu salario bruto es: " + salarioBruto + ", las tasas son: " + tasas
                    + " y tu salario neto es: " + salarioNeto);
        }
        lector.close();
    }
}