import java.util.Scanner;

/**
  Faca um programa que calcule e escreva o valor de S
           S = 1 + 3 + 5 + 7 ... 99
               1   2   3   4     50
 */
public class Desafio31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double s = 0;

        for (int i = 1; i <= 50; i++) s += (2.0 * i - 1) / i;

        System.out.println("S = " + s);

        scanner.close();
    }
}
