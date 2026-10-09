package aula6;

public class TesteConteudo {
    public static void main(String[] args){

        //1, instanciando e testando um filme
        Filme meuFilme = new Filme( "DUFF", "comédia",  170, true);
        meuFilme.exibirDetalhes();
        meuFilme.darPlay();

        System.out.println("\n========================\n");

        //2, instanciar e testar uma serie
        Serie minhaSerie = new Serie("Friends", "drama", 200, 5);
        minhaSerie.exibirDetalhes();
        minhaSerie.darPlay();


    }
}
