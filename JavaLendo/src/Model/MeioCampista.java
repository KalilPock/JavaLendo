package Model;

public class MeioCampista extends Jogador{
    
    private boolean visaoDeJogo;

    public MeioCampista(String nome, int idade, int numero, String posicao, boolean visaoDeJogo) {
        super(nome, idade, numero, posicao);
        this.visaoDeJogo = visaoDeJogo;
    }

    @Override
    public void exibirInfo(){
        System.out.println("O meio campista: " + getNome() + "camisa: " + getNumero() + "posicao: " + getPosicao());
    }
}
