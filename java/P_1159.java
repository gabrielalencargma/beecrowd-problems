import java.util.*;

public class P_1159 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        while(true) {
            int soma = 0;
            int x = leia.nextInt();

            if(x == 0) {
                break;
            }

            if (x % 2 != 0) {
                x++;
            }

            for(int i=0; i<5; i++) {
                soma += x;
                x += 2;
            }

            System.out.println(soma);
        }
    }
}