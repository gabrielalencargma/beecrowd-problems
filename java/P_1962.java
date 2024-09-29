import java.util.*;

public class P_1962 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int n = leia.nextInt();
        
        for(int i = 0; i < n; i++) {
            long t = leia.nextLong();

            if(t < 2015) {
                sb.append(2015 - t).append(" D.C.\n");
            } else {
                sb.append(t - 2014).append(" A.C.\n");
            }
        }
        
        System.out.print(sb.toString());
    }
}