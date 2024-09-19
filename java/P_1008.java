import java.util.*;

public class P_1008 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numFuncionario = leia.nextInt();
        int horasTrabalhadas = leia.nextInt();
        double valorHora = leia.nextDouble();

        double salario = valorHora * horasTrabalhadas;

        System.out.printf("NUMBER = %d\n", numFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}