/**
 * Template Method
 * <p>
 * - O padrao Template Method define o esqueleto de um algoritmo dentro de um metodo,
 * transferido alguns de seus passos para as subclasses. O template method permite
 * que as subclasses redefinam certos passos de um algoritmo sem alterar a estrutura
 * do proprio algoritmo.
 * <p>
 * Algoritmos sao "receitas" passo-a-passo para resolver algum problema.
 * <p>
 * receber numero;
 * retornar numero * numero;
 * <p>
 * metodo_principal() {
 *     passo1();
 *     passo2();
 *     passo3();
 * }
 */
public class Main {

    public static void main(String[] args) {
        TreinamentoInicioDaTemporada tit = new TreinamentoInicioDaTemporada();
        tit.treinoDiario();

        TreinamentoFimDaTemporada tft = new TreinamentoFimDaTemporada();
        tft.treinoDiario();
    }
}
