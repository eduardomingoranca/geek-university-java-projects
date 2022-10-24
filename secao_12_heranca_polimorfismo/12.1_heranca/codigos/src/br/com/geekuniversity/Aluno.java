package br.com.geekuniversity;

/**
 * Beneficios da Heranca
 * Evita a repeticao de codigo
 * Facilita a manutencao do programa
 * .....
 * Classe especifica
 * - Sub-classe
 * - Classe filha
 * Aluno eh uma Pessoa
 * Quando uma classe herda de outra classe ela ganha;
 * - TODOS os atributos e metodos da classe herdada.
 */
public class Aluno extends Pessoa {
    private String ra;

    public Aluno(String nome, int anoNascimento, String email,String ra) {
        super(nome, anoNascimento, email);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

}
