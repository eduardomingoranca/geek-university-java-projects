/**
 * Classe que representa uma celula (container) onde
 * teremos o objeto (valor) e uma celula que sera a
 * ligacao para o proximo.
 */
public class Celula {
    private final Object elemento;
    private Celula proximo;

    public Celula(Object elemento, Celula proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

}
