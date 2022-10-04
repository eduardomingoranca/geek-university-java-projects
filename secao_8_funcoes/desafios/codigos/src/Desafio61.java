import java.util.Scanner;

/**
  Escreva uma funcao que compare e retorne verdadeiro, caso uma string seja anagrama
  da outra, e falso, caso contrario.
 */
public class Desafio61 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.print("Informe outra palavra: ");
        String novaPalavra = scanner.nextLine();

        if (anagrama(palavra, novaPalavra)) System.out.println("EH UM ANAGRAMA!");
        else System.out.println("NAO EH UM ANAGRAMA!");

        scanner.close();
    }

    private static boolean anagrama(String s, String s1) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = s1.length()-1; j >= 0; j--) {
                if (s1.charAt(j) == s.charAt(i)) return true;
            }
        }
        return false;
    }

}
