import java.util.Scanner;

/**
 * Faca um programa que permita ao usuario entrar com uma matriz de 3 x 3 numeros
 * inteiros. Em seguida, gere um array unidimensional pela soma dos numeros de cada
 * coluna da matriz e mostrar na tela esse array. Por exemplo, a matriz:
 *          5  -8  10
 *          1   2  15
 *         25  10   7
 * Vai gerar um vetor, onde cada posicao eh a soma das colunas da matriz. A primeira
 * posicao sera 5 + 1 + 25, e assim por diante:
 *  31  4  3
 */
public class Desafio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] mat = new int[3][3];
        int[] soma = new int[3];
        int adicao = 0, adicao2 = 0, adicao3 = 0;

        int a = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("MATRIZ[" + i + "][" + j + "]: ");
                mat[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(" " + mat[i][j]);

            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            adicao += mat[i][0];
            adicao2 += mat[i][1];
            adicao3 += mat[i][2];
            soma[0] = adicao;
            soma[1] = adicao2;
            soma[2] = adicao3;
        }

        System.out.println();
        for (int j : soma) System.out.print(" " + j);

        scanner.close();
    }
}
