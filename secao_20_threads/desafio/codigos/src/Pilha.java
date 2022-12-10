public class Pilha {

    private final String[] alunos;
    private int topoPilha;

    public Pilha(int tamPilha) {
        this.alunos = new String[tamPilha];
        this.topoPilha = -1;
    }

    private void push(String message) {
        PilhaCheia pilhaCheia = new PilhaCheia(message);
        System.out.println(pilhaCheia.getMessage());
    }

    private void pop(String message) {
        PilhaVazia pilhaVazia = new PilhaVazia(message);
        System.out.println(pilhaVazia.getMessage());
    }

    public void insereNome(String nome) {
        if (topoPilha == alunos.length -1) {
            push("A PILHA ESTA CHEIA!");
        } else {
            topoPilha++;
            alunos[topoPilha] = nome;
        }
    }

    public void removeNome() {
        if (topoPilha < 0) {
            pop("A PILHA ESTA VAZIA!");
        } else {
            alunos[topoPilha] = null;
            --topoPilha;
        }
    }

}
