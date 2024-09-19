import java.util.*;

public class P_1004 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int valor1 = leia.nextInt();
        int valor2 = leia.nextInt();

        int prod = valor1 * valor2;

        System.out.printf("PROD = %d\n", prod);
    }
}