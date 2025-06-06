package Model;

public class Atacante extends Jogador{
    
    private int gols;

    public Atacante(String nome, int idade, int numero, String posicao) {
        super(nome, idade, numero, posicao);
    }

    @Override
    public void exibirInfo(){
        System.out.println("O atacante: " + getNome() + "camisa: " + getNumero() + "posicao: " + getPosicao());
    }
}
