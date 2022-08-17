import java.util.Scanner;

/**
  Chico tem 1.50 metro e cresce 2 centimetros por ano, enquanto Ze tem 1.10 metros e
  cresce 3 centimetros por ano. Escreva um programa que calcule e imprima quantos anos
  serao necessarios para que Ze seja maior que Chico.
 */
public class Desafio50 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double centimetrosChico = 1.50;
        double centimetrosZe = 1.10;

        int anos = 0;

        while(centimetrosZe < centimetrosChico) {
            centimetrosChico = centimetrosChico * 2.0;
            centimetrosZe = centimetrosZe * 3.0;
            anos++;
        }

        System.out.println("TOTAL DE ANOS: " + anos);
        scanner.close();
    }
}
