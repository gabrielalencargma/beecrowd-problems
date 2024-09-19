import java.util.*;

public class P_1018 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] qtdCedulas = new int[7], cedulas = {100, 50, 20, 10, 5, 2, 1};

        int valor = leia.nextInt();

        System.out.printf("%d\n", valor);
       
        for(int i=0; i<7; i++) {
            if(valor >= cedulas[i]) {
                qtdCedulas[i] += 1;
                valor -= cedulas[i];
                i -= 1;
            }
        }

        System.out.printf("%d nota(s) de R$ 100,00\n", qtdCedulas[0]);
        System.out.printf("%d nota(s) de R$ 50,00\n", qtdCedulas[1]);
        System.out.printf("%d nota(s) de R$ 20,00\n", qtdCedulas[2]);
        System.out.printf("%d nota(s) de R$ 10,00\n", qtdCedulas[3]);
        System.out.printf("%d nota(s) de R$ 5,00\n", qtdCedulas[4]);
        System.out.printf("%d nota(s) de R$ 2,00\n", qtdCedulas[5]);
        System.out.printf("%d nota(s) de R$ 1,00\n", qtdCedulas[6]);
    }
}