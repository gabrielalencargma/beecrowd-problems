import java.util.*;

public class P_1038 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[] valorItens = {4.00, 4.50, 5.00, 2.00, 1.50};
       
        int codigo = leia.nextInt();
        int quantidade = leia.nextInt();

        double total = valorItens[codigo-1] * quantidade;
       
        System.out.printf("Total: R$ %.2f\n", total);
    }
}