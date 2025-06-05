package Model;

public class Atacante extends Jogador{
    
    protected int gols;

    public Atacante(String nome, int idade, int numero, String posicao) {
        super(nome, idade, numero, posicao);
    }

    @Override
    public void exibirInfo(){
        System.out.println("O atacante: " + nome+ "camisa: " + numero + "posicao: " + posicao);
    }
}
