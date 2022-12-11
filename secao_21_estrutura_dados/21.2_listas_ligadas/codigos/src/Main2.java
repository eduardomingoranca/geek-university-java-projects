public class Main2 {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adiciona("Alice");
        System.out.println(lista);

        lista.adiciona("Mary");
        System.out.println(lista);

        lista.adicionaNoComeco("Felicity");
        System.out.println(lista);

        lista.adiciona(1, "Charlotte");
        System.out.println(lista);

        Object ret = lista.pega(1);
        System.out.println(ret);

        System.out.println(lista.tamanho());
    }
}
