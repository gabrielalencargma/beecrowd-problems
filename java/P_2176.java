import java.util.*;

public class P_2176 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int qtdBitsUm = 0;

        String s = leia.next();

        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '1') {
                qtdBitsUm++;
            }
        }

        if(qtdBitsUm % 2 == 0){
            System.out.println(s + "0");
        } else {
            System.out.println(s + "1");
        }
    }
}