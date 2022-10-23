/**
 * Protected (Protegido)
 * <p>
 * Eh o modificador de acesso default (Padrao)
 * <p>
 * - O modificador de acesso Protected faz com que
 * o elemento seja visivel somente dentro do mesmo
 * pacote onde o elemento foi declarado.
 */
public class Cliente {
    private final String nome;
    private final String endereco;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;

    }

    protected void oi() {
        System.out.println(this.nome + " oi...");
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

}
