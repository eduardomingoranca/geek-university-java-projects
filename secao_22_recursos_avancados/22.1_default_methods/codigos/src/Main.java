import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Default methods -> Sao metodos concretos implementados em
 * interfaces. Estes metodos, como sao concretos, ou seja,
 * ja possuem implementacao, nao precisam ser implementados
 * nas classes que implementarem esta interface.
 * Novidade implementada a partir da versao 8 do java
 */
public class Main {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        Comparator<String> comparator = new ComparadorPorTamanho();

        palavras.add("Gabriel");
        palavras.add("Ulises");
        palavras.add("Jerome");
        palavras.add("Amelie");
        palavras.add("Pierre");
        palavras.add("Olivier");

//        sort(palavras); // Ordena de forma alfabetica
//        sort(palavras, comparator);
        palavras.sort(comparator);

//        for (String palavra : palavras) {
//            System.out.println("A palavra " + palavra + " tem tamanho " + palavra.length());
//        }

        System.out.println(palavras);
    }
}
