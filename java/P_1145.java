import java.util.*;

public class P_1145 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int x = leia.nextInt();
        int y = leia.nextInt();

        for(int i=1; i<=y; i++) {
            System.out.printf("%d", i);
            
            if(i % x == 0) {
                System.out.printf("\n");
            } else if(i < y) {
                System.out.printf(" ");
            }
        }
    }
}