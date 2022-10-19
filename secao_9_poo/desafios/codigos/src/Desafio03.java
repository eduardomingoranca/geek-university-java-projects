import java.util.Scanner;

public class Desafio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Elevador elevador = new Elevador();

        System.out.print("Informe a capacidade do elevador: ");
        int capacidade = scanner.nextInt();

        System.out.print("Informe o total de andares do predio: ");
        int totalAndares = scanner.nextInt();

        System.out.println(elevador.inicializa(capacidade, totalAndares));

        System.out.print("Informe a quantidade de pessoas para entrar no elevador: ");
        int quantidadePessoas = scanner.nextInt();

        if (quantidadePessoas <= capacidade) {
            System.out.println(elevador.entra(quantidadePessoas));

            System.out.print("Deseja subir ou descer? [s/d] ");
            String subirDescer = scanner.next();

            int andarAtual;
            if (subirDescer.equalsIgnoreCase("s")) {
                System.out.print("Informe o andar que deseja subir: ");
                andarAtual = Integer.parseInt(scanner.next());

                if (andarAtual <= totalAndares) {
                    System.out.println(elevador.sobe(andarAtual));

                    System.out.print("Informe a quantidade de pessoas para sair do elevador: ");
                    quantidadePessoas = Integer.parseInt(scanner.next());

                    if (quantidadePessoas > 0) System.out.println(elevador.sai(quantidadePessoas));
                    else System.out.println("Nao pode ser removido por nao tem ninguem no elevador!");
                } else System.out.println("Nao pode subir mais ultimo andar!");

            } else if (subirDescer.equalsIgnoreCase("d")) {
                System.out.print("Informe o andar que deseja descer: ");
                andarAtual = Integer.parseInt(scanner.next());

                if (andarAtual >= 0) {
                    System.out.println(elevador.desce(andarAtual));

                    System.out.print("Informe a quantidade de pessoas para sair do elevador: ");
                    quantidadePessoas = Integer.parseInt(scanner.next());

                    if (quantidadePessoas > 0) System.out.println(elevador.sai(quantidadePessoas));
                    else System.out.println("Nao pode ser removido por nao tem ninguem no elevador!");
                } else System.out.println("Nao pode descer mais que o primeiro andar!");

            } else System.out.println("Opcao invalida!");
        } else System.out.println("Nao pode adicionar mais pois ultrapassa a capacidade total!");

        scanner.close();
    }
}
