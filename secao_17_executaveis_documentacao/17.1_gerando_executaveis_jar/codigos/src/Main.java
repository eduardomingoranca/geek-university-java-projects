import java.util.Scanner;

/**
 * Gerando executaveis jar
 * <p>
 * JAR - Java Archive
 * <p>
 * Archive - Arquivo Compactado Java
 * <p>
 * zip / rar
 */
public class Main {
    static Cliente cliente = new Cliente("Catherine Bernet", "Rua da Paz, 45");
    static Conta conta = new Conta(1, 200.00, 300.00, cliente);
    static Scanner scanner = new Scanner(System.in);

    public static void depositar() {
        System.out.println("========== Deposito ==========");

        System.out.print("Informe o valor para deposito R$ ");
        double value = scanner.nextDouble();

        if (value > 0) {
            conta.depositar(value);
            System.out.println("Deposito efetuado com sucesso!");
        } else System.out.println("O valor precisa ser positivo");
    }

    public static void sacar() {
        System.out.println("========== Saque ==========");

        System.out.print("Informe o valor para saque R$ ");
        double value = scanner.nextDouble();

        if (value > 0) conta.sacar(value);
        else System.out.println("O valor precisa ser positivo!");
    }

    public static void consultar() {
        System.out.println("Seu saldo eh R$ " + conta.getSaldo());
    }

    public static void main(String[] args) {
        int opcao = 0;
        System.out.println("Bem-vindo ao Banco GeekU");

        do {
            System.out.println("Selecione uma opcao abaixo: ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> depositar();
                case 2 -> sacar();
                case 3 -> consultar();
                case 0 -> System.out.println("FIM!");
                default -> System.out.println("Opcao invalida!");
            }

        } while(opcao > 0);

        scanner.close();
    }
}
