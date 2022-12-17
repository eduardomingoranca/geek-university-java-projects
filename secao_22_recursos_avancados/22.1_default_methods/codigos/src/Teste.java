public interface Teste {

    int valor = 9;

    String mensagem();

    default void meuMetodo() {
        System.out.println("Meu default method...");
    }

}
