import java.util.Scanner;

/**
  Faca um programa que leia dois numeros a e b (positivos menores que 10000) e:
       * Crie um vetor onde cada posicao eh um algarismo do numero. A primeira posicao eh
         o algarismo menos significativo;
       * Crie um vetor que seja a soma de a e b, mas faca-o usando apenas os vetores
         construidos anteriormente.
  Dica: some as posicoes correspondentes. Se a soma ultrapassar 10, subtraia 10 do
  resultado e some 1 a proxima posicao.
 */
public class Desafio35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        int a = scanner.nextInt();

        System.out.print("A: ");
        int b = scanner.nextInt();

        int c;

        if (a >= 0 && a < 10000 && b >= 0 && b < 10000) {
            if (a > b) {
                c = b;
                b = a;
                a = c;
            }

            System.out.println("\n========================");
            for (int i = a; i < b; i++)
                System.out.print(" " + i);

            int[] vet = new int[b];

            int soma = 0;
            System.out.println("\n========================");
            for (int i = a; i < b; i++) {
                soma += i;
                vet[i] = soma;
                System.out.print(" " + vet[i]);
            }
            System.out.println("\n========================");
        } else System.out.println("NUMERO INVALIDO!");

        scanner.close();
    }

}
