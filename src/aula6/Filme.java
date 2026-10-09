package aula6;

public class Filme extends Conteudo {

    private boolean indicacaoOscar;

    public Filme(String titulo, String genero, int duracaoMinutos, boolean temOscar) {
        super(titulo, genero, duracaoMinutos);
        this.indicacaoOscar = indicacaoOscar;
    }

    public boolean isIndicacaoOscarOscar() {
        return indicacaoOscar;
    }

    public void setIndicacaoOscar(boolean indicacaoOscar) {
        this.indicacaoOscar = indicacaoOscar;

    }

    public void exibirDetalhes(){
        System.out.println("==== Exibir detalhes do filme ====");

        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Duraçao: " + this.getDuracaoMinutos());

        if (this.indicacaoOscar){
            System.out.println("Filme indicado para o OSCAR!r");
        }else{
            System.out.println("Filme nao foi indicado ao Oscar");
        }
    }
}
