/**
 * Atributos estaticos
 * <p>
 * Atributos estaticos sao atributos, onde os valores sao compartilhados
 * entre as instancias da classe.
 * <p>
 * Exemplo:
 * NomeDaClasse.atributo;
 */
public class Main {

    public static void main(String[] args) {
        Conta c1 = new Conta("Arthur Johnson");

        System.out.println(c1.getNumero());
        System.out.println(c1.getCliente());

        Conta c2 = new Conta("Benjamin Johnson");

        System.out.println(c2.getNumero());
        System.out.println(c2.getCliente());

        Conta c3 = new Conta("Colin Johnson");

        System.out.println(c3.getNumero());
        System.out.println(c3.getCliente());

        System.out.println(Conta.contador);

        Conta.contador = 42;

        System.out.println(Conta.contador);

        Conta c4 = new Conta("Daphne Johnson");

        System.out.println(c4.getNumero());
        System.out.println(c4.getCliente());

    }
}
