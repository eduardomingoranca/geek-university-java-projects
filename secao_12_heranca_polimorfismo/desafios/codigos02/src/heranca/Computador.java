package heranca;

public class Computador extends Equipamento {
    private Integer capacidadeMemoria;
    private Integer capacidadeCPU;

    public Integer getCapacidadeMemoria() {
        return capacidadeMemoria;
    }

    public void setCapacidadeMemoria(Integer capacidadeMemoria) {
        this.capacidadeMemoria = capacidadeMemoria;
    }

    public Integer getCapacidadeCPU() {
        return capacidadeCPU;
    }

    public void setCapacidadeCPU(Integer capacidadeCPU) {
        this.capacidadeCPU = capacidadeCPU;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "capacidadeMemoria=" + getCapacidadeMemoria() +
                ", capacidadeCPU=" + getCapacidadeCPU() +
                ", marca=" + getMarca() +
                ", fabricante=" + getFabricante() + '}';
    }

}
