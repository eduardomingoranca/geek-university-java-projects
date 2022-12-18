import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Revisao
 * >> Classes anonimas;
 * >> Lambdas;
 * >> Method References;
 */
public class Main {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso("Programacao para Leigos", 170));
        cursos.add(new Curso("Algoritmos e Logica de Programacao: Essencial", 280));
        cursos.add(new Curso("Programacao em C: Essencial", 125));
        cursos.add(new Curso("Programacao em Java: Essencial", 0));
        cursos.add(new Curso("Programacao em Python: Essencial", 0));
        cursos.add(new Curso("Banco de Dados: Essencial", 0));

//        cursos.sort(Comparator.comparing(c -> c.getAlunos())); // Lambda
        cursos.sort(Comparator.comparing(Curso::getAlunos)); // Method References

//        cursos.forEach(c -> System.out.println(c.getNome()));
        cursos.forEach(System.out::println); // Method References

        System.out.println(cursos);
    }
}
