import java.util.*;

public class P_1963 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double a = leia.nextDouble();
        double b = leia.nextDouble();

        double porcentagemAumento = 100 * (b / a) - 100;

        System.out.printf("%.2f%%\n", porcentagemAumento);
    }
}