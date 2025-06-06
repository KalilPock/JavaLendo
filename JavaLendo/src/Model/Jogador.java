package Model;

public class Jogador extends Pessoa{
    private int numero;
    private String posicao;

    public Jogador(String nome, int idade, int numero, String posicao) {
        super(nome, idade);
        this.numero = numero;
        this.posicao = posicao;
    }

    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    public String getPosicao() {
        return posicao;
    }


    public void setPosicao(String posicao) {
        this.posicao = posicao;
    } 

    // public void tipoJogador(){
    //     boolean visaoDeJogo;
    //     String estiloTatica;
    //     String desarme;
    //     int gols;
    //     String defesa;
    // }
    
    @Override
    public void exibirInfo(){
        System.out.println("O jogador: " + getNome() + "camisa: " + getNumero() + "posicao: " + getPosicao());
    }
}