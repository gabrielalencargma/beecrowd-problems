import java.util.*;

public class P_1044 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int a = leia.nextInt();
        int b = leia.nextInt();

        if(a % b == 0 || b % a == 0) {
            System.out.printf("Sao Multiplos\n");
        } else {
            System.out.printf("Nao sao Multiplos\n");
        }
    }
}