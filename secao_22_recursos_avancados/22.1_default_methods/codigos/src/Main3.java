import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * forEach
 */
public class Main3 {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        Consumer<String> consumer = new ImprimeNaLinha();
        
        palavras.add("Gabriel");
        palavras.add("Ulises");
        palavras.add("Jerome");
        palavras.add("Amelie");
        palavras.add("Pierre");
        palavras.add("Olivier");

        palavras.forEach(consumer); // for each -> para cada
    }
}
