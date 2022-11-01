public class Moto {
    private String marca;
    private String modelo;
    private Integer marcha;
    private String cor;

    public Moto() { }

    public Moto(String marca, String modelo, Integer marcha, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.marcha = marcha;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getMarcha() {
        return marcha;
    }

    public void setMarcha(Integer marcha) {
        this.marcha = marcha;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void marchaAcima(int marcha) {
        if (maiorMarcha(this.getMarcha() + marcha))
            this.setMarcha(this.getMarcha() + marcha);
        else System.out.println("MARCHA INVALIDA!");
    }

    public void marchaAbaixo(int marcha) {
        if (menorMarcha(this.getMarcha() - marcha))
            this.setMarcha(this.getMarcha() - marcha);
        else System.out.println("MARCHA INVALIDA!");
    }

    private boolean maiorMarcha(int marcha) {
        return marcha < 4;
    }

    private boolean menorMarcha(int marcha) {
        return marcha > 0;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", marcha=" + getMarcha() +
                ", cor='" + getCor() + '\'' +
                '}';
    }

}
