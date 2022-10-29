import static java.lang.Math.PI;

public class Circulo {
    private Double raio;

    public Circulo() { }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    private Double calcularArea() {
        return PI * Math.pow(getRaio(), 2.0);
    }

    private Double calcularPerimetro() {
        return 2.0 * PI * getRaio();
    }

    @Override
    public String toString() {
        return " raio: " + this.getRaio() +
                "\n area: " + this.calcularArea() +
                "\n perimetro: " + this.calcularPerimetro();
    }

}
