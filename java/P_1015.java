import java.util.*;

public class P_1015 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double x1 = leia.nextDouble();
        double y1 = leia.nextDouble();
       
        double x2 = leia.nextDouble();
        double y2 = leia.nextDouble();

        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf("%.4f\n", distancia);
    }
}