import java.util.*;

public class P_1079 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int n = leia.nextInt();
        
        for(int i=0; i<n; i++) {
            double v1 = leia.nextDouble();
            double v2 = leia.nextDouble();
            double v3 = leia.nextDouble();

            double mediaPonderada = ((v1 * 2) + (v2 * 3) + (v3 * 5)) / (2 + 3 + 5);
            
            System.out.printf("%.1f\n", mediaPonderada);
        }
    }
}