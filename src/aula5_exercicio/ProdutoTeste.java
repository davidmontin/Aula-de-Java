package aula5_exercicio;

public class ProdutoTeste {
    public static void main(String[] args){

        Produto p1 = new Produto();

        p1.setNome("Celular");
        p1.setPreço(2500.99);
        p1.setQuantidadeEstoque(8);
        p1.exibirDetalhe();

        Produto p2 = new Produto("tablet", 150.00,20);
        p2.exibirDetalhe();

        System.out.println("\n--- Testando Adicionar Estoque no p1 ---");
        boolean adicionou = p1.adicionarEstoque(5);
        System.out.println("Adicionou 5 unidades? " + adicionou);
        p1.exibirDetalhe();

        System.out.println("\n--- Testando Venda Bem-Sucedida no p2 ---");
        boolean venda1 = p2.realizarVenda(3);
        System.out.println("Vendeu 3 unidades do Mouse? " + venda1);
        p2.exibirDetalhe();

        System.out.println("\n--- Testando Venda Superior ao Estoque no p2 ---");
        boolean venda2 = p2.realizarVenda(10);
        System.out.println("Vendeu 10 unidades do Mouse? " + venda2);
        p2.exibirDetalhe();
    }
}

