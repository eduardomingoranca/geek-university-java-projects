import java.util.Scanner;

/**
  Faca um programa para ler 10 numeros DIFERENTES a serem armazenados em um
  vetor. Os dados deverao ser armazenados no vetor na ordem que forem sendo
  lidos, sendo que caso o usuario digite um numero que ja foi digitado
  anteriormente, o programa devera pedir para ele digitar outro numero. Note
  que cada valor digitado pelo usuario deve ser pesquisado no vetor, verificando
  se ele existe entre os numeros que ja foram fornecidos. Exibir na tela o vetor
  final que foi digitado.
 */
public class Desafio34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, numeroExistente, max = 10, i = 0, n;
        int[] vet = new int[max];

        while (i < max) {
            System.out.print("Informe o (" + (i+1) + ") numero: ");
            numero = scanner.nextInt();

            for (n = numeroExistente = 0; n < i; n++)
                if (vet[n] == numero) numeroExistente = 1;
            if (numeroExistente == 1) System.out.println("NUMERO EXISTENTE!");
            else vet[i++] = numero;
        }

        for (int j: vet) System.out.print(" " + j);

        scanner.close();
    }

}
