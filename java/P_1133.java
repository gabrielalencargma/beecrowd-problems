import java.util.*;

public class P_1133 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int x = leia.nextInt();
        int y = leia.nextInt();
        
        if(x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        for(int i=x+1; i<y; i++) {
            if(i % 5 == 2 || i % 5 == 3) {
                System.out.printf("%d\n", i);
            }
        }
    }
}