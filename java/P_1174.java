import java.util.*;

public class P_1174 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        double[] a = new double[10];

        for(int i=0; i<10; i++) {
            a[i] = leia.nextDouble();
            if(a[i] <= 10) {
                sb.append(String.format("A[%d] = %.1f\n", i, a[i]));
            }
        }

        System.out.print(sb.toString());
    }
}