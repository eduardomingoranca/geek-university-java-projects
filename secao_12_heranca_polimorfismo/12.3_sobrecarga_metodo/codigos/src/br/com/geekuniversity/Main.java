package br.com.geekuniversity;

/**
 * Sobrecarga de metodo
 * - Overloading
 * Ocorre quando se sobrescreve um metodo na mesma classe de declaracao.
 */
public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.mensagem();
        p1.mensagem("Minha mensagem eh diferente...");
    }
}
