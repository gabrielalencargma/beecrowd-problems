import java.util.*;
 
public class P_1060 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valPositivos = 0;
        
        for(int i=0; i<6; i++) {
            double valor = leia.nextDouble();
            
            if(valor > 0) {
                valPositivos += 1;
            }
        }

        System.out.printf("%d valores positivos\n", valPositivos);
    }
}