/**
 * Public
 * > Publico - Pode ser utilizado em todo o projeto;
 */
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Arabella Johnson", "1st Street, 02");

        System.out.println("Nome: " + cliente.nome);
        System.out.println("Endereco: " + cliente.endereco);

    }
}
