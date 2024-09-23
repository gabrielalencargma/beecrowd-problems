import java.util.*;

public class P_1074 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int n = leia.nextInt();

        for (int i = 0; i < n; i++) {
            int x = leia.nextInt();
            
            if (x == 0) {
                System.out.printf("NULL\n");
            } else {
                if (x % 2 == 0) { 
                    System.out.printf("EVEN ");
                } else { 
                    System.out.printf("ODD ");
                }

                if (x > 0) { 
                    System.out.printf("POSITIVE\n");
                } 
                if (x < 0) {
                    System.out.printf("NEGATIVE\n");
                }
            }
        }
    }
}