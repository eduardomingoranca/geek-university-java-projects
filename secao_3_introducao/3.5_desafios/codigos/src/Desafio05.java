import java.util.Scanner;

/**
 * Leia um numero real e imprima a quinta parte deste numero
 */
public class Desafio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero real: ");
        double numero = scanner.nextDouble();

        double quintaParte = numero / 5.0;

        System.out.println("A quinta parte do numero " + numero + " eh: " + quintaParte);

        scanner.close();
    }
}
