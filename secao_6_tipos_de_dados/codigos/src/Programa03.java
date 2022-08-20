// Tipos de dados alfanumericos
// caracteres e strings
public class Programa03 {

    public static void main(String[] args) {
        // Tipos primitivos
        char letra = 'a';
        char letra2 = 97; // 97 em decimal == 'a'
//        char letra4 = "b"; // Errado
//        string nom = "adads"; Nao existe o tipo primitivo string em Java

        System.out.println("Letra2 = " + letra2);

        letra2 = (char) (letra2 + 1); // cast

        System.out.println("Letra = " + letra);
        System.out.println("Letra2 = " + letra2);

        // Tipos nao primitivos
        Character letra3 = 'A';
        String nome = "Geek";

        System.out.println("Letra3 = " + letra3);

        System.out.println("char/Character " + Character.SIZE + " bits.");

        System.out.println("Valor Min char/Character " + Character.MIN_VALUE); // 0
        System.out.println("Valor Max char/Character " + Character.MAX_VALUE); // 6553

        System.out.println("Nome: " + nome);

        System.out.println("Tamanho da String: " + nome.length());

        System.out.println("String " + (Character.SIZE * nome.length()) + " bits.");
    }
}
