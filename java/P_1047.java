import java.util.*;
 
public class P_1047 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int horaInicial = leia.nextInt();
        int minutoInicial = leia.nextInt();
        int horaFinal = leia.nextInt();
        int minutoFinal = leia.nextInt();

        int duracaoMinutos = (horaFinal * 60) + minutoFinal - (horaInicial * 60) - minutoInicial;

    	if(horaInicial > horaFinal || horaInicial == horaFinal && minutoInicial >= minutoFinal) {
            duracaoMinutos += 1440;
    	}

        int duracaoHoras = duracaoMinutos / 60;
        duracaoMinutos -= duracaoHoras * 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoHoras, duracaoMinutos);
    }
}