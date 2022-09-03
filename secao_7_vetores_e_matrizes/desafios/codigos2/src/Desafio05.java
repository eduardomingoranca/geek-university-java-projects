import java.util.Scanner;

/**
  Leia uma matriz 5 x 5. Leia tambem um valor X. O programa devera fazer uma busca
  desse valor na matriz e, ao final, escrever a localizacao (linha e coluna) ou uma
  mensagem de "nao encontrado".
 */
public class Desafio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matz = new double[5][5];

        for (int i = 0; i < matz.length; i++) {
            for (int j = 0; j < matz.length; j++) {
                System.out.print("MATRIZ [" + i + "][" + j + "]: ");
                matz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("X: ");
        double x = scanner.nextDouble();

        int aux = 0;

        for (int i = 0; i < matz.length; i++) {
            for (int j = 0; j < matz.length; j++) {
                if (x == matz[i][j]) {
                    System.out.println("NUMERO " + x + " ESTA NA POSICAO [" + i + "][" + j + "]");
                    aux = 1;
                }
            }
        }

        if (aux == 0) System.out.println("NUMERO NAO ENCONTRADO");

        scanner.close();
    }
}
