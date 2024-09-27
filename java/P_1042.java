import java.util.*;

public class P_1042 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int val1 = leia.nextInt();
        int val2 = leia.nextInt();
        int val3 = leia.nextInt();

        int valMenor = Math.min(Math.min(val1, val2), val3);
        int valMaior = Math.max(Math.max(val1, val2), val3);
        int valMeio = (val1 + val2 + val3) - valMaior - valMenor;

        System.out.printf("%d\n", valMenor);
        System.out.printf("%d\n", valMeio);
        System.out.printf("%d\n\n", valMaior);

        System.out.printf("%d\n", val1);
        System.out.printf("%d\n", val2);
        System.out.printf("%d\n", val3);
    }
}