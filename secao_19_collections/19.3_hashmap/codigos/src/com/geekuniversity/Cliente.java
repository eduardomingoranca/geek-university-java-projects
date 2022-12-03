package com.geekuniversity;

public class Cliente implements Comparable {
    private final String nome;
    private final String endereco;
    private final int idade;

    public Cliente(int idade, String nome, String endereco) {
        this.idade = idade;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return this.getNome();
    }

    @Override
    public int compareTo(Object o) {
        Cliente aux = (Cliente) o;
        return Integer.compare(this.getIdade(), aux.getIdade());
    }
}
