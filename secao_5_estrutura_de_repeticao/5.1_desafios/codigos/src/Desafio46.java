import java.util.Random;
import java.util.Scanner;

/**
 * Faca um programa que gera um numero aleatorio de 1 a 1000. O usuario deve tentar
 * acertar qual o numero foi gerado, a cada tentativa o programa devera informar se o
 * chute eh menor ou maior que o numero gerado. O programa acaba quando o usuario
 * acerta o numero gerado. O programa deve informar em quantas tentativas o numero foi
 * descoberto.
 */
public class Desafio46 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int numeroAleatorio;
        int charada;
        int quantidade = 0;
        do {
            numeroAleatorio = random.nextInt(1000) + 1;

            System.out.print("Qual eh o numero?  ");
            charada = scanner.nextInt();

            if (charada > numeroAleatorio) System.out.println("MAIOR QUE O NUMERO");
            else if (charada < numeroAleatorio) System.out.println("MENOR QUE O NUMERO");

            quantidade++;
        } while(charada != numeroAleatorio);

        System.out.println("TOTAL DE TENTATIVAS: " + quantidade);

        scanner.close();
    }
}
