import java.util.*;

public class P_1019 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int duracaoEventoSeg = leia.nextInt();
       
        int horas = duracaoEventoSeg / 3600;
        duracaoEventoSeg %= 3600;

        int minutos = duracaoEventoSeg / 60;
        duracaoEventoSeg %= 60;
       
        System.out.printf("%d:%d:%d\n", horas, minutos, duracaoEventoSeg);
    }
}