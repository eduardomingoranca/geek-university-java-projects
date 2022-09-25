import java.util.Scanner;

/**
 * Faca uma funcao para verificar se um numero eh positivo ou negativo. Sendo que o valor
 * de retorno sera 1 se positivo, -1 se negativo e 0 se for igual a 0.
 */
public class Desafio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int numero = scanner.nextInt();

        System.out.println(positivoNegativo(numero));

        scanner.close();
    }

    private static int positivoNegativo(int numero) {
        if (numero > 0) return 1;
        else if (numero < 0) return -1;

        return 0;
    }

}
