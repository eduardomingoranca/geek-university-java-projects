import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro numero para divisao: ");
        int num = scanner.nextInt();

        System.out.print("Informe o segundo numero para divisao: ");
        int num2 = scanner.nextInt();

        try {
            System.out.println("A divisao de " + num + " por " + num2 + " eh " + num / num2);
        } catch (ArithmeticException e) {
            System.out.println("Nao eh possivel dividir " + num + " por " + num2);
        }

        scanner.close();
    }
}
