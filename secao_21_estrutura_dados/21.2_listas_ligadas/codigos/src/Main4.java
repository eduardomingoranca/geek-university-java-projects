import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList
 */
public class Main4 {

    public static void main(String[] args) {
        List<String> lista = new LinkedList<>();

        System.out.println(lista.size());

        lista.add("Felicity");
        lista.add("Alice");

        lista.add(0, "Mary");

        System.out.println(lista);
    }
}
