/**
 * Lista Ligada | Linked List
 * Em um vetor, os elementos estao um do lado do outro,
 * enquanto em uma lista ligada, eles estao em lugares
 * diferentes, porem um aposta para o outro indicando
 * o proximo elemento.
 * ===================
 * [1, 2, 3, ]
 */
public class Main {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeco("Mary");
        System.out.println(lista);
        lista.adicionaNoComeco("Alice");
        System.out.println(lista);
        lista.adicionaNoComeco("Felicity");
        System.out.println(lista);

        String nome = "Peter";
        lista.adicionaNoComeco(nome);
        System.out.println(lista);

        int numero = 42;
        lista.adicionaNoComeco(numero);
        System.out.println(lista);

        Cliente cliente = new Cliente(21, "Julia Paxton", "Rua Three");
        lista.adicionaNoComeco(cliente);
        System.out.println(lista);
    }
}
