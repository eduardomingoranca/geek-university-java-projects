import java.util.Scanner;

/**
 * Faca programa que leia uma matriz 3 x 6 com valores reais.
 *      (a) Imprima a soma de todos os elementos das colunas impares.
 *      (b) Imprima a media aritmetica dos elementos da segunda e quarta colunas.
 *      (c) Substitua os valores da sexta coluna pela soma dos valores das colunas 1 e 2.
 *      (d) Imprima a matriz modificada.
 */
public class Desafio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matriz = new double[3][6];
        double soma = 0, somaMedia = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("MATRIZ [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (j % 2 != 0) soma += matriz[i][j];
                if (j == 1 || j == 3) somaMedia += matriz[i][j];
                matriz[i][5] = matriz[i][1] + matriz[i][2];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(" SOMA DAS COLUNAS IMPARES: " + soma);
        System.out.println(" MEDIA DA SEGUNDA E QUARTA: " + somaMedia/6.0);

        scanner.close();
    }
}
