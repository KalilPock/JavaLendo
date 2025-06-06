package Model;

class Impedimento extends EventoPartida {

    public Impedimento(String dataHora, int minuto, Jogador jogador) {
        super(dataHora, minuto, jogador);
    }

    @Override
    public String getDescricao() {
        return getJogador().nome + " ficou impedido aos " + getMinuto() + " minutos.";
    }
}