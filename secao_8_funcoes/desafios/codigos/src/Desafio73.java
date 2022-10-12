import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

/**
  Foi realizada um pesquisa de algumas caracteristicas fisicas de cinco habitantes de certa
  regiao. De cada habitante foram coletados os seguintes dados: sexo, cor dos olhos (A -
  Azuis ou C - Castanhos). cor dos cabelos (L - Louros, P - Pretos ou C - Castanhos) e
  idade.
       >> Faca uma funcao que leia esses dados em um vetor.
       >> Faca uma funcao que determine a media de idade das pessoas com olhos castanhos
          e cabelos pretos.
       >> Faca uma funcao que determine e devolva ao programa principal a maior idade
          entre os habitantes.
       >> Faca uma funcao que determine e devolva ao programa principal a quantidade de
          individuos do sexo feminino cuja idade esta entre 18 e 35 (inclusive) e que tenham
          olhos azuis e cabelos louros.
 */
public class Desafio73 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sexos = new String[5];
        String[] corOlhos = new String[5];
        String[] corCabelos = new String[5];
        int[] idades = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("SEXO[" + (i+1) + "] (F/M): ");
            sexos[i] = scanner.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("OLHOS[" + (i+1) + "] (A/C): ");
            corOlhos[i] = scanner.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("CABELOS[" + (i+1) + "] (L/P/C): ");
            corCabelos[i] = scanner.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("IDADES[" + (i+1) + "]: ");
            idades[i] = scanner.nextInt();
        }

        System.out.println(" QUANTIDADE FEMININO: " + quantidadeFeminino(sexos, idades, corOlhos, corCabelos));
        System.out.println(" MAIOR IDADE: " + maiorIdade(idades));
        System.out.println(" MEDIA IDADE: " + mediaIdade(corCabelos, corOlhos, idades));
        dadosVetor(sexos, corOlhos, corCabelos, idades);

        scanner.close();
    }

    private static void dadosVetor(String[] sexos, String[] corOlhos, String[] corCabelos, int[] idades) {
        System.out.println();
        for (String sexo : sexos) System.out.print(sexo + " ");

        System.out.println();
        for (String corOlho : corOlhos) System.out.print(corOlho + " ");

        System.out.println();
        for (String corCabelo : corCabelos) System.out.print(corCabelo + " ");

        System.out.println();
        for (int idade : idades) System.out.print(idade + " ");
    }

    private static double mediaIdade(String[] corCabelos, String[] corOlhos, int[] idades) {
        int soma = 0, j = 0;
        for (int i = 0; i < idades.length; i++) {
            if (corOlhos[i].equalsIgnoreCase("c")) {
                if (corCabelos[i].equalsIgnoreCase("p")) {
                    soma += idades[i];
                    j++;
                }
            }
        }

        return (double) soma / j;
    }

    private static int maiorIdade(int[] idades) {
        int maior = MIN_VALUE;
        for (int j : idades) if (j > maior) maior = j;
        return maior;
    }

    private static int quantidadeFeminino(String[] sexos, int[] idades, String[] corOlhos, String[] corCabelos) {
        int quantidade = 0;
        for (int i = 0; i < sexos.length; i++) {
            if (sexos[i].equalsIgnoreCase("f")) {
                if (idades[i] >= 18 && idades[i] <= 35) {
                    if (corOlhos[i].equalsIgnoreCase("a")) {
                        if (corCabelos[i].equalsIgnoreCase("l")) {
                            quantidade++;
                        }
                    }
                }
            }
        }
        return quantidade;
    }

}