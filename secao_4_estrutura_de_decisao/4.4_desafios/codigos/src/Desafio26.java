import java.util.Scanner;

/**
 * Leia a distancia em Km e a quantidade de litros de gasolina consumidos por um carro
 * em um percurso, calcule o consumo em Km/l e escreva uma mensagem de acordo com
 * a tabela abaixo:
 *                  |  CONSUMO  | (Km/l) |   MENSAGEM        |
 *                  | menor que |   8    | Venda o carro!    |
 *                  |  entre    | 8 e 14 |    Economico!     |
 *                  | maior que |   12   | Super economico ! |
 */
public class Desafio26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a distancia (km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Informe a quantidade de litros de gasolina: ");
        double quantidade = scanner.nextDouble();

        double consumo = distancia / quantidade;

        if (consumo < 8)
            System.out.println("Venda o carro!");
        else if (consumo >= 8 && consumo <= 14)
            System.out.println("Economico!");
        else if (consumo > 12)
            System.out.println("Super economico!");

        scanner.close();
    }
}
