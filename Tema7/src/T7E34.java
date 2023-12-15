public class T7E34 {
    public static int numerosPrimos (){
        int contador = 0;
        for (int i = 1; i < 1000; i++) {
            if (T7E33.divisores(i) == 2) contador++;
        }
        return contador;
    }

    public static void main(String[] args) {
        System.out.println(numerosPrimos());
    }
}
