import java.util.*;

public class P_1075 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int n = leia.nextInt();

        for(int i=1; i<=10000; i++) {
            if(i % n == 2) {
                System.out.printf("%d\n", i);
            }
        }
    }
}