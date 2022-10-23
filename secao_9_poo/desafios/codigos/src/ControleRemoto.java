public class ControleRemoto {
    private final Televisao televisao;

    public ControleRemoto(Televisao televisao) {
        this.televisao = televisao;
    }

    public void controleVolume(int volume) {
        if (volume > 0) {
            int aumentar = televisao.getVolume() + volume;
            televisao.setVolume(aumentar);
        } else if (volume < 0) {
            int diminuir = televisao.getVolume() - (volume * -1);
            televisao.setVolume(diminuir);
        }
    }

    public void controleCanal(int canal) {
        if (canal > 0) {
            int aumentar = televisao.getCanal() + canal;
            televisao.setVolume(aumentar);
        } else if (canal < 0) {
            int diminuir = televisao.getCanal() - (canal * -1);
            televisao.setCanal(diminuir);
        }
    }

    public String imprimirTelevisao() {
        return "Volume: " + televisao.getVolume() + "\nCanal: " + televisao.getCanal();
    }

}
