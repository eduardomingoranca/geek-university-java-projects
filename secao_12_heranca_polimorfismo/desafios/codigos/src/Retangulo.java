public class Retangulo {
    private Double comprimento;
    private Double largura;

    public Retangulo() { }

    public Retangulo(Double comprimento, Double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    private Double calcularArea() {
        return this.getComprimento() * this.getLargura();
    }

    private Double calcularPerimetro() {
        return (2.0 * this.getComprimento()) + (2.0 + this.getLargura());
    }

    @Override
    public String toString() {
        return " comprimento: " + this.getComprimento() +
                "\n largura: " + this.getLargura() +
                "\n area: " + this.calcularArea() +
                "\n perimetro: " + this.calcularPerimetro();
    }
}
