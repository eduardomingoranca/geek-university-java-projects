import static java.lang.Math.pow;

public class Quadrado {
    private Double lado;

    public Quadrado() { }

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    private Double calcularArea() {
        return pow(getLado(), 2.0);
    }

    private Double calcularPerimetro() {
        return 4.0 * getLado();
    }

    @Override
    public String toString() {
        return "lado: " + this.getLado() + "\n" +
                "area: " + this.calcularArea() + "\n" +
                "perimetro: " + this.calcularPerimetro();
    }

}
