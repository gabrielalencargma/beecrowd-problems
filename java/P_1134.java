import java.util.*;

public class P_1134 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int codigo, alcool = 0, gasolina = 0, diesel = 0;
  
        do {
            codigo = leia.nextInt(); 

            switch(codigo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    break;
            }
        } while(codigo != 4);

        System.out.printf("MUITO OBRIGADO\n");
        System.out.printf("Alcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);
    }
}