import java.util.Scanner;

/**
 * Faca uma funcao que receba duas strings e retorne a intercalacao letra a letra da primeira
 * com a segunda string. A string intercalada deve ser retornada na primeira string.
 */
public class Desafio68 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String str1 = scanner.nextLine();

        System.out.print("Informe outra palavra: ");
        String str2 = scanner.nextLine();

        int i = str1.length() + str2.length();
        char[] saida = new char[i];

        System.out.println("STR1: " + str1);
        System.out.println("STR2: " + str2);
        System.out.println(intercalacao(saida, str1, str2));

        scanner.close();
    }

    private static char[] intercalacao(char[] saida, String str1, String str2) {
        for (int i = 0, j = 0, k = 0; i < (str1.length() + str2.length())-1; i++) {
            if (i % 2 == 0) {
                saida[i] = str1.charAt(j);
                j++;
            } else {
                saida[i] = str2.charAt(k);
                k++;
            }
        }

        return saida;
    }

}
