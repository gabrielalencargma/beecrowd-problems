import java.util.*;

public class P_1014 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int x = leia.nextInt();
        double y = leia.nextDouble();

        double consumo = x / y;

        System.out.printf("%.3f km/l\n", consumo);
    }
}