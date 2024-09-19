import java.util.*;

public class P_1009 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        String nome = leia.next();
        double salarioFixo = leia.nextDouble();
        double totalVendas = leia.nextDouble();

        double salarioFinal = salarioFixo + (totalVendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);
    }
}