import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

public class Agenda {
    private Pessoa pessoa;
    private final List<Agenda> agenda = new ArrayList<>();
    private final Vector<String> names = new Vector<>();

    public Agenda() { }

    public Agenda(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public List<Agenda> getAgenda() {
        return agenda;
    }

    public void armazenaPessoa(String nome, int idade, double altura) {
        pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setAltura(altura);

        Agenda contato = new Agenda(pessoa);

        System.out.println(contato.getPessoa().getNome() + "; " + contato.getPessoa().getIdade() + "; "
                + contato.getPessoa().getAltura());
        if (agenda.size() < 2) {
            agenda.add(contato);
            names.add(contato.getPessoa().getNome());
            System.out.println(agenda.size() + " Contato Cadastrado.");
        } else if (agenda.size() <= 9){
            agenda.add(contato);
            names.add(contato.getPessoa().getNome());
            System.out.println(agenda.size() + " Contatos Cadastrados.");
        } else System.out.println("Capacidade máxima de " +  agenda.size() + " atiginda.");
    }

    public String removePessoa(String nome) {
        for (int j = 0; j < agenda.size(); j++) {
            if (Objects.equals(nome, agenda.get(j).getPessoa().getNome())){
                agenda.remove(j);
                names.remove(j);
                return "\nO contato foi excluido com sucesso.";
            }
        }
        return "\nO contato não está registrado na agenda!";
    }

    public int buscaPessoa(String nome) {
        int verify = names.indexOf(nome);
        int position = 0;

        for (int i = 0; i < agenda.size(); i++) {
            if (verify != -1) {
                position = verify + 1;
                break;
            }
        }

        return position;
    }


    @Override
    public String toString() {
        return pessoa.getNome() + "; " + pessoa.getIdade() + "; " + pessoa.getAltura();
    }

    public void imprimirAgenda() {
        System.out.println("");
        for (Agenda set : agenda)
            System.out.println(set);
    }

    public void imprimirPessoa(int i) {
        System.out.println("\nA agenda atualmente possui " + agenda.size() + " contato(s).");
        System.out.println("O contato " + names.get(i) + " cadastrado na posição " + i + ".");
        System.out.println("Possui os seguintes dados: " + agenda.get(i));
    }

}
