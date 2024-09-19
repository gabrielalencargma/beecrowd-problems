import java.util.*;

public class P_1142 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numCount = 1;
        
        int n = leia.nextInt();
        
        for(int i=0; i<n; i++) {
            System.out.printf("%d %d %d PUM\n", numCount, numCount+1, numCount+2);
            numCount += 4;
        }
    }
}