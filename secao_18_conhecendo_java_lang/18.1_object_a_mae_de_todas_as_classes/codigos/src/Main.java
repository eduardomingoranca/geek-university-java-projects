/**
 * Object: A mae de todas as classes
 * <p>
 * A classe Object, faz parte do pacote java.lang
 */
public class Main extends Object {

    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Alice Hammond", "Rua Two, 245");
        Cliente cli2 = new Cliente("Barbara Hammond", "Rua One, 213");

        Conta c1 = new Conta(1, 200.0, 300.0, cli1);
        Conta c2 = new Conta(2, 200.0, 300.0, cli2);

        Caixa prateleira = new Caixa();

        System.out.println(c1); // por padrao a instancia imprime com toString()
        System.out.println(c2);

        if (c1.equals(c2)) System.out.println("Sao a mesma conta!");
        else System.out.println("Sao contas diferentes!");

        prateleira.adicionar(c1); // 0 - tem getSaldo();
        prateleira.adicionar(c2); // 1 - tem getSaldo();

//        Conta conta = prateleira.pegar(0);
        System.out.println("R$ " + ((Conta) prateleira.pegar(0)).getSaldo());

//        prateleira.adicionar(cli1); // 2 - nao tem getSaldo()
//        System.out.println(((Cliente)prateleira.pegar(2)).getNome());


        if ((Object) cli1 instanceof Conta) System.out.println("O objeto eh do tipo Conta");
        else System.out.println("O objeto nao eh do tipo Conta");
    }
}
