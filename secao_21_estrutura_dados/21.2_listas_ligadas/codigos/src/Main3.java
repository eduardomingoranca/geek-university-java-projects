public class Main3 {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);

        lista.adiciona("Alice");
        System.out.println(lista);
        lista.adiciona("Mary");
        lista.adiciona("Felicity");
        System.out.println(lista);
        lista.removeDoComeco();
        System.out.println(lista);

    }
}
