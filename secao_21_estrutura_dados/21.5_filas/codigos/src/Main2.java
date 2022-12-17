import java.util.LinkedList;
import java.util.Queue;

/**
 * Fila -> Implementacao do Java
 */
public class Main2 {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Alice"); // inserir
        fila.add("Mary"); // inserir
        fila.add("Felicity"); // inserir

        System.out.println(fila);

        String ret = fila.poll(); // remover
        System.out.println(ret);

        System.out.println(fila);
    }
}
