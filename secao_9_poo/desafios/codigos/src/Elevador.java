public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int quantidadePessoas;

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public String inicializa(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        return "Capacidade de pessoas: " + this.getCapacidade() + "\nTotal de andares: "
                + this.getTotalAndares();
    }

    public String entra(int quantidadePessoas) {
        this.quantidadePessoas += quantidadePessoas;
        return "Adicionado com sucesso! total de pessoas eh de " + this.getQuantidadePessoas();
    }

    public String sai(int quantidadePessoas) {
        this.quantidadePessoas -= quantidadePessoas;
        return "Removido com sucesso! total de pessoas eh de " + this.getQuantidadePessoas();
    }

    public String sobe(int andarAtual) {
        this.andarAtual = andarAtual;
        return "Andar atual eh: " + getAndarAtual();
    }

    public String desce(int andarAtual) {
        this.andarAtual = andarAtual;
        return "Andar atual eh: " + getAndarAtual();
    }

}
