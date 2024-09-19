import java.util.*;

public class P_1114 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int scanSenha, senha = 2002;

        do {
            scanSenha = leia.nextInt(); 

            if(scanSenha == senha) {
                System.out.printf("Acesso Permitido\n");
            } else {
                System.out.printf("Senha Invalida\n");
            }
        } while(scanSenha != senha);
    }
}