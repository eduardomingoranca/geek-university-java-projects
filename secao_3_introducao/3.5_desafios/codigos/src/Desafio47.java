import java.util.Scanner;

/**
 * Leia um numero inteiro de 4 digitos (de 1000 a 9999) e imprima 1 por linha
 */
public class Desafio47 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro de 4 digitos (de 1000 a 9999): ");
        int numero = scanner.nextInt();

        int numero4 = (numero % 100) %  10;
        int numero3 = (numero % 100) /  10;
        int numero2 = (numero / 100) % 10;
        int numero1 = (numero / 100) / 10;

        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(numero4);

        scanner.close();
    }
}
