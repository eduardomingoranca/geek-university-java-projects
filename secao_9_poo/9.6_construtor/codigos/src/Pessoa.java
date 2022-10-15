/**
 * Construtor
 * Sempre, um construtor vazio tem a seguinte forma:
 * public NomeDaClasse(){ }
 */
public class Pessoa {
    String nome;
    String email;
    int anoNascimento;

//    Construtor vazio
    public Pessoa() { }

//    Construtor com parametros
    public Pessoa(String nome, String email, int anoNascimento) {
//        this == Este objeto
        this.nome = nome;
        this.email = email;
        this.anoNascimento = anoNascimento;
    }

    void imprimeInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Ano de nascimento: " + this.anoNascimento);
    }

}
