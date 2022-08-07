import java.util.Scanner;

/**
 * Uma empresa decide dar um aumento aos seus funcionarios de acordo com uma tabela
 * que considera o salario atual e o tempo de servico de cada funcionario. Os funcionarios
 * com menor salario terao um aumento proporcionalmente maior do que os funcionarios
 * com um salario maior, e conforme o tempo de servico na empresa, cada funcionario ira
 * receber um bonus adicional de salario. Faca um programa que leia:
 *      * o valor do salario atual do funcionario;
 *      * o tempo de servico desse funcionario na empresa (numero de anos de trabalho na
 *      empresa).
 * Use as tabelas abaixo para calcular o salario reajustado deste funcionario e imprima o
 * valor do salario final reajustado, ou uma mensagem caso o funcionario nao tenha direito
 * a nenhum aumento.
 *      | Salario Atual    | Reajuste (%) | Tempo de Servico |  Bonus    |
 *      | Ate 500.00       |    25%       | Abaixo de 1 ano  | Sem bonus |
 *      | Ate 1000.00      |    20%       | De 1 a 3 anos    |  100.00   |
 *      | Ate 1500.00      |    15%       | De 4 a 6 anos    |  200.00   |
 *      | Ate 2000.00      |    10%       | De 7 a 10 anos   |  300.00   |
 *      | Acima de 2000.00 | Sem reajuste | Mais de 10 anos  |  500.00   |
 */
public class Desafio39 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salario atual R$ ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Informe o tempo de servico: ");
        double tempoServico = scanner.nextDouble();

        if (salarioAtual <= 500.00) {
            if (tempoServico < 1)
                System.out.println("Salario Novo: R$ " + salarioAtual * 1.25);
            else if (tempoServico <= 3)
                System.out.println("Salario Novo: R$ " + ((salarioAtual * 1.25) + 100.00));
            else if (tempoServico <= 6)
                System.out.println("Salario Novo: R$ " + ((salarioAtual * 1.25) + 200.00));
            else if (tempoServico <= 10)
                System.out.println("Salario Novo: R$ " + ((salarioAtual * 1.25) + 300.00));
            else
                System.out.println("Salario Novo: R$ " + ((salarioAtual * 1.25) + 500.00));
        } else if (salarioAtual <= 1000.00) {
            if (tempoServico < 1)
                System.out.println("Salario Novo: R$ " + salarioAtual * 1.20);
            else if (tempoServico <= 3)
                System.out.println("Salario Novo: R$ " + ((salarioAtual * 1.20) + 100.00));
            else if (tempoServico <= 6)
                System.out.println("Salario Novo: R$ " + ((salarioAtual * 1.20) + 200.00));
            else if (tempoServico <= 10)
                System.out.println("Salario Novo: R$ " + ((salarioAtual * 1.20) + 300.00));
            else
                System.out.println("Salario Novo: R$ " + ((salarioAtual * 1.20) + 500.00));
        } else if (salarioAtual <= 1500.00) {
            if (tempoServico < 1)
                System.out.println("Salario Novo: R$ " + salarioAtual * 1.15);
            else if (tempoServico <= 3)
                System.out.println("Salario Novo: R$ " + ((salarioAtual * 1.15) + 100.00));
            else if (tempoServico <= 6)
                System.out.println("Salario Novo: R$ " + ((salarioAtual * 1.15) + 200.00));
            else if (tempoServico <= 10)
                System.out.println("Salario Novo: R$ " + ((salarioAtual * 1.15) + 300.00));
            else
                System.out.println("Salario Novo: R$ " + ((salarioAtual * 1.15) + 500.00));
        } else if (salarioAtual <= 2000.00) {
            if (tempoServico < 1)
                System.out.println("Salario Novo: R$ " + salarioAtual * 1.10);
            else if (tempoServico <= 3)
                System.out.println("Salario Novo: R$ " + ((salarioAtual * 1.10) + 100.00));
            else if (tempoServico <= 6)
                System.out.println("Salario Novo: R$ " + ((salarioAtual * 1.10) + 200.00));
            else if (tempoServico <= 10)
                System.out.println("Salario Novo: R$ " + ((salarioAtual * 1.10) + 300.00));
            else
                System.out.println("Salario Novo: R$ " + ((salarioAtual * 1.10) + 500.00));
        } else {
            if (tempoServico < 1)
                System.out.println("Salario Novo: R$ " + salarioAtual);
            else if (tempoServico <= 3)
                System.out.println("Salario Novo: R$ " + (salarioAtual + 100.00));
            else if (tempoServico <= 6)
                System.out.println("Salario Novo: R$ " + (salarioAtual + 200.00));
            else if (tempoServico <= 10)
                System.out.println("Salario Novo: R$ " + (salarioAtual + 300.00));
            else
                System.out.println("Salario Novo: R$ " + (salarioAtual  + 500.00));
        }

        scanner.close();
    }
}
