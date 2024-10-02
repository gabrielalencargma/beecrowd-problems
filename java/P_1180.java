import java.util.*;

public class P_1180 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valMenor = Integer.MAX_VALUE, valPosicao = 0;
    
        int n = leia.nextInt();
        
        int[] x = new int[n];
        
        for(int i=0; i<n; i++) {
            x[i] = leia.nextInt();
            
            if(x[i] < valMenor) {
                valMenor = x[i];
                valPosicao = i;
            }
        }
        
        System.out.printf("Menor valor: %d\n", valMenor);
        System.out.printf("Posicao: %d\n", valPosicao);
    }
}