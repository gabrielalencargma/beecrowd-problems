import java.util.*;

class P_1175 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] n = new int[20];

        for(int i=0; i<20; i++) {
            n[i] = leia.nextInt();
        }

        for(int i=0; i<10; i++) {
            int temp = n[i];
            n[i] = n[19-i];
            n[19-i] = temp;
        }

        for(int i=0; i<20; i++) {
            sb.append(String.format("N[%d] = %d\n", i, n[i]));
        }
        
        System.out.print(sb.toString());
    }
}