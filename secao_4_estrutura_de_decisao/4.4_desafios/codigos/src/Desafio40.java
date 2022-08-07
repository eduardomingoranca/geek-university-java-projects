import java.util.Scanner;

/**
 * O custo ao consumidor de um carro novo eh a soma do custo de fabrica, da comissao
 * do distribuidor, e dos impostos. A comissao e os impostos sao calculados sobre o custo
 * de fabrica, de acordo com a tabela abaixo. Leia o custo de fabrica e escreva o custo ao
 * consumidor.
 *      |         CUSTO DE FABRICA           | % DO DISTRIBUIDOR | % DOS IMPOSTOS |
 *      | ate R$ 12.000,00                   |        5          |    isento      |
 *      | entre R$ 12.000,00 e R$ 25.000,00  |       10          |      15        |
 *      | acima de R$ 25.000,00              |       15          |      20        |
 */
public class Desafio40 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o custo de fabrica R$ ");
        double custoFabrica = scanner.nextDouble();

        if (custoFabrica < 12_000.00)
            System.out.println("O custo do consumidor R$ " + (custoFabrica * 1.05));
        else if (custoFabrica <= 25_000.00)
            System.out.println("O custo do consumidor R$ " + ((custoFabrica * 0.10) + (custoFabrica * 0.15)
                    + custoFabrica));
        else System.out.println("O custo do consumidor R$ " + ((custoFabrica * 0.10) + (custoFabrica * 0.20)
                    + custoFabrica));

        scanner.close();
    }
}
