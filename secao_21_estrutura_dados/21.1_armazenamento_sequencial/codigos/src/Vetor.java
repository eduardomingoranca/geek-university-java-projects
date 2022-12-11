import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];
    private int total = 0;

    public void adiciona(Aluno aluno) {
        // TODO receber um aluno
        this.garantirEspaco();
        this.alunos[total] = aluno;
        total = total + 1;
    }

    public void adiciona(int posicao, Aluno aluno) {
        this.garantirEspaco();
        if (!posicaoOcupada(posicao))
            throw new IllegalArgumentException("Posicao invalida!");

        for (int i = total - 1; i >= posicao; i-=1)
            alunos[i+1] = alunos[i];
        alunos[posicao] = aluno;
        total++; // total = total + 1
    }

    public Aluno pega(int posicao) {
        if (!posicaoOcupada(posicao))
            throw new IllegalArgumentException("Posicao invalida!");
        return this.alunos[posicao];
    }

    public void remove(int posicao) {
        for (int i = posicao; i < this.total; i++)
            this.alunos[i] = this.alunos[i+1];
        total--;
    }

    public boolean contem(Aluno aluno) {
        // TODO descobre se o aluno esta ou nao na lista
        for (int i = 0; i < total; i++) {
            if (aluno.equals(alunos[i]))
                return true;
        }
        return false;
    }

    public int tamanho() {
        // TODO devolve a quantidade de alunos no vetor
        return this.total;
    }

    @Override
    public String toString() {
        // facilita a visualizacao do array
        return Arrays.toString(this.alunos);
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < total;
    }

    private void garantirEspaco() {
//        Verifica se o array alunos esta cheio
        if (total == alunos.length) {
//            Caso esteja cheio, cria um novo array com o dobro de tamanho do array anterior
            Aluno[] newArray = new Aluno[alunos.length*2];
//            Copia os dados do array anterior para o novo array
            System.arraycopy(alunos, 0, newArray, 0, alunos.length);
//            Por ultimo, atribuimos o novo array ao array original
            this.alunos = newArray;
        }
    }
}

