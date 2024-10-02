import java.util.*;

public class P_1154 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int somaIdades = 0;
        int qtdIdades = 0;

        while(true) {
            int idade = leia.nextInt();

            if (idade < 0) {
                break;
            }

            somaIdades += idade;
            qtdIdades++;
        }

        if(qtdIdades > 0) {
            double media = (double) somaIdades / qtdIdades;
            System.out.printf("%.2f\n", media);
        }
    }
}