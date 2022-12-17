import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Classes Anonimas
 * Classes anonimas sao classes sem nome.
 * Quando utilizar?
 * Utiliza-se classes anonimas quando se tem intefaces
 * com um ou poucos metodos e nao precisa reaproveitar o
 * codigo da classe.
 * Ou seja, se nao ira precisar reaproveitar a classse em
 * um outro lugar do sistema e esta classe apenas ira implementar
 * uma interface com um ou poucos metodos, pode-se utilizar o
 * conceito de classe anonima.
 */
public class Main {

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

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        palavras.forEach(consumer);
    }
}
