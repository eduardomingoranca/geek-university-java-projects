/**
 * Construtor
 * O construtor de uma classe SEMPRE tem o mesmo nome da classe;
 * Por padrao, a JVM - Java Virtual Machine, cria em tempo de execucao,
 * um construtor padrao - um construtor vazio;
 * Podemos ter mais de um construtor na classe;
 */
public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(); // (Metodo) Construtor
        pessoa1.nome = "Catherine Jones";
        pessoa1.email = "catherine@email.com";
        pessoa1.anoNascimento = 1986;

        pessoa1.imprimeInformacoes();

        Pessoa pessoa2 = new Pessoa("Alice Hauser", "alice@email.com", 1976);
        pessoa2.imprimeInformacoes();

    }
}
