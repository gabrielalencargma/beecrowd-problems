import java.util.*;

public class P_1020 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int idadeDias = leia.nextInt();

        int anos = idadeDias / 365;
        idadeDias %= 365;
       
        int meses = idadeDias / 30;
        idadeDias %= 30;
       
        System.out.printf("%d ano(s)\n", anos);
        System.out.printf("%d mes(es)\n", meses);
        System.out.printf("%d dia(s)\n", idadeDias);
    }
}