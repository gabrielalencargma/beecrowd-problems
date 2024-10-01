import java.util.*;

class P_1173 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] n = new int[10];

        n[0] = leia.nextInt();
        
        for(int i=0; i<10; i++) {
            if(i != 0) {
                n[i] = n[i-1] * 2;
            }
            sb.append(String.format("N[%d] = %d\n", i, n[i]));
        }
        
        System.out.print(sb.toString());
    }
}