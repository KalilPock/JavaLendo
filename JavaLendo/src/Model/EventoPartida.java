package Model;


abstract class EventoPartida {
    private String dataHora;
    private int minuto;
    private Jogador jogador;

    public EventoPartida(String dataHora, int minuto, Jogador jogador) {
        this.dataHora = dataHora;
        this.minuto = minuto;
        this.jogador = jogador;
    }

    public dataHora getdataHora() {
        return getdataHora();
    }

    public int getMinuto() {
        return minuto;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public abstract String getDescricao();
}
