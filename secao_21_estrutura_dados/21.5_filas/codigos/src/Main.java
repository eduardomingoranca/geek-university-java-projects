/**
 * Filas
 * Todo elemento entra no final da fila.
 * O primeiro elemento a entrar eh tambem o primeiro a sair.
 * <- [0][1][2][3][4]
 */
public class Main {

    public static void main(String[] args) {
        Fila fila = new Fila();
        System.out.println(fila);

        fila.adiciona("Alice");
        fila.adiciona("Felicity");
        fila.adiciona("Mary");

        System.out.println(fila);

        String ret = fila.remove();
        System.out.println(ret);

        System.out.println(fila);

        System.out.println(fila.vazia());

        fila.remove();
        fila.remove();
        fila.remove();
        System.out.println(fila.vazia());
    }
}
