import java.util.*;

public class P_1078 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        double[] n = new double[100];

        n[0] = leia.nextDouble();
        
        for(int i=0; i<100; i++) {
            if(i != 0) {
                n[i] = n[i-1] / 2;
            }
            sb.append(String.format("N[%d] = %.4f\n", i, n[i]));
        }
        
        System.out.print(sb.toString());
    }
}