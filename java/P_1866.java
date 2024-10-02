import java.util.*;

class P_1866 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
    
        int c = leia.nextInt();
        
        for(int i=0; i<c; i++) {
            int n = leia.nextInt();

            if(n % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
}