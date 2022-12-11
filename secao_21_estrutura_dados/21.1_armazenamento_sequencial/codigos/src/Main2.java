public class Main2 {

    public static void main(String[] args) {
        Vetor lista = new Vetor();

        for (int i = 0; i < 300; i++) {
            Aluno a = new Aluno("Mary " + i);
            lista.adiciona(a);
        }

        System.out.println(lista);
        System.out.println(lista.tamanho());
    }
}
// 2 * 100 = 200
// 2 * 200 = 400
