import java.util.Scanner;

/**
 * Uma empresa vende o mesmo produto para quatro diferentes estados. Cada estado
 * possui uma taxa diferente de imposto sobre o produto (MG 7%; SP 12%; RJ 15%; MS
 * 8%). Faca um programa em que o usuario entre com o valor e o estado destino do
 * produto e o programa retorne o preco final do produto acrescido do imposto do
 * estado em que ele sera vendido. Se o estado digitado nao for valido, mostrar
 * uma mensagem de erro.
 */
public class Desafio24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o preco do produto: R$ ");
        double preco = scanner.nextDouble();

        System.out.print("Informe o estado [MG | SP | RJ | MS]: ");
        String estado = scanner.next();

        switch (estado) {
            case "MG" -> System.out.println("R$ " + preco + " imposto R$ " + (preco * 0.07) +
                    " preco com imposto R$ " + (preco + (preco * 0.07)));
            case "SP" -> System.out.println("R$ " + preco + " imposto R$ " + (preco * 0.12) +
                    " preco com imposto R$ " + (preco + (preco * 0.12)));
            case "RJ" -> System.out.println("R$ " + preco + " imposto R$ " + (preco * 0.15) +
                    " preco com imposto R$ " + (preco + (preco * 0.15)));
            case "MS" -> System.out.println("R$ " + preco + " imposto R$ " + (preco * 0.08) +
                    " preco com imposto R$ " + (preco + (preco * 0.08)));
            default -> System.out.println("opcao invalida!");
        }

        scanner.close();
    }
}
