import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Faca um programa que leia um arquivo que contenha as dimensoes de uma matriz (linha
 * e coluna), a quantidade de posicoes que serao anuladas, e as posicoes a serem anuladas
 * (linha e coluna). O programa le esse arquivo e, em seguida, produz um novo arquivo
 * com a matriz com as dimensoes dadas no arquivo lido, e todas as posicoes especificadas
 * no arquivo ZERADAS e o restante recebendo o valor 1.
 * Ex: arquivo "matriz.txt"
 *      3 3 2 // 3 e 3 dimensoes da matriz e 2 posicoes que serao anuladas//
 *      1 0
 *      1 2  // Posicoes da matriz que serao anuladas.
 * <p>
 *      arquivo "matriz_saida.txt"
 *      saida:
 *          1 1 1
 *          0 1 0
 *          1 1 1
 */
public class Desafio17 {

    public static void main(String[] args) {
        try {
            Scanner read = new Scanner(new FileInputStream("matriz.txt"));

            int[] vet;
            int i = 0;
            int v1 = 0, v2 = 0;
            int v3 = 0, v4 = 0;
            int v5 = 0, v6 = 0;

            while (read.hasNextLine()) {
                int valor = parseInt(read.next());
                vet = new int[7];
                vet[i] = valor;
                if (i == 0) v1 = vet[i];

                if (i == 1) v2 = vet[i];

                if (i == 3) v3 = vet[i];

                if (i == 4) v4 = vet[i];

                if (i == 5) v5 = vet[i];

                if (i == 6) v6 = vet[i];
                i++;
            }

            int[][] matz = new int[v1][v2];

            for (int j = 0; j < v1; j++) {
                for (int k = 0; k < v2; k++) {
                    if (v3 == j && v4 == k)
                        matz[j][k] = 0;
                    else if (v5 == j && v6 == k)
                        matz[j][k] = 0;
                    else matz[j][k] = 1;
                }
            }

            PrintStream writer = new PrintStream(new FileOutputStream("matriz_saida.txt", true));

            for (int j = 0; j < v1; j++) {
                for (int k = 0; k < v2; k++) {
                    writer.print(matz[j][k] + " ");
                }
                writer.println();
            }

            writer.close();
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }
    }
}
