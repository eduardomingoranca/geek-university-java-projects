import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.min;

/**
 * Leia dois vetores de inteiros x e y, cada um com 5 elementos (assuma que o usuario nao
 * informa elementos repetidos). Calcule e mostre os vetores resultantes em cada caso
 * abaixo:
 *          * Soma entre x e y: soma de cada elemento de x com o elemento da mesma posicao
 *            em y.
 *          * Produto entre x e y: multiplicacao de cada elemento de x com o elemento da mesma
 *            posicao em y.
 *          * Diferenca entre x e y: todos os elementos de x que nao existam em y.
 *          * Intersecao entre x e y: apenas os elementos que aparecem nos dois vetores.
 *          * Uniao entre x e y: todos os elementos de x, e todos os elementos de y que nao
 *            estao em x.
 */
public class Desafio32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] x = new int[5];
        int[] y = new int[x.length];

        for (int i = 0; i < x.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            x[i] = scanner.nextInt();
        }

        for (int i = 0; i < y.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            y[i] = scanner.nextInt();
        }

        int n = x.length;
        int[] newX = Arrays.copyOf(x, n);

        for (int i = 0; i < n; i++) {
            int k = i + 1;
            int removidos = 0;
            for (int j = i + 1; j < n; j++) {
                if (newX[j] == newX[i]) removidos++;
                else newX[k++] = newX[j];
            }
            n = n - removidos;
        }

        newX = Arrays.copyOf(newX, n);

        int b = y.length;
        int[] newY = Arrays.copyOf(y, b);

        for (int i = 0; i < b; i++) {
            int k = i + 1;
            int removidos = 0;
            for (int j = i + 1; j < b; j++) {
                if (newY[j] == newY[i]) removidos++;
                else newY[k++] = newY[j];
            }
            b = b - removidos;
        }

        newY = Arrays.copyOf(newY, b);

        System.out.println("===========================");
        System.out.println("|        SOMA             |");
        System.out.println("===========================");
        for (int i = 0; i < min(newY.length, newX.length); i++)
            System.out.print(" " + (newX[i] + newY[i]));

        System.out.println("\n===========================");
        System.out.println("|        PRODUTO          |");
        System.out.println("===========================");
        for (int i = 0; i < min(newY.length, newX.length); i++)
            System.out.print(" " + (newX[i] * newY[i]));

        System.out.println("\n===========================");
        System.out.println("|        DIFERENCA        |");
        System.out.println("===========================");
        for (int i = 0; i < min(newY.length, newX.length); i++) {
            if (newX[i] != newY[i]) System.out.print(" " + newX[i]);
        }

        System.out.println("\n===========================");
        System.out.println("|        INTERSECCAO      |");
        System.out.println("===========================");
        for (int i = 0; i < min(newY.length, newX.length); i++) {
            if (newX[i] == newY[i]) System.out.print(" " + newX[i]);
        }

        System.out.println("\n===========================");
        System.out.println("|          UNIAO          |");
        System.out.println("===========================");
        for (int j : newX) System.out.print(" " + j);
        for (int j : newY) System.out.print(" " + j);

        scanner.close();
    }

}
