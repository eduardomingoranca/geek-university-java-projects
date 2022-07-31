import java.util.Scanner;

/**
 * Faca um programa para verificar se um determinado numero inteiro e divisivel por 3 ou
 * 5, mas nao simultaneamente pelos dois.
 */
public class Desafio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 3 == 0)
            System.out.println("DIVISIVEL POR 3");
        else if (numero % 5 == 0)
            System.out.println("DIVISIVEL POR 5");
        else
            System.out.println("NUMERO NAO EH DIVISIVEL POR 3 OU 5");

        scanner.close();
    }
}
