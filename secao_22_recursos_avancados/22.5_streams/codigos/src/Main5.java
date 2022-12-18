import java.util.ArrayList;
import java.util.List;

/**
 * Streams
 */
public class Main5 {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso("Programacao para Leigos", 170));
        cursos.add(new Curso("Algoritmos e Logica de Programacao: Essencial", 280));
        cursos.add(new Curso("Programacao em C: Essencial", 125));
        cursos.add(new Curso("Programacao em Java: Essencial", 0));
        cursos.add(new Curso("Programacao em Python: Essencial", 0));
        cursos.add(new Curso("Banco de Dados: Essencial", 0));

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
//                .findAny() // obtem qualquer valor a partir do filtro
                .findFirst() // obtem o primeiro valor a partir do filtro
                .ifPresent(System.out::println); // retorna o que encontrar

    }
}
