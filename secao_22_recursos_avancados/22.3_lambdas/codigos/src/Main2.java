import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main2 {

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
    }
}
