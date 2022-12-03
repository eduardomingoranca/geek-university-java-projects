package com.geekuniversity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Mapas/Map
 * Os mapas sao representados em Java pela interface Map
 * e mapeia seus elementos utilizando o conceito de chave/valor
 * >> Mapas sao conhecidos como se fossem/representassem 3 colecoes
 *  >> Colecao de chaves;
 *  >> Colecao de valores;
 *  >> Colecao de associacoes;
 */
public class Main {

    public static void main(String[] args) {
        Map<Integer, String> pessoas =  new HashMap<>();

        pessoas.put(21, "Felicity Jones");
        pessoas.put(31, "Mary Alton");
        pessoas.put(41, "Alice Wheeler");

//        Colecao de chaves
        System.out.println("Chaves: " + pessoas.keySet());

//        Colecao de valores
        System.out.println("Valores: " +  pessoas.values());

//        Colecao de associacoes
        System.out.println("Associacoes: " +pessoas.entrySet());

//        Iterar na colecao de chaves

//        Forma 01
        pessoas.keySet().forEach(idade -> System.out.println(pessoas.get(idade)));

//        Forma 02
        Set<Integer> chaves = pessoas.keySet();
        for (Integer idade: chaves) {
            System.out.println(pessoas.get(idade));
        }

//        Iterar na colecao de valores

//        Forma 01
        Collection<String> valores = pessoas.values();
        for (String nome: valores) {
            System.out.println(nome);
        }

//        Forma 02
        pessoas.values().forEach(System.out::println);

//        Iterar a colecao de associacoes

//        Forma 01
        Set<Map.Entry<Integer, String>> associacoes = pessoas.entrySet();
        for (Map.Entry<Integer, String> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }

//        Forma 02
        pessoas.forEach((key, value) -> System.out.println(key + " - " + value));

    }
}
