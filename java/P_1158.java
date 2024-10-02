import java.util.*;

public class P_1158 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int n = leia.nextInt();

        for(int i=0; i<n; i++) {
            int soma = 0;
            int x = leia.nextInt();
            int y = leia.nextInt();

            if(x % 2 == 0) {
                x++;
            }
            
            for(int j=0; j<y; j++) {
                soma += x;
                x += 2;
            }

            System.out.println(soma);
        }
    }
}