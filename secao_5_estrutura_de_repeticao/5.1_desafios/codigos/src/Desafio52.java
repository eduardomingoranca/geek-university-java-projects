import java.util.Scanner;

/**
  Escreva um programa que receba como entrada o valor do saque realizado pelo cliente
  de um banco e retorne quantas notas de cada valor serao necessarias para atender ao
  saque com a menor quantidade de notas possivel. Serao utilizadas notas de 100, 50,
  20, 10, 5, 2 e 1 real.
 */
public class Desafio52 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor do saque R$ ");
        double valor = scanner.nextDouble();

        int notas100 = (int) valor / 100;
        valor %= 100;

        int notas50 = (int) valor / 50;
        valor %= 50;

        int notas20 = (int) valor / 20;
        valor %= 20;

        int notas10 = (int) valor / 10;
        valor %= 10;


        int notas5 = (int) valor / 5;
        valor %= 5;

        int notas2 = (int) valor / 2;
        valor %= 2;

        int notas1 = (int) valor;

        System.out.println("=====================================");
        System.out.println("TOTAL NOTAS DE R$ 100.00: " + notas100);
        System.out.println("TOTAL NOTAS DE R$ 50.00: " + notas50);
        System.out.println("TOTAL NOTAS DE R$ 20.00: " + notas20);
        System.out.println("TOTAL NOTAS DE R$ 10.00: " + notas10);
        System.out.println("TOTAL NOTAS DE R$ 5.00: " + notas5);
        System.out.println("TOTAL NOTAS DE R$ 2.00: " + notas2);
        System.out.println("TOTAL NOTAS DE R$ 1.00: " + notas1);
        System.out.println("=====================================");

        scanner.close();
    }
}
