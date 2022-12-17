import java.util.Comparator;

/**
 * Criando o proprio comparador de objetos (Strings)
 * para que seja possivel, desta forma, ordenar a string pelo seu tamanho
 * ao inves de ordem alfabetica.
 * <p>
 * 1 - A string1 eh menor que a string2 -> retorna -1
 * 2 - A string1 eh maior que a string2 -> retorna 1
 * 3 - A string1 tem o mesmo tamanho da string2 -> retorna 0
 */
public class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        // 1 - A string1 eh menor que a string2 -> retorna -1
        // 2 - A string1 eh maior que a string2 -> retorna 1
        // 3 - A string1 tem o mesmo tamanho da string2 -> retorna 0
        return Integer.compare(o1.length(), o2.length());
    }


}
