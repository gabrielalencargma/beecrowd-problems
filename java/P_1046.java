import java.util.*;

public class P_1046 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
       
        int horaInicial = leia.nextInt();
        int horaFinal = leia.nextInt();

        int duracao = horaFinal - horaInicial;

        if(duracao < 1) {
            duracao = duracao + 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
    }
}