import java.util.Scanner;

public class Desafio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Agenda contato = new Agenda();
        String acao = "";
        String continuar;

        System.out.println("Bem vindo a Agenda!\n");
        do {
            System.out.println("==================================");
            System.out.println("| 1 |  ARMAZENAR um novo contato.");
            System.out.println("| 2 |  REMOVER um contato.");
            System.out.println("| 3 |  BUSCAR um novo contato.");
            System.out.println("| 4 |  IMPRIMIR TODOS os contatos.");
            System.out.println("| 5 |  IMPRIMIR um único contato.");
            System.out.println("| 0 |  SAIR da agenda.");
            System.out.println("==================================");

            System.out.print("Selecione uma opcao que deseja acessar: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:

                    do {
                        System.out.print("Informe o nome do contato: ");
                        String nome = scanner.nextLine();

                        System.out.print("Informe a idade: ");
                        int idade = Integer.parseInt(scanner.nextLine());

                        System.out.print("Informe a altura: ");
                        double altura = Double.parseDouble(scanner.nextLine());

                        contato.armazenaPessoa(nome, idade, altura);
                        if(contato.getAgenda().size() <= 9) {
                            System.out.print("\nDeseja adicionar outro contato? [S/N]");
                            continuar = scanner.nextLine();
                        }else {
                            continuar = "n";
                            System.out.print("\nCapacidade máxima de " +  contato.getAgenda().size() + " atiginda.");
                        }

                        if (continuar.equalsIgnoreCase("n")) {
                            System.out.print("\nDeseja realizar uma nova ação? [S/N]");
                            acao = scanner.nextLine();
                            if (acao.equalsIgnoreCase("n")) {
                                System.out.print("\nA agenda está sendo encerrada, até a próxima!");
                                System.exit(0);
                            }
                        }
                    } while (continuar.equalsIgnoreCase("s"));
                    break;

                case 2:
                    do {
                        System.out.print("Informe o nome do contato: ");
                        String nome = scanner.nextLine();

                        System.out.println(contato.removePessoa(nome));

                        System.out.print("\nDeseja remover outro contato? [S/N]");
                        continuar = scanner.nextLine();

                        if (continuar.equalsIgnoreCase("n")) {
                            System.out.print("\nDeseja realizar uma nova ação? [S/N]");
                            acao = scanner.nextLine();
                            if (acao.equalsIgnoreCase("n")) {
                                System.out.print("\nA agenda está sendo encerrada!");
                                System.exit(0);
                            }
                        }
                    } while (continuar.equalsIgnoreCase("s"));
                    break;

                case 3:
                    do {
                        System.out.print("Informe o nome do contato: ");
                        String nome = scanner.nextLine();

                        if (contato.buscaPessoa(nome) == 1)
                            System.out.println(contato.getPessoa().getNome() + "; " + contato.getPessoa().getIdade() + "; "
                                    + contato.getPessoa().getAltura());
                        else System.out.println("\nO contato não consta na agenda!");

                        System.out.print("\nDeseja buscar outro contato? [S/N]");
                        continuar = scanner.nextLine();

                        if (continuar.equalsIgnoreCase("n")) {
                            System.out.print("\nDeseja realizar uma nova ação? [S/N]");
                            acao = scanner.nextLine();
                            if (acao.equalsIgnoreCase("n")) {
                                System.out.print("\nA agenda está sendo encerrada!");
                                System.exit(0);
                            }
                        }

                    } while (continuar.equalsIgnoreCase("s"));
                    break;

                case 4:
                    contato.imprimirAgenda();
                    System.out.print("\nDeseja realizar uma nova ação? [S/N]");
                    acao = scanner.nextLine();
                    if (acao.equalsIgnoreCase("n")) {
                        System.out.print("\nA agenda está sendo encerrada!");
                        System.exit(0);
                    }
                    break;

                case 5:
                    do {
                        System.out.print("Informe o numero do contato que deseja imprimir [comece pelo zero]: ");
                        int n = Integer.parseInt(scanner.nextLine());

                        contato.imprimirPessoa(n);

                        System.out.print("\nDeseja buscar outro contato? [S/N]");
                        continuar = scanner.nextLine();

                        if (continuar.equalsIgnoreCase("n")) {
                            System.out.print("\nDeseja realizar uma nova ação? [S/N]");
                            acao = scanner.nextLine();
                            if (acao.equalsIgnoreCase("n")) {
                                System.out.print("\nA agenda está sendo encerrada!");
                                System.exit(0);
                            }
                        }

                    } while (continuar.equalsIgnoreCase("s"));
                    break;
                case 0:
                    acao = "n";
                    System.out.print("\nA agenda está sendo encerrada, até a próxima!");
                    System.exit(0);
                    break;
            }
        } while (acao.equalsIgnoreCase("s"));

        scanner.close();
    }
}
