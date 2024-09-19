import java.util.*;

public class P_1005 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double a = leia.nextDouble();
        double b = leia.nextDouble();

        a *= 3.5;
        b *= 7.5;
        
        double media = (a + b) / 11;

        System.out.printf("MEDIA = %.5f\n", media);
    }
}