import java.util.*;

public class P_1933 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int c1 = leia.nextInt();
        int c2 = leia.nextInt();

        if(c1 == c2) {
            System.out.printf("%d\n", c1);
        } else {
            System.out.printf("%d\n", Math.max(c1, c2));
        }
    }
}