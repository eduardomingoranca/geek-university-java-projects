package heranca;

public class Equipamento {
    private String marca;
    private String fabricante;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "marca='" + getMarca() + '\'' +
                ", fabricante='" + getFabricante() + '\'' +
                '}';
    }

}
