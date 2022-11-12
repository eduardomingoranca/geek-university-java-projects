/**
 * Trabalhando com Strings
 * <p>
 * Em java, Stings sao imutaveis, ou seja, nao mudam.
 */
public class Main {

    public static void main(String[] args) {
        String curso = "Programacao em Java: Essencial";

//        String nova = curso.replace("Java", "Python"); // Altera na string, se encontrar, a primeira palavra pela segunda
//        curso = curso.replace("a", "o");
//        System.out.println(nova);

        curso = curso.toLowerCase();
        System.out.println(curso);

        curso = curso.toUpperCase();
        System.out.println(curso);

        System.out.println(curso.charAt(0));

        for (int i = 0; i < curso.length(); i++)
            System.out.print(" " +curso.charAt(i));

        System.out.println();
        for (int i = (curso.length() -1); i >= 0; i--)
            System.out.print(" " + curso.charAt(i));

    }
}
