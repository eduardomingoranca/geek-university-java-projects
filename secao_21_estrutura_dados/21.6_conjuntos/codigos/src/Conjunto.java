import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 0 -> a
 * 1 -> b
 * .
 * .
 * .
 * 25 -> z
 */
public class Conjunto {
    private final ArrayList<LinkedList<String>> tabela = new ArrayList<>();
    
    public Conjunto() {
        for (int i = 0; i < 26; i++)
            tabela.add(new LinkedList<>());
    }

    private int calculaIndice(String nome) {
        return nome.toLowerCase().charAt(0) % 26;
    }

    public void adiciona(String nome) {
        // 1 - verifica se o nome nao existe na lista
        if (!contem(nome)) {
            // 2 - calculando o indice do nome
            int indice = calculaIndice(nome);
            // 3 - pegando a lista de acordo com o indice
            List<String> lista = tabela.get(indice);
            // 4 - adiciona o nome na lista correta
            lista.add(nome);
        }
    }

    private boolean contem(String nome) {
        // 1 - calculando o indice do nome
        int indice = calculaIndice(nome);
        // 2 - buscando na tabela especifica do indice o nome
        return tabela.get(indice).contains(nome);
    }

    public void remove(String nome) {
        // 1 - verificando se o nome existe em alguma lista
        if (contem(nome)) {
            // 2 - calculando o indice do nome
            int indice = calculaIndice(nome);
            // 3 - pegando a lista especifica do nome
            List<String> lista = tabela.get(indice);
            // 4 - removendo o nome da lista
            lista.remove(nome);
        }
    }

    @Override
    public String toString() {
        return tabela.toString();
    }

}
