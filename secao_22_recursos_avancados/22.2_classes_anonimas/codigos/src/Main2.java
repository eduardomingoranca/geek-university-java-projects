import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Main2 {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        Comparator<String> comparator = new ComparadorPorTamanho();

        palavras.add("Gabriel");
        palavras.add("Ulises");
        palavras.add("Jerome");
        palavras.add("Antoinette");
        palavras.add("Pierre");
        palavras.add("Olivier");

        palavras.sort(comparator);

        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
