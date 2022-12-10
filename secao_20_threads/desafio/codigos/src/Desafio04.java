/**
 * O que acontece se varios blocos catch correspondem ao tipo de excecao lancada?
 * RESPOSTA: O programa executa o primeiro catch correspondente
 */
public class Desafio04 {

    public static void main(String[] args) {
        try {
            int i = 2 / 0;
        } catch (ArithmeticException ae) {
            // sera executado apenas esse.
            System.out.print("executou o bloco 1");
        } catch (Exception e) {
            System.out.print("executou o bloco 2");
        }
    }
}
