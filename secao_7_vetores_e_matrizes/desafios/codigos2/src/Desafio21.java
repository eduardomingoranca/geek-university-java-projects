import java.util.Scanner;

/**
 * Faca um programa que leia duas matrizes 2 x 2 com valores reais. Ofereca ao usuario
 * um menu de opcoes:
 *      (a) somar as duas matrizes
 *      (b) subtrair a primeira matriz da segunda
 *      (c) adicionar uma constante as duas matrizes
 *      (d) imprimir as matrizes
 * Nas duas primeiras opcoes uma terceira matriz 2 x 2 deve ser criada. Na terceira opcao
 * o valor da constante deve ser lido e o resultado da adicao da constante deve ser armazenado
 * na propria matriz.
 */
public class Desafio21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] m1 = new int[2][2];
        int[][] m2 = new int[2][2];
        int[][] m3 = new int[2][2];

        int a = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("M1[" + i + "][" + j + "]:");
                m1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("M2[" + i + "][" + j + "]:");
                m2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("==============================================");
        System.out.println(" (a) somar as duas matrizes                   ");
        System.out.println(" (b) subtrair a primeira matriz da segunda    ");
        System.out.println(" (c) adicionar uma constante as duas matrizes ");
        System.out.println(" (d) imprimir as matrizes                     ");
        System.out.println("==============================================");

        System.out.print("SELECIONE UMA OPCAO: ");
        String opcao = scanner.nextLine();
        System.out.println();

        switch (opcao) {
            case "a" -> {
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        m3[i][j] = m1[i][j] + m2[i][j];
                    }
                }
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++)
                        System.out.print(" " + m3[i][j]);

                    System.out.println();
                }
            }
            case "b" -> {
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        m3[i][j] = m1[i][j] - m2[i][j];
                    }
                }
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++)
                        System.out.print(" " + m3[i][j]);

                    System.out.println();
                }
            }
            case "c" -> {
                System.out.print("INFORME UMA CONSTANTE: ");
                int constante = scanner.nextInt();

                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        m1[0][0] = constante;
                    }
                }
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        m2[0][0] = constante;
                    }
                }

                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++)
                        System.out.print(" " + m1[i][j]);

                    System.out.println();
                }

                System.out.println();
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++)
                        System.out.print(" " + m2[i][j]);

                    System.out.println();
                }
            }
            case "d" -> {
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++)
                        System.out.print(" " + m1[i][j]);

                    System.out.println();
                }

                System.out.println();
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++)
                        System.out.print(" " + m2[i][j]);

                    System.out.println();
                }
            }
            default -> System.out.println("OPCAO INVALIDA!");
        }

        scanner.close();
    }
}
