import java.util.Scanner;

/**
 * Na matriz de 20 x 20 abaixo, quatro numeros ao longo de uma linha diagonal foram
 * marcadas em negrito. O produto desses numeros eh 26 * 63 * 78 * 14 = 1788696.
 * Qual eh o maior produto de quatro numeros adjacentos em qualquer direcao (cima, baixo,
 * esquerda, direita, ou na diagonal) na matriz de 20 x 20?
 */
public class Desafio24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] m = new int[20][20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("M [" + i + "][" + j + "]: ");
                m[i][j] = scanner.nextInt();
            }
        }

        int produto, maiorProduto = 1;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (j > 3 && i < 17) {
                    produto = m[i][j] * m[i+1][j-1] * m[i+2][j-2] * m[i+3][j-3];
                    if (produto > maiorProduto) maiorProduto = produto;
                }
                if (j < 17) {
                    produto = m[i][j] * m[i][j+1] * m[i][j+2] * m[i][j+3];
                    if (produto > maiorProduto) maiorProduto = produto;
                }
                if (j < 17 && i < 17) {
                    produto = m[i][j] * m[i+1][j+1] * m[i+2][j+2] * m[i+3][j+3];
                    if (produto > maiorProduto) maiorProduto = produto;
                }
            }
        }

        System.out.println(" MAIOR PRODUTO: " + maiorProduto);

        scanner.close();
    }
}
