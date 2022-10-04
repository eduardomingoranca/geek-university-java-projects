import java.util.Scanner;

/**
 * Implemente a funcao a qual recebe duas strings, str1 e str2, e concatena a string apontada
 * por str2 a string apontada por str1.
 */
public class Desafio64 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String str1 = scanner.nextLine();

        System.out.print("Informe outra palavra: ");
        String str2 = scanner.nextLine();

        System.out.println(concatenaStrings(str1, str2));

        scanner.close();
    }

    private static String concatenaStrings(String str1, String str2) {
        return str1.concat(str2);
    }


}
