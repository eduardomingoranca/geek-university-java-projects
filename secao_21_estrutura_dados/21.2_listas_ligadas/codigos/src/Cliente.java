/**
 * Protected (Protegido)
 * Eh o modificador de acesso default (Padrao)
 * >> O modificador de acesso Protected faz com que
 *    o elemento seja visível somente dentro do mesmo
 *    pacote onde o elemento foi declarado.
 */
public class Cliente implements Comparable {
    private final int idade;
    private final String nome;
    private final String endereco;

    public Cliente(int idade, String nome, String endereco) {
        this.idade = idade;
        this.nome = nome;
        this.endereco = endereco;
    }

    protected void dizer_oi() {
        System.out.println(this.nome + " está dizendo oi...");
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndeco() {
        return this.endereco;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int compareTo(Object o) {
        Cliente aux = (Cliente) o;
        return Integer.compare(this.idade, aux.idade);
    }
}
