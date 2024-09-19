import java.util.*;

public class P_1017 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int tempoViagem = leia.nextInt();
        int velocidadeMedia = leia.nextInt();

        double distancia = velocidadeMedia * tempoViagem;

        double qtdCombustivel = distancia / 12;

        System.out.printf("%.3f\n", qtdCombustivel);
    }
}
