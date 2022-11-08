package br.com.geekuniversity;

/**
 * Classes Abstratas
 * Eh um recurso que proporciona um bloqueio na criacao de objetos;
 * Nao conseguimos instanciar objetos de uma classe abstrata;
 */
public class Main {

    public static void main(String[] args) {
        Aluno mary = new Aluno("Mary Smith", 1999, "mary@email.com", "123456");
        System.out.println(mary);

        mary.outraMensagem("Meu nome eh " + mary.getNome());
    }
}
