import java.util.Scanner;

/**
 * Faca uma funcao que verifica se uma matriz quadrada de ordem N eh a matriz identidade.
 */
public class Desafio53 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho da matriz: ");
        int n = scanner.nextInt();

        double[][] matz = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("MATZ[" + i + "][" + j + "]: ");
                matz[i][j] = scanner.nextDouble();
            }
        }

        if (verificaMatrizIdentidade(matz, n)) System.out.println("EH UMA MATRIZ IDENTIDADE!");
        else System.out.println("NAO EH UMA MATRIZ IDENTIDADE!");

        scanner.close();
    }

    private static boolean verificaMatrizIdentidade(double[][] matz, int n) {
        boolean verifica = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matz[i][j] != 1 && i == j) verifica = false;
                else if (matz[i][j] != 0 && i != j) verifica = false;
            }
        }
        return verifica;
    }

}
