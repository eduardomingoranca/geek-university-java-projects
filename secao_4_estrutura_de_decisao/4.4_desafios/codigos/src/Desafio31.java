import java.util.Scanner;

/**
 * Faca um programa que receba a altura e o peso de uma pessoa. De acordo com a tabela
 * a seguir, verifique e mostra qual a classificacao dessa pessoa.
 *      | Altura         |                   Peso
 *      |                | Ate 60 | Entre 60 e 90 (Inclusive) |  Acima de 90 |
 *      | Menor que 1.20 |    A   |           D               |      G       |
 *      | De 1.20 a 1.70 |    B   |           E               |      H       |
 *      | Maior que 1.70 |    C   |           F               |      I       |
 */
public class Desafio31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Informe o peso: ");
        double peso = scanner.nextDouble();

        if (altura < 1.20) {
            if (peso < 60.0)
                System.out.println("A");
            else if (peso >= 60.0 && peso <= 90.0)
                System.out.println("D");
            else System.out.println("G");
        } else if (altura >= 1.20 && altura <= 1.70) {
            if (peso < 60.0)
                System.out.println("B");
            else if (peso >= 60.0 && peso <= 90.0)
                System.out.println("E");
            else System.out.println("H");
        } else {
            if (peso < 60.0)
                System.out.println("C");
            else if (peso >= 60.0 && peso <= 90.0)
                System.out.println("F");
            else System.out.println("I");
        }

        scanner.close();
    }
}
