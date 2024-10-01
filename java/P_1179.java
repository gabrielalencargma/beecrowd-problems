import java.util.*;

class P_1179 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        StringBuilder sbPar = new StringBuilder(), sbImpar = new StringBuilder();
        int[] valPares = new int[5], valImpares = new int[5];
        int qtdPares = 0, qtdImpares = 0;

        for(int i=0; i<15; i++) {
            int v = leia.nextInt();
            
            if(v % 2 == 0) {
                valPares[qtdPares] = v;
                sbPar.append(String.format("par[%d] = %d\n", qtdPares, valPares[qtdPares]));
                qtdPares++;
                if(qtdPares == 5) {
                    qtdPares = 0;
                    System.out.print(sbPar.toString());
                    sbPar.setLength(0);
                }
            } else {
                valImpares[qtdImpares] = v;
                sbImpar.append(String.format("impar[%d] = %d\n", qtdImpares, valImpares[qtdImpares]));
                qtdImpares++;
                if(qtdImpares == 5) {
                    qtdImpares = 0;
                    System.out.print(sbImpar.toString());
                    sbImpar.setLength(0);
                } 
            }
            
        }
        
        System.out.print(sbImpar.toString());
        System.out.print(sbPar.toString());
    }
}