package aula5_exercicio;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto() {
        this.nome = "Sem nome";
        this.preco = 0.0;
        this.quantidadeEstoque = 0;
    }


    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preco;
    }

    public void setPreço(double preço) {
        this.preco = preço;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void exibirDetalhe() {
        System.out.println("\n----Detalhe do produto----\n");
        System.out.println("Nome: " + this.nome);
        System.out.println("preço: " + this.preco);
        System.out.println("Quantidade no Estoque: " + this.quantidadeEstoque);
    }

    public boolean adicionarEstoque(int qtd) {
        if (qtd > 0) {
            this.quantidadeEstoque += qtd;
            return true;
        } else {
            return false;
        }
    }

    public boolean realizarVenda(int qtd){
        if (qtd > 0 && qtd <- this.quantidadeEstoque) {
            return true;
        }else{
            return false;
        }
    }
}









