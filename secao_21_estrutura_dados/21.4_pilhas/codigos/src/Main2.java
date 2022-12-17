import java.util.Stack;

/**
 * Pilhas - Implementacao do Java
 */
public class Main2 {

    public static void main(String[] args) {
        Stack<String> nomes = new Stack<>();

        System.out.println(nomes);

        nomes.push("Alice"); // insere
        nomes.push("Felicity"); // insere
        System.out.println(nomes);

        String ret = nomes.peek(); // Retorna o elemento do topo
        System.out.println(ret);

        String r1 = nomes.pop(); // remove
        System.out.println(r1);
        System.out.println(nomes);
    }
}
