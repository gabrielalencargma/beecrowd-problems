import java.util.*;

public class P_1072 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int in = 0, out = 0;
        
        int n = leia.nextInt();

        for (int i = 0; i < n; i++) {
            int x = leia.nextInt();
            
            if (x >= 10 && x <= 20) {
                in++; 
            } else {
                out++; 
            }
        }
        
        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);
    }
}