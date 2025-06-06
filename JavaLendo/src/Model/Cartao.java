package Model;
class Cartao extends EventoPartida {
    private String tipoCartao; // Ex: "Amarelo" ou "Vermelho"

    public Cartao(String dataHora, int minuto, Jogador jogador, String tipoCartao) {
        super(dataHora, minuto, jogador);
        this.tipoCartao = tipoCartao;
    }

    @Override
    public String getDescricao() {
        return "Cartão " + tipoCartao + " para " + getJogador().nome + " aos " + getMinuto() + " minutos.";
    }
}