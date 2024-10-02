import java.util.*;

public class P_1164 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();
        
        for(int i=0; i<n; i++) {
            int soma = 0;
            int x = leia.nextInt();

            for(int j=1; j<=x/2; j++) {
                if(x % j == 0) {
                    soma += j;
                }
            }

            if(soma == x) {
                System.out.printf("%d eh perfeito\n", x);
            } else {
                System.out.printf("%d nao eh perfeito\n", x);
            }
        }
    }
}