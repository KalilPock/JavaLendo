package Model;

public class Goleiro extends Jogador{
    
    protected String defesa;

    public Goleiro(String nome, int idade, int numero, String posicao, String defesa) {
        super(nome, idade, numero, posicao);
        this.defesa = defesa;
    }
    
}
