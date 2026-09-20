package aula3;

public class Personagem {

    private String nome;
    private int nivel;
    private int vida;


    public Personagem(){
        this.nome = "Novato";
        this.nivel = 1;
        this.vida = 100;
    }


    public Personagem(String nome, int nivel){
        this.nome = nome;
        this.nivel = nivel;
        this.vida = nivel * 50;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("vida: " + vida);
    }
}
