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
        if (quantidadePessoas < getCapacidade()) {
            this.quantidadePessoas += quantidadePessoas;
            return "Adicionado com sucesso! total de pessoas eh de " + this.getQuantidadePessoas();
        }

        return "Nao pode adicionar mais pois ultrapassa a capacidade total";
    }

    public String sai(int quantidadePessoas) {
        if (getQuantidadePessoas() > 0) {
            this.quantidadePessoas -= quantidadePessoas;
            return "Removido com sucesso! total de pessoas eh de " + this.getQuantidadePessoas();
        }

        return "Nao pode ser removido por nao tem ninguem no elevador!";
    }

    public String sobe(int andarAtual) {
        if (andarAtual <= getTotalAndares()) {
            this.andarAtual = andarAtual;
            return "Andar atual eh: " + getAndarAtual();
        }

        return "Nao pode subir mais ultimo andar!";
    }

    public String desce(int andarAtual) {
        if (andarAtual >= 0) {
            this.andarAtual = andarAtual;
            return "Andar atual eh: " + getAndarAtual();
        }

        return "Nao pode descer mais que o primeiro andar!";
    }

}
