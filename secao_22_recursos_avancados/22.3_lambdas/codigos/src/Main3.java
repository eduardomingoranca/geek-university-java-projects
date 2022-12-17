import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Main3 {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        palavras.add("Henri");
        palavras.add("Victor");
        palavras.add("Kylian");
        palavras.add("Bruno");
        palavras.add("Remy");
        palavras.add("Pierre");

        palavras.sort(Comparator.comparingInt(String::length));

        palavras.forEach(System.out::println);

        Consumer<String> consumer = System.out::println;
        palavras.forEach(consumer);
    }

}
