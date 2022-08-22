import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
  Faca um programa que leia um vetor de 10 posicoes e verifique se existem valores iguais
  e os escreva na tela.
 */
public class Desafio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vet = new double[10];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            vet[i] = scanner.nextDouble();
        }

        int n = vet.length;
        double[] aux = Arrays.copyOf(vet, n); // copia de vet

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

        aux = Arrays.copyOf(aux, n);

        for (double auxiliar: aux) System.out.print(" " + auxiliar);

        scanner.close();
    }
}
