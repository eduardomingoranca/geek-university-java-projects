// Tipos booleanos
public class Programa04 {

    public static void main(String[] args) {
        // Tipos primitivos
        boolean verdadeiro = true;
        boolean falso = false;

        // Tipos nao primitivos
        Boolean v = true;
        Boolean f = false;

        boolean ativo = false;

        System.out.println("Verdadeiro " + verdadeiro);
        System.out.println("False " + falso);
        System.out.println("V " + v);
        System.out.println("F " + f);

        if (verdadeiro) System.out.println("Eh Verdadeiro!");
        else System.out.println("Eh Falso!");

        if (1 == 3) System.out.println("1 == 1 eh verdadeiro!");
        else System.out.println("... eh falso!");

        if (ativo) System.out.println("Pode acessar o sistema!");
        else System.out.println("Acesso negado!");

    }
}
