import java.util.LinkedList;

/**
 * Conjuntos
 * Uma das caracteristicas dos conjuntos eh a nao aceitacao de
 * elementos repetidos.
 * <p>
 * Gerando performance
 * <p>
 * A = ['Alice', 'Amelie', 'Andre' ...]
 * B = ['Barbara', 'Beatrice', 'Bruno' ...]
 * C = ['Charles', 'Caroline', 'Cecile' ...]
 * D = ['Daniela', 'Decio', 'Diego' ...]
 * E = ['Edouard', 'Ettiene', 'Ettore' ...]
 * F = ['Ferrand', 'Felix', 'Fabian' ...]
 * .
 * .
 * .
 * Z = ['Zuleica', 'Zachary', 'Zamael' ...]
 * <p>
 *  0  1  2  3  4  5
 * [a][m][e][l][i][e]
 */
public class Main {

    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto();
        System.out.println(conjunto);

        conjunto.adiciona("Alice");

        System.out.println(conjunto);

        conjunto.adiciona("Anne");
        conjunto.adiciona("Felicity");
        conjunto.adiciona("Gabrielle");
        conjunto.adiciona("Jules");
        conjunto.adiciona("Fabien");
        conjunto.adiciona("Felicity"); // Nao entra repetido

        conjunto.remove("Jules");

        System.out.println(conjunto);

    }
}
