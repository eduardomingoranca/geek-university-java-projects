import java.util.Scanner;

/**
 * Implemente a funcao a qual recebe duas strings, str1 e str2, e um valor inteiro positivo
 * N. A funcao concatena nao mais que N caracteres da string apontada por str2 a string
 * apontada por str1 e termina str1 com NULL.
 */
public class Desafio65 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String str1 = scanner.nextLine();

        System.out.print("Informe o tamanho da palavra: ");
        int n = Integer.parseInt(scanner.nextLine());

        if (n < 1 || n > str1.length()) System.out.println("TAMANHO INVALIDO!");
        else caracteresN(str1, n);

        scanner.close();
    }

    private static void caracteresN(String str1, int n) {
        String str2;
        for (int i = 0; i < n; i++) {
            str2 = String.valueOf(str1.charAt(i));
            System.out.print(str2);
        }
    }

}
