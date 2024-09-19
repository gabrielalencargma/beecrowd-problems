import java.util.*;

public class P_1101 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        while(true) {
            int m = leia.nextInt(); 
            int n = leia.nextInt();

            if (m <= 0 || n <= 0) {
                break;
            }
            
            int menor = Math.min(m, n);
            int maior = Math.max(m, n);
            int soma = 0;
            
            for (int i=menor; i<=maior; i++) {
                System.out.printf("%d ", i);
                soma += i;
            }

            System.out.printf("Sum=%d\n", soma);
        }
    }
}