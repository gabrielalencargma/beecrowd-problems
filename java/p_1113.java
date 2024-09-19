import java.util.*;

public class P_1113 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int x, y;

        do {
            x = leia.nextInt(); 
            y = leia.nextInt();

            if(x > y) {
                System.out.printf("Decrescente\n");
            }
            if(x < y) {
                System.out.printf("Crescente\n");
            }
        } while(x != y);
    }
}