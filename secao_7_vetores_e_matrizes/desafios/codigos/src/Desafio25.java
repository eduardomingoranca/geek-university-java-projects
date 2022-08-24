/**
  Faca um programa que preencha um vetor de tamanho 100 com os 100 primeiros naturais
  que nao sao multiplos de 7 ou que terminam com 7.
 */
public class Desafio25 {

    public static void main(String[] args) {
        int[] vet = new int[100];
        int j = 0;

        for (int i = 0; i < vet.length; i++) {
            while (j % 7 == 0 || j % 10 == 7) j += 1;
            vet[i] = j;
            j += 1;
        }

        for (int k : vet) System.out.print(" " + k);
    }

}
