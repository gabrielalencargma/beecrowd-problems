import java.util.*;

public class P_1071 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int soma = 0;

        int x = leia.nextInt();
        int y = leia.nextInt();
    
        if(x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
    
        for(int i=x+1; i<y; i++) {
            if(i % 2 != 0) {
                soma += i;
            }
        }
        
        System.out.printf("%d\n", soma);
    }
}