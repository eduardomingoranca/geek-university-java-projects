import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Faca um algoritmo que calcule o IMC de uma pessoa e mostre sua classificacao de
 * acordo com a tabela abaixo:
 *          |     IMC      |      Classificacao          |
 *          | < 18.5       | Abaixo do Peso              |
 *          | 18.6 - 24.9  | Saudavel                    |
 *          | 25.0 - 29.9  | Peso em excesso             |
 *          | 30.0 - 34.9  | Obesidade Grau I            |
 *          | 35.0 - 39.9  | Obesidade Grau II (severa)  |
 *          | >= 40.0      | Obesidade Grau II (morbida) |
 */
public class Desafio41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Informe a altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / pow(altura, 2);

        if (imc <= 18.5)
            System.out.println("Abaixo do peso!");
        else if (imc <= 24.9)
            System.out.println("Saudavel!");
        else if (imc <= 29.9)
            System.out.println("Peso em excesso!");
        else if (imc <= 34.9)
            System.out.println("Obesidade Grau I!");
        else if (imc <= 39.9)
            System.out.println("Obesidade Grau II (severa)!");
        else
            System.out.println("Obesidade Grau II (morbida)!");

        scanner.close();
    }
}
