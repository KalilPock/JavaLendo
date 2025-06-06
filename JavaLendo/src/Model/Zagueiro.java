package Model;

public class Zagueiro extends Jogador{
    
    private String desarme;

    public Zagueiro(String nome, int idade, int numero, String posicao, String desarme) {
        super(nome, idade, numero, posicao);
        this.desarme = desarme;
    }   

    @Override
    public void exibirInfo(){
        System.out.println("O zagueiro: " + getNome() + "camisa: " + getNumero() + "posicao: " + getPosicao());
    }
}
