import java.util.Scanner;

/**
  Escreva uma funcao que retorne a primeira posicao de uma sub-string dentro de uma
  string. Caso a sub-string nao seja encontrada, a funcao deve retornar -1
 */
public class Desafio60 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.print("Informe uma letra: ");
        char l = scanner.next().charAt(0);
        System.out.println(retornaPosicao(palavra, l));

        scanner.close();
    }

    private static int retornaPosicao(String palavra, char l) {
        int posicao = 0;
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == l) {
                posicao = i;
                break;
            }
            else posicao = -1;
        }
        return posicao;
    }

}
