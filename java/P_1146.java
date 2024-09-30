import java.util.*;

public class P_1146 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        while(true) {
            int x = leia.nextInt();

            if (x == 0) {
                break;
            }

            for(int i=1; i<=x; i++) {
                if(i == x) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " ");
                }
            }

            System.out.println();
        }
    }
}