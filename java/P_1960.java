import java.util.*;

public class P_1960 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numArabicos = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numRomanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();

        int n = leia.nextInt();
        
        for(int i=0; i<numArabicos.length; i++) {
            while(n >= numArabicos[i]) {
                sb.append(numRomanos[i]);
                n -= numArabicos[i];
            }
        }
        
        System.out.printf("%s\n", sb.toString());
    }
}