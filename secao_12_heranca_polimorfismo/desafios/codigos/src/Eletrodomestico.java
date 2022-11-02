public class Eletrodomestico {
    private Boolean ligado;

    public Eletrodomestico() { }

    public Eletrodomestico(boolean ligado) {
        this.ligado = ligado;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar(boolean ligar) {
        this.setLigado(ligar);
    }

    public void desligar(boolean desligar) {
        this.setLigado(desligar);
    }

    @Override
    public String toString() {
        return "Eletrodomestico{" +
                "ligado=" + getLigado() +
                '}';
    }

}
