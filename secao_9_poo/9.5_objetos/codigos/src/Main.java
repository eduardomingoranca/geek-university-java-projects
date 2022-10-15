/**
 * Objetos
 * Objetos sao produtos/instancias da classe;
 */
public class Main {

    public static void main(String[] args) {

//        Declaracao de um objeto
        Produto p0;

//        Declaracao e instanciacao/iniciacao do objeto
//        p1 -> instancia do objeto/objeto
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 2.367f;
        p1.desconto = 15.0f;

        System.out.println("========== PRODUTOS ==========");
        System.out.println(p1.nome);
        System.out.println("R$ " + p1.preco);
        System.out.println(p1.desconto + "%");

        p0 = new Produto();
        p0.nome = "Caneta Bic";
        p0.preco = 2.45f;
        p0.desconto = 5;

        System.out.println();
        System.out.println(p0.nome);
        System.out.println("R$ " + p0.preco);
        System.out.println(p0.desconto + "%");

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Colin Paxton";
        pessoa.email = "colinpaxton@email.com";
        pessoa.anoNascimento = 1990;

        System.out.println("========== PRODUTOS ==========");
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Email: " + pessoa.email);
        System.out.println("Ano de nascimento: " + pessoa.anoNascimento);

    }
}
