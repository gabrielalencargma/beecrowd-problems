import java.util.*;

public class P_1010 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int codPeca1 = leia.nextInt();
        int qtdPeca1 = leia.nextInt();
        double valPeca1 = leia.nextDouble();
       
        int codPeca2 = leia.nextInt();
        int qtdPeca2 = leia.nextInt();
        double valPeca2 = leia.nextDouble();

        double valTotal = (valPeca1 * qtdPeca1) + (valPeca2 * qtdPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valTotal);
    }
}