import static java.lang.Math.pow;

public class Quadrado {
    private Double lado;

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Double calcularArea() {
        return pow(getLado(), 2.0);
    }

    public Double calcularPerimetro() {
        return 4.0 * getLado();
    }

    public String imprimirQuadrado() {
        return "lado: " + this.getLado() + "\n" +
                "area: " + this.calcularArea() + "\n" +
                "perimetro: " + this.calcularPerimetro();
    }

}
