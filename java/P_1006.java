import java.util.*;

public class P_1006 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double a = leia.nextDouble();
        double b = leia.nextDouble();
        double c = leia.nextDouble();

        a *= 2;
        b *= 3;
        c *= 5;

        double media = (a + b + c) / 10;

        System.out.printf("MEDIA = %.1f\n", media);
    }
}