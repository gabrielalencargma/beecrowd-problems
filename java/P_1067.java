import java.util.*;

public class P_1067 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int x = leia.nextInt();
        
        for(int i=1; i<=x; i++) {
            if(i % 2 != 0) { 	
                System.out.printf("%d\n", i);
            }
        }
    }
}