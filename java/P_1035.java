import java.util.*;

public class P_1035 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int a = leia.nextInt();
        int b = leia.nextInt();
        int c = leia.nextInt();
        int d = leia.nextInt();
       
        if(b>c && d>a && c+d>a+b && c>0 && d>0 && a%2==0) {
            System.out.printf("Valores aceitos\n");
        } else {
            System.out.printf("Valores nao aceitos\n");
        }
    }
}