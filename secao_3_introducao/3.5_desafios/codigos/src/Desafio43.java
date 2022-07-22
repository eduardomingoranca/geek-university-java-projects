import java.util.Scanner;

/**
 * Escreva um programa de ajuda para vendedores. A partir de um valor total lido, mostre:
 *      > o total a pagar com desconto de 10%;
 *      > o valor de cada parcela, no parcelamento de 3x sem juros;
 *      > a comissao do vendedor, no caso da venda ser a vista (5% sobre o valor com desconto)
 *      > a comissao do vendedor, no caso da venda ser parcelada (5% sobre o valor total)
 */
public class Desafio43 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor total: R$ ");
        double valorTotal = scanner.nextDouble();

        double desconto = valorTotal - (valorTotal * 0.10);
        double parcelamento = valorTotal / 3.0;

        double comissaoAVista = desconto * 0.05;
        double comissaoParcelada = valorTotal * 0.05;

        System.out.println("O total a pagar com desconto de 10% eh: R$ " + desconto);
        System.out.println("O valor de cada parcela, no parcelamento de 3x sem juros eh: R$ " + parcelamento);
        System.out.println("A comissao do vendedor, no caso da venda ser a vista (5% sobre o valor com desconto) eh: R$ "
                + comissaoAVista);
        System.out.println("a comissao do vendedor, no caso da venda ser parcelada (5% sobre o valor total) eh: R$ " +
                comissaoParcelada);

        scanner.close();
    }
}
