/**
 * Metodos estaticos
 * <p>
 * Um metodo estatico, nao depende de uma instancia da classe
 * para ser utilizado.
 * <p>
 * Pode-se utilizar conforme:
 * NomeDaClasse.metodo();
 */
public class Main {

    public static void main(String[] args) {
        Conta c1 =  new Conta("Eloise Johnson");
        System.out.println("Numero da conta: " + c1.getNumero());
        System.out.println("Cliente: " + c1.getCliente());

        System.out.println("A proxima conta sera: " + Conta.proximaConta());
    }
}
