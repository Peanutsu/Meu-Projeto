package Projeto_p2;
public class Personagem {
    private String nome;
    private int sanidade;
    public Personagem(String nome, int sanidade){
        this.nome=nome;
        this.sanidade=sanidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getSanidade() {
        return sanidade;
    }
    public void setSanidade(int sanidade) {
        this.sanidade = sanidade;
    }
    public void Dsanidade(int alteracao, Personagem personagem){
        this.sanidade+=alteracao;
    }
}
