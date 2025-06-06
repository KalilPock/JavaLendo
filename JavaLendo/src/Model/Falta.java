package Model;
class Falta extends EventoPartida {
    private String tipoFalta; // Ex: "Leve", "Grave", "Violenta"

    public Falta(String dataHora, int minuto, Jogador jogador, String tipoFalta) {
        super(dataHora, minuto, jogador);
        this.tipoFalta = tipoFalta;
    }

    @Override
    public String getDescricao() {
        return "Falta " + tipoFalta + " cometida por " + getJogador().nome + " aos " + getMinuto() + " minutos.";
    }
}