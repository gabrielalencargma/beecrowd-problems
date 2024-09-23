import java.util.*;

public class P_1040 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double n1 = leia.nextDouble();
        double n2 = leia.nextDouble();
        double n3 = leia.nextDouble();
        double n4 = leia.nextDouble();

        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / (2 + 3 + 4 + 1);
        media = Math.floor(media * 100) / 100;
        
        System.out.printf("Media: %.1f\n", media);
        
        if(media >= 7) {
            System.out.printf("Aluno aprovado.\n");
        } else if(media < 5) {
            System.out.printf("Aluno reprovado.\n");
        } else {
            System.out.printf("Aluno em exame.\n");

            double n5 = leia.nextDouble();

            System.out.printf("Nota do exame: %.1f\n", n5);

            if(n5 >= 5) {
                System.out.printf("Aluno aprovado.\n");
            } else {
                System.out.printf("Aluno reprovado.\n");
            }

            media = (media + n5) / 2;
            
            System.out.printf("Media final: %.1f\n", media);
        }
    }
}