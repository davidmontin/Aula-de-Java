package aula2;

public class Televisao {
    // Atributos privados para garantir o encapsulamento
    private int canal = 1;
    private int volume = 10;
    private boolean ligado = false;

    // Métodos Getters e Setters
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Convenção Java: usar "is" para atributos booleanos
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
