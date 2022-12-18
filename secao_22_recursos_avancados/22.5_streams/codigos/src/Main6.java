import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toMap;

/**
 * Streams
 */
public class Main6 {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso("Programacao para Leigos", 170));
        cursos.add(new Curso("Algoritmos e Logica de Programacao: Essencial", 280));
        cursos.add(new Curso("Programacao em C: Essencial", 125));
        cursos.add(new Curso("Programacao em Java: Essencial", 0));
        cursos.add(new Curso("Programacao em Python: Essencial", 0));
        cursos.add(new Curso("Banco de Dados: Essencial", 0));

//        List<Curso> resultado = cursos.stream()
//                .filter(c -> c.getAlunos() >= 100)
//                .collect(toList());
//
//        System.out.println(resultado);

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(toMap(Curso::getNome, Curso::getAlunos))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
    }
}
