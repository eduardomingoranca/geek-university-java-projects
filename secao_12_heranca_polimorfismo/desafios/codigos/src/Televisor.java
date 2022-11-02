public class Televisor {
    private Boolean ligado;
    private Integer canal;
    private Integer volume;
    private Integer numeroCanais;
    private Integer volumeMaximo;

    public Televisor() { }

    public Televisor(Boolean ligado, Integer canal, Integer volume) {
        this.ligado = ligado;
        this.canal = canal;
        this.volume = volume;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public Integer getCanal() {
        return canal;
    }

    public void setCanal(Integer canal) {
        this.canal = canal;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getNumeroCanais() {
        return numeroCanais;
    }

    public void setNumeroCanais(Integer numeroCanais) {
        this.numeroCanais = numeroCanais;
    }

    public Integer getVolumeMaximo() {
        return volumeMaximo;
    }

    public void setVolumeMaximo(Integer volumeMaximo) {
        this.volumeMaximo = volumeMaximo;
    }

    public void ligar(boolean ligar) {
        this.setLigado(ligar);
    }

    public void desligar(boolean desligar) {
        this.setLigado(desligar);
    }

    public void canalAcima(int canal) {
        int acima = this.canal + canal;
        if (acima <= this.getNumeroCanais())
            this.setCanal(acima);
         else this.setCanal(1);
    }

    public void canalAbaixo(int canal) {
        int abaixo = this.canal - canal;
        if (abaixo >= 1) this.setCanal(abaixo);
        else this.setCanal(this.getNumeroCanais());
    }

    public void volumeAcima(int volume) {
        int acima = this.volume + volume;
        if (acima <= this.getVolumeMaximo())
            this.setVolume(acima);
        else System.out.println("VOLUME INVALIDO!");
    }

    public void volumeAbaixo(int volume) {
        int abaixo = this.volume - volume;
        if (abaixo >= 0) this.setVolume(abaixo);
        else System.out.println("VOLUME INVALIDO!");
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "ligado=" + getLigado() +
                ", canal=" + getCanal() +
                ", volume=" + getVolume() +
                ", numeroCanais=" + getNumeroCanais() +
                ", volumeMaximo=" + getVolumeMaximo() +
                '}';
    }

}
