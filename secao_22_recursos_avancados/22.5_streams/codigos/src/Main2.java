import java.util.ArrayList;
import java.util.List;

/**
 * Streams -> Sao fluxos de dados/objetos utilizados para que se possa
 * trabalhar com esses dados de forma mais criteriosa.
 * >> Quando se trabalha com stream, os metodos aplicados a este stream
 * nao afeta a collection original.
 */
public class Main2 {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso("Programacao para Leigos", 170));
        cursos.add(new Curso("Algoritmos e Logica de Programacao: Essencial", 280));
        cursos.add(new Curso("Programacao em C: Essencial", 125));
        cursos.add(new Curso("Programacao em Java: Essencial", 0));
        cursos.add(new Curso("Programacao em Python: Essencial", 0));
        cursos.add(new Curso("Banco de Dados: Essencial", 0));

//        obtendo cursos com mais de 100 alunos
//        cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));

        // 1 - transformando a colecao de cursos em stream
        cursos.stream()
                // 2 - aplica o filtro onde os cursos com 100 ou mais alunos
                .filter(c -> c.getAlunos() >= 100)
                // 3 - imprime o resultado
                .forEach(System.out::println);

    }
}
