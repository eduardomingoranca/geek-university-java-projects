import java.util.Scanner;

/**
 * Faca uma funcao chamada DesenhaLinha. Ele deve desenhar uma linha na tela usando
 * varios simbolos de igual (Ex:=======). A funcao recebe por parametro quantos sinais
 * de igual serao mostrados.
 */
public class Desafio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade: ");
        int quantidade = scanner.nextInt();

        desenhaLinha(quantidade);

        scanner.close();
    }

    private static void desenhaLinha(int quantidade) {
        for (int i = 0; i < quantidade; i++) System.out.print("=");
    }

}
