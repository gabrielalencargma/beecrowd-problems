import java.util.*;

public class P_1099 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int n = leia.nextInt();
        
        for(int i=0; i<n; i++) {
            int x = leia.nextInt();
            int y = leia.nextInt();
            int soma = 0;
            
            if(x > y) {
                int temp = x;
                x = y;
                y = temp;
            }
            
            for(int j=x+1; j<y; j++) {
                if (j % 2 != 0) {
                    soma += j;
                }
            }
            
            System.out.printf("%d\n", soma);
        }
    }
}