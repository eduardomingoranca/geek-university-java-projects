import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o n1: ");
        int n1 = scanner.nextInt();

        System.out.print("Informe o n2: ");
        int n2 = scanner.nextInt();

        try {
            System.out.println(divisao(n1, n2));
        } catch (ArithmeticException e) {
            System.out.println("Nao consegui dividir os valores.");
        } catch (Exception e) {
            System.out.println("Ocorreu uma outra excecao.");
        }

        scanner.close();
    }

    // criando uma funcao, que avisa que tem possibilidade
    // de lancar uma excecao do tipo Exception
    public static int divisao(int n1, int n2) throws Exception {
        return n1 / n2;
    }

}
