import java.util.Scanner;

/**
 * Considerando a estrutura:
 *  struct Vetor {
 *      float x;
 *      float y;
 *      float z;
 *  }
 *  para representar um vetor no R(3), implemente uma funcao que calcule a soma de dois
 *  vetores. Essa funcao deve obedecer ao propotipo:
 *      void soma (struct Vetor * v1,struct Vetor * v2, struct Vetor * res)
 *  onde os parametros v1 e v2 sao ponteiros para os vetores a serem somados, e o
 *  parametro res eh um ponteiro para uma estrutura vetor onde o resultado da operacao
 *  deve ser armazenado.
 */
public class Desafio72 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("X: ");
        int x = scanner.nextInt();

        System.out.print("Y: ");
        int y = scanner.nextInt();

        int[] v1 = new int[x];
        int[] v2 = new int[y];
        int res = 0;

        somaVetor(x, y, v1, v2, res);

        scanner.close();
    }

    private static void somaVetor(int x, int y, int[] v1, int[] v2, int res) {
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < v1.length; i++) {
            System.out.print("V1[" + (i+1) + "]: ");
            v1[i] = leitor.nextInt();
            res += v1[i];
        }

        for (int i = 0; i < v2.length; i++) {
            System.out.print("V2[" + (i+1) + "]: ");
            v2[i] = leitor.nextInt();
            res += v2[i];
        }

        System.out.println("RES: " + res);
    }

}