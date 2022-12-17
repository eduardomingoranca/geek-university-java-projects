/**
 * Listas Duplamente Ligadas
 */
public class Main {

    public static void main(String[] args) {
        ListaLigada listaLigada = new ListaLigada();

        System.out.println(listaLigada);

        listaLigada.adiciona("Alice");
        System.out.println(listaLigada);
        listaLigada.adiciona("Eloise");
        System.out.println(listaLigada);

//        listaLigada.removeDoFim();
//        System.out.println(listaLigada);
//        listaLigada.removeDoFim();
//        System.out.println(listaLigada);

        System.out.println(listaLigada.contem("Alice"));

        listaLigada.remove(0);
        System.out.println(listaLigada);

        System.out.println(listaLigada.contem("Alice"));

    }
}
