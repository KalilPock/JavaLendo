package Model;

public class MeioCampista extends Jogador{
    
    protected boolean visaoDeJogo;

    public MeioCampista(String nome, int idade, int numero, String posicao, boolean visaoDeJogo) {
        super(nome, idade, numero, posicao);
        this.visaoDeJogo = visaoDeJogo;
    }

    @Override
    public void exibirInfo(){
        System.out.println("O meio campista: " + nome+ "camisa: " + numero + "posicao: " + posicao);
    }
}
