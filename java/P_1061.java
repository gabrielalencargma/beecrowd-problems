import java.util.*;

public class P_1061 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
       
        leia.skip("Dia");
        int diaInicial = leia.nextInt();
        int horaInicial = leia.nextInt();
        leia.skip(" :");
        int minutoIncial = leia.nextInt();
        leia.skip(" :");
        int segundoInicial = leia.nextInt();

        leia.skip("\nDia");
        int diaFinal = leia.nextInt();
        int horaFinal = leia.nextInt();
        leia.skip(" :");
        int minutoFinal = leia.nextInt();
        leia.skip(" :");
        int segundoFinal = leia.nextInt();

        int duracaoSegundos = (diaFinal * 86400) + (horaFinal * 3600) + (minutoFinal * 60) + segundoFinal - (diaInicial * 86400) - (horaInicial * 3600) - (minutoIncial * 60) - segundoInicial;

        int duracaoDias = duracaoSegundos / 86400;
        duracaoSegundos %= 86400;
        int duracaoHoras = duracaoSegundos / 3600;
        duracaoSegundos %= 3600;
        int duracaoMinutos = duracaoSegundos / 60;
        duracaoSegundos %= 60;

        System.out.printf("%d dia(s)\n", duracaoDias);
        System.out.printf("%d hora(s)\n", duracaoHoras);
        System.out.printf("%d minuto(s)\n", duracaoMinutos);
        System.out.printf("%d segundo(s)\n", duracaoSegundos);
    }
}