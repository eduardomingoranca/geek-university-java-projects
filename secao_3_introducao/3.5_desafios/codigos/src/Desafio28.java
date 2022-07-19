import java.util.Scanner;

/**
 * Faca a leitura de tres valores e apresente como resultado a soma dos quadrados dos
 * tres valores lidos.
 */
public class Desafio28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Informe o [" + i + "º] numero = ");
            double valores = scanner.nextDouble();

            soma += Math.pow(valores, 2);
        }

        System.out.println(" A soma do quadrado dos tres valores eh: " + soma);

        scanner.close();
    }
}
