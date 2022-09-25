import java.util.Scanner;

import static java.lang.Math.pow;

/**
  Faca uma funcao para verificar se um numero eh um quadrado perfeito. Um quadrado
  perfeito eh um numero inteiro nao negativo que pode ser expresso como o quadrado de
  outro numero inteiro. Ex: 1, 4, 9 ...
 */
public class Desafio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int numero = scanner.nextInt();

        if (numero <= 0) System.out.println("NUMERO INVALIDO!");
        else System.out.println(quadradoPerfeito(numero));

        scanner.close();
    }

    private static boolean quadradoPerfeito(int numero) {
        for (int i = 1; i <= numero; i++)
            if (pow(i , 2) == numero) return true;

        return false;
    }

}
