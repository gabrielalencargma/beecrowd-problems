import java.util.*;

public class P_1066 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valPares = 0, valImpares = 0, valPositivos = 0, valNegativos = 0;
    
        for(int i=0; i<5; i++) {
            int valor = leia.nextInt();
            
            if(valor % 2 == 0) {
                valPares++;
            } else {
                valImpares++;
            }
            
            if(valor > 0) {
                valPositivos++;
            } else if(valor < 0) {
                valNegativos++;
            }
        }
        
        System.out.printf("%d valor(es) par(es)\n", valPares);
        System.out.printf("%d valor(es) impar(es)\n", valImpares);
        System.out.printf("%d valor(es) positivo(s)\n", valPositivos);
        System.out.printf("%d valor(es) negativo(s)\n", valNegativos);
    }
}