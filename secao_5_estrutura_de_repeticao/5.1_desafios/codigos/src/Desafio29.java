/**
  Escreva um programa para calcular o valor da serie, para 5 termos.
           S = 0 + 1/2! + 1/4! + 1/6! + ...
 */
public class Desafio29 {

    public static void main(String[] args) {
        double s = 0;
        int soma = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = (i * 2); j >= 1; j--) {
                s += 1.0/(soma += j);
                break;
            }
        }
        System.out.printf("S = %.5f", s);

    }
}
