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
            } finally {
                System.out.println("Continua o processo...");
            }
        }

    }
}
