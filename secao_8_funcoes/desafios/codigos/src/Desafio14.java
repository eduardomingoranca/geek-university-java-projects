import java.util.Scanner;

/**
 * Faca uma funcao que receba a distancia em Km e a quantidade de litros de gasolina
 * consumidos por um carro em um percurso, calcule o consumo em Km/l e escreva uma
 * mensagem de acordo com a tabela abaixo:
 *      |  CONSUMO  | (Km/l) |     MENSAGEM     |
 *      | menor que |   8    | Venda o carro!   |
 *      | entre     | 8 e 11 |   Economico!     |
 *      | maior que |  12    | Super economico! |
 */
public class Desafio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a distancia (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Informe a quantidade de litros de gasolina (por km): ");
        double quantidade = scanner.nextDouble();

        System.out.println("O consumo de gasolina eh: " + consumoGasolina(distancia, quantidade));

        scanner.close();
    }

    private static String consumoGasolina(double distancia, double quantidade) {
        if (distancia / quantidade < 8) return "VENDA O CARRO!";
        else if (distancia / quantidade >= 8 && distancia / quantidade <= 11)
            return "ECONOMICO!";
        return "SUPER ECONOMICO!";
    }

}
