import java.util.*;

public class P_1064 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valPositivos = 0;
        double somaPositivos = 0;
 
        for(int i=0; i<6; i++) {   
            double valor = leia.nextDouble();
        
            if(valor > 0) {
                valPositivos++;
                somaPositivos += valor;
            }
        }
         
        double media = somaPositivos / valPositivos;
        
        System.out.printf("%d valores positivos\n", valPositivos);
        System.out.printf("%.1f\n", media);
    }
}