import java.util.*;

public class P_1177 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] n = new int[1000];

        int t = leia.nextInt();
        
        for(int i=0; i<1000; i++) {
            n[i] = i % t;
            sb.append(String.format("N[%d] = %d\n", i, n[i]));
        }
        
        System.out.print(sb.toString());
    }
}