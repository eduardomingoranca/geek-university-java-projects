import java.util.Scanner;

/**
  Leia 10 numeros inteiros e armazene em um vetor v. Crie dois novos vetores v1 e v2.
  Copie os valores impares de v para v1, e os valores pares de v para v2. Note que cada
  um dos vetores v1 e v2 tem no maximo 10 elementos, mas nem todos os elementos sao
  utilizados. No final escreva os elementos UTILIZADOS de v1 e v2.
 */
public class Desafio28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] v = new int[10];
        int[] v1 = new int[v.length];
        int[] v2 = new int[v1.length];

        for (int i = 0; i < v.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            v[i] = scanner.nextInt();
        }

        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) v1[i] = v[i];
        }

        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 != 0) v2[i] = v[i];
        }

        System.out.println("============");
        for (int a: v1) {
            if (a != 0) System.out.print(" " + a);
        }
        System.out.println();
        System.out.println("============");

        for (int b: v2) {
            if (b != 0) System.out.print(" " + b);
        }
        System.out.println();
        System.out.println("============");

        scanner.close();
    }

}
