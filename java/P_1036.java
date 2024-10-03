import java.util.*;

public class P_1036 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double a = leia.nextDouble();
        double b = leia.nextDouble();
        double c = leia.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);
        
        if(delta < 0 || a <= 0) {
            System.out.println("Impossivel calcular");
            return;
        }

        if(delta == 0) {
            double r = -(b) / (2 * a);
            System.out.printf("%.5f\n", r);
            return;
        }

        delta = Math.sqrt(delta);
        double r1 = (-(b) + delta) / (2 * a);
        double r2 = (-(b) - delta) / (2 * a);
        System.out.printf("R1 = %.5f\n", r1);
        System.out.printf("R2 = %.5f\n", r2);
    }
}