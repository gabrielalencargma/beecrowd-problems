import java.util.*;

public class P_1013 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int val1 = leia.nextInt();
        int val2 = leia.nextInt();
        int val3 = leia.nextInt();

        int valMaior = (val1 + val2 + Math.abs(val1 - val2)) / 2;
        int valMaior = (valMaior + val3 + Math.abs(valMaior - val3)) / 2;

        System.out.printf("%d eh o maior\n", valMaior);
    }
}