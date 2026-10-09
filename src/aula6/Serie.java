package aula6;

public class Serie extends Conteudo {

    private int totalTemporadas;


    public Serie(String titulo, String genero, int duracaoMinutos, int totalTemporadas) {
        super(titulo, genero, duracaoMinutos);
        this.totalTemporadas = totalTemporadas;
    }

    public int getTotalTemporadas() {
        return totalTemporadas;
    }

    public void setTotalTemporadas(int totalTemporadas) {
        if (totalTemporadas > 0) {
            this.totalTemporadas = totalTemporadas;
        } else {
            System.out.println("ERRRO, não foi possivel definir a temporada");
        }
    }

    public void exibirDetalhes(){
        System.out.println("==== Exibir detalhes da serie ====");

        System.out.println("Título: " + this.getTitulo());
        System.out.println("Gênero: " + this.getGenero());
        System.out.println("Duração: " + this.getDuracaoMinutos());
        System.out.println("Temporadas: " + this.getTotalTemporadas());

    }
}
