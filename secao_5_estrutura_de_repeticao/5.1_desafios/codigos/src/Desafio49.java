import java.util.Scanner;

/**
  O funcionario chamado Carlos tem um colega chamado Joao que recebe um salario que
  equivale a um terco do seu salario. Carlos gosta de fazer aplicacoes na caderneta de
  poupanca e vai aplicar seu salario integralmente nela, pois esta rendendo 2% ao mes.
  Joao aplicara seu salario integralmente no fundo de renda fixa, que esta rendendo 5%
  ao mes. Construa um programa que devera calcular e mostrar a quantidade de meses
  necessarios para que o valor pertencente a Joao iguale ou ultrapasse o valor pertencente
  a Carlos. Teste com outros valores para as taxas.
 */
public class Desafio49 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salario de Carlos R$ ");
        double salarioCarlos = scanner.nextDouble();

        int meses = 1;

        double rentabilidadeCarlos = (salarioCarlos * ((2.0/100) + salarioCarlos));
        double rentabilidadeJoao = ((salarioCarlos / 3.0) * ((5.0/100) + (salarioCarlos / 3.0)));

        while (rentabilidadeJoao < rentabilidadeCarlos) {
            rentabilidadeJoao = (rentabilidadeJoao * ((5.0/100) + rentabilidadeJoao));
            rentabilidadeCarlos = (rentabilidadeCarlos * ((2.0/100) + salarioCarlos));
            meses++;
        }

        System.out.println("TOTAL DE MESES: " + meses);

        scanner.close();
    }
}
