public class Microondas {
    private Boolean ligado;
    private Boolean portaFechada;

    public Microondas() {
    }

    public Microondas(Boolean ligado) {
        this.ligado = ligado;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public Boolean getPortaFechada() {
        return portaFechada;
    }

    public void setPortaFechada(Boolean portaFechada) {
        this.portaFechada = portaFechada;
    }

    public void ligar() {
        this.setLigado(true);
    }

    public void desligar() {
        this.setLigado(false);
    }

    public void fecharPorta() {
        this.setPortaFechada(false);
    }

    public void abrirPorta() {
        this.setPortaFechada(true);
    }

    @Override
    public String toString() {
        return "Microondas{" +
                "ligado=" + getLigado() +
                '}';
    }
}
