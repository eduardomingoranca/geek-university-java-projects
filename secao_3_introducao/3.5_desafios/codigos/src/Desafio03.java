import java.util.Scanner;

/**
 * Peca ao usuario para digitar tres valores inteiros e imprima a soma deles.
 */
public class Desafio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Informe o " + i + "º numero = ");
            int numero = scanner.nextInt();

            soma = soma + numero;
        }

        System.out.println("A soma dos tres numeros eh: " + soma);

        scanner.close();
    }
}
