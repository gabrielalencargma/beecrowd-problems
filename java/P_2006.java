import java.util.*;

public class P_2006 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int qtdAcertos = 0;

        int t = leia.nextInt();

        for(int i = 1; i <= 5; i++){
            int resposta = leia.nextInt();
            if(resposta == t){
                qtdAcertos++;
            }
        }

        System.out.println(qtdAcertos);
    }
}