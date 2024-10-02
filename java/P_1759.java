import java.util.*;

public class P_1759 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
    
        int n = leia.nextInt();
        
        for(int i=0; i<n-1; i++) {
            sb.append("Ho ");
        }

        sb.append("Ho!");
        
        System.out.println(sb.toString());
    }
}