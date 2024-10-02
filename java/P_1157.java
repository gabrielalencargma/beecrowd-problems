import java.util.*;

public class P_1157 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = leia.nextInt();

        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                sb.append(i).append("\n");
            }
        }

        System.out.printf("%s", sb.toString());
    }
}