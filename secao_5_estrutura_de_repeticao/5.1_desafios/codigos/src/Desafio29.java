/**
  Escreva um programa para calcular o valor da serie, para 5 termos.
           S = 0 + 1/2! + 2/4! + 3/6! + ...
 */
public class Desafio29 {

    public static void main(String[] args) {
        double s = 0;
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j >= 1; j--) {
                s += (soma += (j * 2.0))/i;
                break;
            }
        }

        System.out.printf("S = %.2f", s);

    }
}
