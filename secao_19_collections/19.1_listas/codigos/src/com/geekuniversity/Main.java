package com.geekuniversity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Listas
 * >> Aceitam repeticao de valoes;
 * >> Possuem tamanho 'infinito' (Depende da memoria);
 * >> Podemos adicionar valores de qualquer tipo, desde
 * que nao especificamos um tipo na declaracao;
 * <p>
 * Arrays (Vetores/Matrizes)
 * >> Um array tem tamanho fixo. Ou seja, se criarmos um array com 5
 * elementos ele tera sempre no maximo 5 elementos.
 * >> Um array tem tipo de dado fixo. Ou seja, se criarmos um array de inteiros
 * ele so podera ter inteiros.
 * >> Eh dificil encontrar um determinado elemento em um array. Precisamos para
 * isso varrer todo o array atraves do seu indice, caso nao facamos busca pelo indice.
 * <p>
 * Collections (Colecoes)
 * >> Java possui diversas classes/interfaces que facilitam muito o trabalho quando
 * se trata de colecoes de dados. Essas classes/interfaces sao chamadas de Collections (Colecoes)
 */
public class Main {

    public static void main(String[] args) {
//        ArrayList nomes = new ArrayList(); // sem definir tipo de dado, podemos colocar qualquer tipo
        List<String> nomes = new ArrayList<>(); // definimos o tipo String

        nomes.add("Mary"); // 0
        nomes.add("Felix");
        nomes.add("Alice"); // 2
        nomes.add("George");
        nomes.add("Melissa"); // 4
        nomes.add("Arthur"); // 5

//        nomes.add(44);
//        nomes.add(true);
//        nomes.add(12.4);
//        System.out.println('e');

//        System.out.println(nomes.get(0));
//        System.out.println(nomes.get(3));

//        System.out.println(nomes.size());

//        for (int i = 0; i < nomes.size(); i++) {
//            System.out.println(nomes.get(i));
//        }

        Collections.sort(nomes);

        for (Object nome : nomes) {
            System.out.println(nome);
        }

    }
}
