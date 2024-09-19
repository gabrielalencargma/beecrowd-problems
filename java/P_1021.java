import java.util.*;

public class P_1021 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int [] qtdDinheiro = new int[12];
        double[] dinheiro = {100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01};

        double valor = leia.nextDouble();
       
        for(int i=0; i<12; i++) {
            while(valor >= dinheiro[i]) {
                qtdDinheiro[i] += 1;
                valor -= dinheiro[i];
                valor = Math.round(valor * 100.0) / 100.0;
            }
        }

        System.out.printf("NOTAS:\n");
        System.out.printf("%d nota(s) de R$ 100.00\n", qtdDinheiro[0]);
        System.out.printf("%d nota(s) de R$ 50.00\n", qtdDinheiro[1]);
        System.out.printf("%d nota(s) de R$ 20.00\n", qtdDinheiro[2]);
        System.out.printf("%d nota(s) de R$ 10.00\n", qtdDinheiro[3]);
        System.out.printf("%d nota(s) de R$ 5.00\n", qtdDinheiro[4]);
        System.out.printf("%d nota(s) de R$ 2.00\n", qtdDinheiro[5]);
        System.out.printf("MOEDAS:\n");
        System.out.printf("%d moeda(s) de R$ 1.00\n", qtdDinheiro[6]);
        System.out.printf("%d moeda(s) de R$ 0.50\n", qtdDinheiro[7]);
        System.out.printf("%d moeda(s) de R$ 0.25\n", qtdDinheiro[8]);
        System.out.printf("%d moeda(s) de R$ 0.10\n", qtdDinheiro[9]);
        System.out.printf("%d moeda(s) de R$ 0.05\n", qtdDinheiro[10]);
        System.out.printf("%d moeda(s) de R$ 0.01\n", qtdDinheiro[11]);
    }
}