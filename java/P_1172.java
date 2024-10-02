import java.util.*;

public class P_1172 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] x = new int[10];

        for(int i=0; i<10; i++) {
            x[i] = leia.nextInt();

            if(x[i] <= 0) {
                x[i] = 1;
            }

            sb.append(String.format("X[%d] = %d\n", i, x[i]));
        }

        System.out.print(sb.toString());
    }
}