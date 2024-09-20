import java.util.*;

public class P_1065 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valPares = 0;
        
        for(int i=0; i<5; i++) {
            int valor = leia.nextInt();
        
            if(valor % 2 == 0) {
                valPares++;
            }
        }
        
        System.out.printf("%d valores pares\n", valPares);
    }
}