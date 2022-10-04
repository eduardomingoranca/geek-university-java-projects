import javax.swing.plaf.basic.BasicBorders;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.copyOf;

/**
 * Faca uma funcao que receba um vetor de inteiros e o preencha com numeros aleatorios
 * sem repeticao.
 */
public class Desafio43 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        int[] vet = new int[n];

        System.out.println(Arrays.toString(numerosAleatorios(vet)));

        scanner.close();
    }

    private static int[] numerosAleatorios(int[] vet) {
        for (int i = 0; i < vet.length; i++)
            vet[i] = new Random().nextInt(100);

        int n = vet.length;
        int[] aux = copyOf(vet, n); // copia de vet

        for (int i = 0; i < n; i++) {
            // verificando para cada item removido, se o item na posicao i
            // ja se encontra em alguma posicao a frente no vetor, se o elemento se encontrar
            // remover do vetor aux
            int k = i + 1;
            int removidos = 0;
            for (int j = i + 1; j < n; j++) {
                if (aux[j] == aux[i]) removidos++;
                else aux[k++] = aux[j];
            }
            n = n - removidos;
        }

        aux = copyOf(aux, n);

        return aux;
    }

}
