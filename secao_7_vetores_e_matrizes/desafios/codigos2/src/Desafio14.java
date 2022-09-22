import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 Faca um programa para gerar automaticamente numeros entre 0 e 99 de uma cartela de
 bingo. Sabendo que caba cartela devera conter 5 linhas de 5 numeros, gere estes dados
 de modo a nao ter numeros repetidos dentro das cartelas. O programa deve exibir na
 tela a cartela gerada.
 */
public class Desafio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] cartela = new int[5][5];
        Random random = new Random();
        Set<Integer> numeros = new HashSet<>();

        for (int i = 0; i < cartela.length; i++) {
            for (int j = 0; j < cartela.length; j++) {
                cartela[i][j] = random.nextInt(99);
                numeros.add(cartela[i][j]);
            }
        }

        System.out.println(numeros);

        scanner.close();
    }
}
