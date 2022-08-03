import java.util.Scanner;

import static java.util.concurrent.ThreadLocalRandom.current;

/**
 * Faca uma prova de matematica para criancas que estao aprendendo a somar numeros
 * inteiros menores do que 100. Escolha numeros aleatorios entre 1 e 100, e mostre na
 * tela a pergunta: qual eh a soma de a + b, onde a e b sao os numeros aleatorios. Peca a
 * resposta. Faca cinco perguntas ao aluno, e mostre para ele as perguntas e as respostas
 * corretas, alem de quantas vezes o aluno acertou.
 */
public class Desafio29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int resultado = 0;
        for (int i = 1; i <= 5; i++) {
            int a = current().nextInt(1, 100);
            int b = current().nextInt(1, 100);
            int soma = a + b;

            System.out.print("Qual o resultado da soma de " + a + " + " + b + " = ");
            int resposta = scanner.nextInt();

            if (resposta == soma)
                resultado++;
        }

        System.out.println("TOTAL DE ACERTOS: " + resultado);

        scanner.close();
    }
}
