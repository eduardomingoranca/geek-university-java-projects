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

    public void ligar() {
        this.setLigado(true);
    }

    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public String toString() {
        return "Eletrodomestico{" +
                "ligado=" + getLigado() +
                '}';
    }

}
