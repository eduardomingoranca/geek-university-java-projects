/**
 * Tratando excecoes com try/catch
 * <p>
 * Utilizamos o try para tentar realizar algo, geralmente realizar aquilo que
 * pode acarretar em um problema.
 * <p>
 * Utilizamos o catch para capturar o erro e com isso oferecer ao usuario do sistema
 * uma mensagem adequada sem que o sistema quebre.
 * <p>
 * numbers[0] -> i = 0; 0 + 3 * 2 -> 6
 * numbers[1] -> i = 1; 1 + 3 * 2 -> 7
 * numbers[2] -> i = 2; 2 + 3 * 2 -> 8
 * numbers[3] -> i = 3; 3 + 3 * 2 -> 9
 * numbers[4] -> i = 4; 4 + 3 * 2 -> 10
 */
public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[5]; // 0..4 -> 0, 1, 2, 3, 4, -> n - 1

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 3 * 2;
        }

        for (int i = 0; i <= numbers.length; i++) {
            try { // Tente fazer isso
                System.out.println(numbers[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Voce esta tentando acessar uma posicao do array que nao existe.");
            }
        }

    }
}
