import java.util.*;

public class P_2670 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int a1 = leia.nextInt();
        int a2 = leia.nextInt();
        int a3 = leia.nextInt();

        int tempoAndar1 = (a2 * 2) + (a3 * 4);
        
        int tempoAndar2 = (a1 * 2) + (a3 * 2);
        
        int tempoAndar3 = (a1 * 4) + (a2 * 2);
        
        int menorTempo = Math.min(tempoAndar1, Math.min(tempoAndar2, tempoAndar3));
        
        System.out.println(menorTempo);
    }
}