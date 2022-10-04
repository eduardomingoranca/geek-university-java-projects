import java.util.ArrayList;
import java.util.List;
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

        System.out.println(desenhaLinha(quantidade));

        scanner.close();
    }

    private static List<String> desenhaLinha(int quantidade) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) list.add("=");
        return list;
    }

}
