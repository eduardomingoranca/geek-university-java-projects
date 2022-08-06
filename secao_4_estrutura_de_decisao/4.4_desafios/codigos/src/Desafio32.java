import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

/**
 * Escrever um programa que leia o codigo do produto escolhido do cardapio de um lanchonete
 * e a quantidade. O programa deve calcular o valor a ser pago por aquele lanche. Considere
 * que a cada execucao somente sera calculado um pedido. O cardapio da lanchonete segue o
 * padrao abaixo:
 *               | Especificacao   |  Codigo  |   Preco  |
 *               | Cachorro Quente |   100    |   1.20   |
 *               | Bauru Simples   |   101    |   1.30   |
 *               | Bauru com Ovo   |   102    |   1.50   |
 *               | Hamburguer      |   103    |   1.20   |
 *               | Cheeseburguer   |   104    |   1.70   |
 *               | Suco            |   105    |   2.20   |
 *               | Refrigerante    |   106    |   1.00   |
 */
public class Desafio32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("================== CARDAPIO ==================");
        System.out.println("==============================================");
        System.out.println(" | Especificacao   |  Codigo  |    Preco    | ");
        System.out.println(" | Cachorro Quente |   100    |   R$ 1.20   | ");
        System.out.println(" | Bauru Simples   |   101    |   R$ 1.30   | ");
        System.out.println(" | Bauru com Ovo   |   102    |   R$ 1.50   | ");
        System.out.println(" | Hamburguer      |   103    |   R$ 1.20   | ");
        System.out.println(" | Cheeseburguer   |   104    |   R$ 1.70   | ");
        System.out.println(" | Suco            |   105    |   R$ 2.20   | ");
        System.out.println(" | Refrigerante    |   106    |   R$ 1.00   | ");
        System.out.println("==============================================");

        System.out.print("Informe uma opcao do cardapio: ");
        int opcao = scanner.nextInt();

        System.out.print("Informe a quantidade: ");
        int quantidade = scanner.nextInt();

        switch (opcao) {
            case 100, 103 -> System.out.println("TOTAL A PAGAR: R$ " + (quantidade * 1.20));
            case 101 -> System.out.println("TOTAL A PAGAR: R$ " + (quantidade * 1.30));
            case 102 -> System.out.println("TOTAL A PAGAR: R$ " + (quantidade * 1.50));
            case 104 -> System.out.println("TOTAL A PAGAR: R$ " + (quantidade * 1.70));
            case 105 -> System.out.println("TOTAL A PAGAR: R$ " + (quantidade * 2.20));
            case 106 -> System.out.println("TOTAL A PAGAR: R$ " + (quantidade * 1.00));
            default -> System.out.println("opcao invalida!");
        }

        scanner.close();
    }
}
