package Model;

public class Goleiro extends Jogador{
    
    private String defesa;

    public Goleiro(String nome, int idade, int numero, String posicao, String defesa) {
        super(nome, idade, numero, posicao);
        this.defesa = defesa;
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("O goleiro: " + getNome());
    }
}
