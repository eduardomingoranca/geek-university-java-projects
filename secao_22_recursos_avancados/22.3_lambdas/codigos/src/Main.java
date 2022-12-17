import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Lambdas
 * Expressoes lambdas, sao funcoes anonimas, ou seja, funcoes sem nome.
 * Ja se sabe que pode-se utilizar expressoes lambdas com interfaces funcionais.
 * Deve-se entao criar uma funcao lambda compativel com a funcao da interface
 * que estiver utilizando.
 * Por exemplo:
 *  >> A interface consumer, possui um metodo que recebe uma string e nao retorna
 *  nada. Por isso foi possivel utilizar a expressao lambda que passa uma string
 *  como parametro e nao retorna nada.
 *  >> A funcao sort, espera receber dois parametros do tipo string como entrada
 *  e retorna um inteiro. Por isso foi possivel passar a expressao lambda informando
 *  as duas strings, s1 e s2 e utilizando a classe Integer.compare que retorna um inteiro.
 */
public class Main {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        Comparator<String> comparator = new ComparadorPorTamanho();

        palavras.add("Henri");
        palavras.add("Victor");
        palavras.add("Kylian");
        palavras.add("Bruno");
        palavras.add("Remy");
        palavras.add("Pierre");

        palavras.sort(comparator);

        palavras.forEach(System.out::println);
    }
}
