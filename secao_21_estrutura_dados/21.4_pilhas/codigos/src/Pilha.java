import java.util.LinkedList;
import java.util.List;

public class Pilha {
    private final List<String> nomes = new LinkedList<>();

    /**
     * Em uma pilha, inserimos elementos sempre no topo.
     * @param nome
     *
     * Na implementacao do Java para pilhas (Stack) este
     * metodo chama-se push
     */
    public void insere(String nome) {
        this.nomes.add(nome);
    }

    /**
     * Em um pilha, removemos sempre o elemento que esta no topo.
     * @return
     *
     * Na implementacao do Java para pilhas (Stack) este
     * metodo chama-se pop
     */
    public String remove() {
        return nomes.remove(nomes.size() - 1);
    }

    public String pegaTopo() {
        return nomes.get(nomes.size() - 1);
    }

    public boolean vazia() {
        return nomes.size() == 0;
    }

    @Override
    public String toString() {
        return this.nomes.toString();
    }

}
