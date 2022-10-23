public class Cliente {
    private final String nome;
    private final String endereco;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;

        oi();
    }

    private void oi() {
        System.out.println(this.nome + " oi...");
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

}
