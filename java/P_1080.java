import java.util.*;

public class P_1080 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valorPosicao = 0, valorMaior = Integer.MIN_VALUE;

        for(int i=1; i<=100; i++) {
            int valor = leia.nextInt();

            if(valor > valorMaior) {
                valorMaior = valor;
                valorPosicao = i;
            }
        }

        System.out.printf("%d\n", valorMaior);
        System.out.printf("%d\n", valorPosicao);
    }
}