import java.util.Scanner;

/**
  Escreva uma funcao que receba um numero inteiro maior do que zero e retorne a soma
  de todos os seus algarismos. Por exemplo, ao numero 251 correspondera o valor 8 (2
  + 5 + 1). Se o numero lido nao for maior do que zero, o programa terminara com a
  mensagem "NUMERO INVALIDO".
 */
public class Desafio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int numero = scanner.nextInt();

        if (numero <= 0) System.out.println("NUMERO INVALIDO!");
        else {
            int soma = 0;
            while (numero > 0) {
                soma += numero % 10;
                numero /= 10;
            }
            System.out.println("A soma dos algarismos eh: " + soma);
        }

        scanner.close();
    }

}
