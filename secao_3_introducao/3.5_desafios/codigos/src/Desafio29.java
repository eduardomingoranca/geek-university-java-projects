import java.util.Scanner;

/**
 * Leia quatro notas, calcule a media aritmetica e imprima o resultado.
 */
public class Desafio29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Informe a [" + i + "ª] nota = ");
            double notas = scanner.nextDouble();

            soma += notas;
        }

        double mediaAritmetica = soma/4;

        System.out.println(" A media aritmetica das notas eh: " + mediaAritmetica);

        scanner.close();
    }
}
