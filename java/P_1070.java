import java.util.*; 

public class P_1070 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int qtdImpares = 0;
        
        int x = leia.nextInt();

        while(qtdImpares < 6) {
            if(x % 2 != 0) {
                System.out.printf("%d\n", x);
                qtdImpares++;
            }

            x++;
        }
    }
}