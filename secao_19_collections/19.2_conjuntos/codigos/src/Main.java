import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Conjuntos
 * >> Os conjuntos sao implementados com a interface Set, e uma das
 * classes que implementam esta interface eh a HashSet
 * A maioria das colecoes possuem os mesmos metodos ja conhecidos
 * e utilizados com as listas, mas o comportamento desses objetos
 * eh um pouco diferente.
 * A performance tambem eh melhor em conjuntos do que em listas.
 * Caracteristicas dos conjuntos:
 * >> Nao aceitam valores repetidos;
 * >> A ordem de insercao nao eh respeitada (Realiza uma semi-ordenacao);
 * >> Nao aceira ordenacao;
 * >> Nao possui indice;
 */
public class Main {

    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();
        Scanner teclado = new Scanner(System.in);
        boolean res;

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o " + (i+1) + "/5 nome: ");
            String nome = teclado.nextLine();
            res = nomes.add(nome);

            if (!res) {
                System.out.println("O nome nao pode ser repetido.");
                i--;
            }

        }

        System.out.println("No conjunto nomes temos " + nomes.size() + " elementos.");

        for (String nome: nomes) {
            System.out.println(nome);
        }

        teclado.close();
    }
}
