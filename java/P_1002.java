import java.util.*;

public class P_1002 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double raio = leia.nextDouble();
       
        double area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("A=%.4f\n", area);
    }
}