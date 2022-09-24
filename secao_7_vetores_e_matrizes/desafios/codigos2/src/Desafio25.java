import java.util.Scanner;

/**
 * Faca um programa para determinar a proxima jogada em um Jogo da Velha. Assumir que
 * o tabuleiro eh representado por uma matriz de 3 x 3, onde cada posicao representa uma
 * das casas do tabuleiro. A matriz pode conter os seguintes valores -1, 0, 1 representando
 * respectivamente uma casa contendo uma peca minha (-1), uma casa vazia do tabuleiro (0),
 * e uma casa contendo uma peca do meu oponente (1).
 * Exemplo:
 *              | -1 |  1 | 1 |
 *              | -1 | -1 | 0 |
 *              | 0  |  1 | 0 |
 */
public class Desafio25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("    JOGO DA VELHA       ");
        System.out.println("========================");

        int[][] jogoVelha = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("JOGO DA VELHA [" + i + "][" + j + "]: ");
                jogoVelha[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + jogoVelha[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    if (jogoVelha[i][j] == 1) System.out.println("VENCEDOR [1]");
                    else if (jogoVelha[i][j] == -1) System.out.println("VENCEDOR [-1]");
                }
                else if (i + j == jogoVelha.length - 1) {
                    if (jogoVelha[i][j] == 1) System.out.println("VENCEDOR [1]");
                    else if (jogoVelha[i][j] == -1) System.out.println("VENCEDOR [-1]");
                }
                break;
            }
        }

        scanner.close();
    }
}
