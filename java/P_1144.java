import java.util.*;

public class P_1144 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.printf("%d %d %d\n", i, (int)Math.pow(i, 2), (int)Math.pow(i, 3));
            System.out.printf("%d %d %d\n", i, (int)Math.pow(i, 2) + 1, (int)Math.pow(i, 3) + 1);
        }
    }
}