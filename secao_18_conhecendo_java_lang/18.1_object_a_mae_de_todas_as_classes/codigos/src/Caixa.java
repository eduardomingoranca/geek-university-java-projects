public class Caixa {
    private final Object[] objects;
    private int posicaoLivre;

    public Caixa() {
        this.objects = new Conta[100]; // ate 100 objects, 0..99
        posicaoLivre = 0;
    }

    public void adicionar(Object nova) {
        this.objects[this.posicaoLivre] = nova;
        this.posicaoLivre++;
    }

    public Object pegar(int posicao) {
        return this.objects[posicao];
    }

}
