import java.util.Scanner;

/**
 * Escreva um programa completo que permita a qualquer aluno introduzir, pelo teclado,
 * uma sequencia arbitraria de notas (validas no intervalo de 10 a 20) e que mostre na tela,
 * como resultado, a correspondente media aritmetica. O numero de notas com que o aluno
 * pretenda efetuar o calculo nao sera fornecido ao programa, o qual terminara quando for
 * introduzido um valor que nao seja valido como nota de aprovacao.
 */
public class Desafio22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;
        double soma = 0;
        int quantidade = 0;
        do {
            System.out.print("Informe a nota: ");
            nota = scanner.nextDouble();

            if (nota >= 10.0 && nota <= 20.0) {
                soma += nota;
                quantidade++;
            }
        } while (nota >= 10.0 && nota <= 20.0);

        System.out.println("MEDIA ARITMETICA: " + (soma / quantidade));

        scanner.close();
    }
}
