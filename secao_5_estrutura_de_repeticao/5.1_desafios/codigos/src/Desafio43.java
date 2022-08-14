import java.util.Scanner;

/**
 * Faca um programa que leia um numero indeterminado de idades de individuos (pare
 * quando for informada a idade 0), e calcule a idade media desse grupo.
 */
public class Desafio43 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        int quantidade = 0;
        int soma = 0;
        do {
            System.out.print("Informe a idade [idade zero para sair]: ");
            idade = scanner.nextInt();

            if (idade != 0){
                soma += idade;
                quantidade++;
            }
        } while(idade != 0);

        System.out.println("MEDIA DAS IDADES: " + (soma / quantidade));

        scanner.close();
    }
}
