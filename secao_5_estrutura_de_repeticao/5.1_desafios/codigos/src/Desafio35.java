import java.util.Scanner;

/**
 * Faca um programa que some os numeros impares contidos em um intervalo definido
 * pelo usuario. O usuario define o valor inicial do intervalo e o valor final deste
 * intervalo e o programa deve somar todos os numeros impares contidos neste intervalo.
 * Caso o usuario digite um intervalo invalido (comecando por um valor maior que o valor
 * final) deve ser escrito uma mensagem de erro na tela, "Intervalo de valores invalido"
 * e o programa termina. Exemplo de tela de saida: Digite o valor inicial o valor final:
 * 5 10
 * Soma dos impares neste intervalo: 21
 */
public class Desafio35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor inicial o valor final inteiros: ");
        int valorInicial = scanner.nextInt();
        int valorFinal = scanner.nextInt();

        if (valorInicial == valorFinal || valorInicial > valorFinal)
            System.out.println("NUMEROS INVALIDOS!");
        else {
            int soma = 0;
            for (int i = valorInicial; i <= valorFinal; i++) if (i % 2 != 0) soma += i;

            System.out.println("SOMA: " + soma);
        }

        scanner.close();
    }
}
