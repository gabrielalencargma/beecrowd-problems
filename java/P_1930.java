import java.util.*;

public class P_1930 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int t1 = leia.nextInt();
        int t2 = leia.nextInt();
        int t3 = leia.nextInt();
        int t4 = leia.nextInt();

        int maxConexoes = t1 + t2 + t3 + t4 - 3;

        System.out.printf("%d\n", maxConexoes);
    }
}