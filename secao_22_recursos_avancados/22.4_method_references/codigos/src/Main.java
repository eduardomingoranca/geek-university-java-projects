import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * Method references
 * Podem ser consideradas simplificacoes das expressoes lambdas.
 */
public class Main {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        palavras.add("Felix");
        palavras.add("Thierry");
        palavras.add("Isaac");
        palavras.add("Amelie");
        palavras.add("Olivier");
        palavras.add("Pierre");

//        Method reference - Forma 1
//        palavras.sort(Comparator.comparing(String::length));

//        Method reference - Forma 2
        Function<String, Integer> tamanho = String::length;
        Comparator<String> comparator = Comparator.comparing(tamanho);
        palavras.sort(comparator);

//        System.out.println(palavras);

        palavras.forEach(System.out::println);
    }
}
