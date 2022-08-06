import java.util.Scanner;

/**
 * Escreva um programa que, dado o valor da venda, imprima a comissao que devera ser
 * paga ao vendedor. Para calcular a comissao, considere a tabela abaixo:
 *      |        Venda mensal                                     |          Comissao          |
 *      | Maior ou igual a R$ 100.000,00                          | R$ 700,00 + 16% das vendas |
 *      | Menor que R$ 100.000,00 e maior ou igual a R$ 80.000,00 | R$ 650,00 + 14% das vendas |
 *      | Menor que R$ 80.000,00 e maior ou igual a R$ 60.000,00  | R$ 600,00 + 14% das vendas |
 *      | Menor que R$ 60.000,00 e maior ou igual a R$ 40.000,00  | R$ 550,00 + 14% das vendas |
 *      | Menor que R$ 40.000,00 e maior ou igual a R$ 20.000,00  | R$ 500,00 + 14% das vendas |
 *      | Menor que R$ 20.000,00                                  | R$ 400,00 + 14% das vendas |
 */
public class Desafio36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da venda R$ ");
        double venda = scanner.nextDouble();

        if (venda >= 100000)
            System.out.println("Comissao R$ " + (700 + (venda * 0.16)));
        else if (venda >= 80000)
            System.out.println("Comissao R$ " + (650 + (venda * 0.14)));
        else if (venda >= 60000)
            System.out.println("Comissao R$ " + (600 + (venda * 0.14)));
        else if (venda >= 40000)
            System.out.println("Comissao R$ " + (550 + (venda * 0.14)));
        else if (venda >= 20000)
            System.out.println("Comissao R$ " + (500 + (venda * 0.14)));
        else
            System.out.println("Comissao R$ " + (400 + (venda * 0.14)));

        scanner.close();
    }
}
