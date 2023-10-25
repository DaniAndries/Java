public class T5E11 {
    public static void main(String[] args) {
        int pares=0;
        int impares=0;
        for (int i = 100; i < 201; i++) {
            if (i%2==0){
                pares=pares+i;
            }
            else {
                impares=impares+i;
            }
        }
        System.out.println(pares+" "+impares);
    }
}