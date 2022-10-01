import java.util.Scanner;

/**
 * Faca uma funcao 'Troque', que receba duas variaveis reais A e B e troca o valor delas
 * (i.e., A recebe o valor de B e B recebe o valor de A).
 */
public class Desafio39 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A: ");
        double a = scanner.nextDouble();

        System.out.println("B: ");
        double b = scanner.nextDouble();

        System.out.println("A = " + a + " B = " + b + " agora sao: " + troque(a, b));

        scanner.close();
    }

    private static String troque(double a, double b) {
        double temp = a;
        a = b;
        b = temp;

        return "A = " + a + " B = " + b;
    }

}
