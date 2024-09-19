import java.util.*;

public class P_1011 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int raio = leia.nextInt();

        double volume = (4/3.0) * 3.14159 * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}