import java.util.*;

public class P_2059 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int p = leia.nextInt();
        int j1 = leia.nextInt();
        int j2 = leia.nextInt();
        int r = leia.nextInt();
        int a = leia.nextInt();

        if(r == 1 && a == 1) {
            System.out.println("Jogador 2 ganha!");
        } else if(r == 1 && a == 0) {
            System.out.println("Jogador 1 ganha!");
        } else if(r == 0 && a == 1) {
            System.out.println("Jogador 1 ganha!");
        } else {
            int soma = j1 + j2;

            if((soma % 2 == 0 && p == 1) || (soma % 2 != 0  && p == 0)) {
                System.out.println("Jogador 1 ganha!");
            } else {
                System.out.println("Jogador 2 ganha!");
            }
        }
    }
}