import java.util.HashSet;
import java.util.Set;

/**
 * Implementacao de conjuntos do java
 */
public class Main2 {

    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();

        System.out.println(nomes);

        nomes.add("Alice");
        nomes.add("Amelie");
        nomes.add("Gabrielle");

        System.out.println(nomes);

        String nome1 = "Alice";
        String nome2 = "Amelie";
        String nome3 = "Gabrielle";

        System.out.println(nome1.hashCode());
        System.out.println(nome2.hashCode());
        System.out.println(nome3.hashCode());
        System.out.println("Alice".hashCode());
    }
}
