import java.util.Scanner;

/**
 * Um produto vai sofrer aumento de acordo com a tabela abaixo. Leia o preco antigo,
 * calcule e escreva o preco novo, e escreva uma mensagem em funcao do preco novo (de
 * acordo com a segunda tabela).
 *          | PRECO ANTIGO         | PERCENTUAL DE AUMENTO |
 *          | ate R$ 50            |          5%           |
 *          | entre R$ 50 e R$ 100 |         10%           |
 *          | acima de R$ 100      |         15%           |
 *
 *          | PRECO NOVO                        |  MENSAGEM  |
 *          | ate R$ 80                         |  Barato    |
 *          | entre R$ 80 e R$ 120 (inclusive)  |  Normal    |
 *          | entre R$ 120 e R$ 200 (inclusive) |   Caro     |
 *          | acima de R$ 200                   | Muito caro |
 */
public class Desafio33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o preco do produto R$ ");
        double preco = scanner.nextDouble();

        double precoNovo;

        if (preco < 50.0)
            precoNovo = preco * 1.05;
        else if (preco >= 50.0 && preco <= 100.00)
            precoNovo = preco * 1.10;
        else
            precoNovo = preco * 1.15;

        if (precoNovo < 80.0)
            System.out.println("R$ " + precoNovo + " barato! ");
        else if (precoNovo >= 80.0 && precoNovo < 120.0)
            System.out.println("R$ " + precoNovo + " normal! ");
        else if (precoNovo >= 120.0 && precoNovo <= 200.0)
            System.out.println("R$ " + precoNovo + " caro! ");
        else
            System.out.println("R$ " + precoNovo + " muito caro! ");

        scanner.close();
    }
}
