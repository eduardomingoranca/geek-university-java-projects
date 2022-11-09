/**
 * Template Method
 * <p>
 * - Final eh um modificador de acesso que faz com que
 * o elemento que esteja utilizando, nao possa ser extendido/reescrito.
 */
public abstract class Treinamento {

    // Template Method
    public final void treinoDiario() {
        preparoFisico();
        jogoTreino();
        treinoTatico();
    }

    public void treinoTatico() {
        System.out.println("Treino tatico...");
    }

    public abstract void jogoTreino();

    public abstract void preparoFisico();

}
