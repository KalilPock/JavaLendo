package Model;

public class Jogador extends Pessoa{
    protected int numero;
    protected String posicao;

    public Jogador(String nome, int idade, int numero, String posicao) {
        super(nome, idade);
        this.numero = numero;
        this.posicao = posicao;
    }

    @Override
    public void exibirInfo(){
        System.out.println("O jogador: " + nome + "camisa: " + numero + "posicao: " + posicao);
    } 
}