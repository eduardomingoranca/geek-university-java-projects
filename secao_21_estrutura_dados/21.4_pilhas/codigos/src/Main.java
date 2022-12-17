/**
 * Pilhas
 * Sao estruturas de dados onde o elemento que esta visivel/disponivel eh o que
 * esta sempre no topo.
 * Os elementos, ao serem adicionados em uma pilha, sao adicionados sempre no topo.
 * Para remover elementos da pilha, so podemos remover o topo.
 * [4] -> Tem visibilidade
 * [3]
 * [2]
 * [1]
 * [0]
 */
public class Main {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        System.out.println(pilha);

        pilha.insere("Alice");
        pilha.insere("Felicity");

        System.out.println(pilha);

        String p = pilha.pegaTopo();
        System.out.println(p);

        String r1 = pilha.remove();
        System.out.println(r1);

        System.out.println(pilha);

        System.out.println(pilha.vazia());

        pilha.remove();
        System.out.println(pilha.vazia());
    }
}
