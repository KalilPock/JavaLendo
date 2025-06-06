package Model;

class Substituicao extends EventoPartida {
    private Jogador substituto;

    public Substituicao(String dataHora, int minuto, Jogador substituido, Jogador substituto) {
        super(dataHora, minuto, substituido);
        this.substituto = substituto;
    }

    @Override
    public String getDescricao() {
        return "Substituição aos " + getMinuto() + " minutos: Sai " + getJogador().nome + ", entra " + substituto.nome;
    }
}
