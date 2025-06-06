package Model;

class Gol extends EventoPartida {
    private boolean dePenalti;

    public Gol(String datahora, int minuto, Jogador jogador, boolean dePenalti) {
        super(datahora, minuto, jogador);
        this.dePenalti = dePenalti;
    }

    @Override
    public String getDescricao() {
        return "Gol de " + getJogador().getNome() + (dePenalti ? " (Pênalti)" : "") + " aos " + getMinuto() + " minutos.";
    }
}