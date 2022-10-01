import java.util.Scanner;

/**
 * Faca uma funcao chamada 'simplifica' que recebe como parametro o numerador e o denominador
 * de uma fracao. Essa funcao deve simplificar a fracao recebida dividindo o numerador e o
 * denominador pelo maior fator possivel. Por exemplo, a fracao 36/60 simplifica para 3/5
 * dividindo o numerador e o denominador por 12. A funcao deve modificar as variaveis passadas
 * como parametro.
 */
public class Desafio32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a fracao: ");
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();

        if (a1 == 0 || b1 == 0) System.out.println("NUMERO INVALIDO!");
        else System.out.println(simplifica(a1, b1));

        scanner.close();
    }

    private static String simplifica(int a1, int b1) {
        int a2 = 0, b2 = 0;
        if (a1 > b1) {
            for (int i = b1; i >= 1; i--) {
                if (a1 % i == 0 && b1 % i == 0) {
                    a2 = a1 / i;
                    b2 = b1 / i;
                    break;
                }
            }
        } else {
            for (int i = a1; i >= 1; i--) {
                if (a1 % i == 0 && b1 % i == 0) {
                    a2 = a1 / i;
                    b2 = b1 / i;
                    break;
                }
            }
        }
        return a2 + "/" + b2;
    }

}
