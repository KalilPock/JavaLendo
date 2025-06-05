package Model;

public class Zagueiro extends Jogador{
    
    protected String desarme;

    public Zagueiro(String nome, int idade, int numero, String posicao, String desarme) {
        super(nome, idade, numero, posicao);
        this.desarme = desarme;
    }   

    @Override
    public void exibirInfo(){
        System.out.println("O zagueiro: " + nome + "camisa: " + numero + "posicao: " + posicao);
    }
}
