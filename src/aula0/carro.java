package aula0;

public class carro {

    String marca = "jeep";
    String modelo = "compass";
    String cor = "preta";
    int atualVelocidade = 0;

    void acelerar() {
        System.out.println("Acelerando...");
        atualVelocidade = atualVelocidade + 10;
        System.out.println("O carro acelerou! Velocidade atual: " + atualVelocidade + " km/h");
    }

    void freiar() {
        System.out.println("Freando...");
        atualVelocidade = atualVelocidade - 10;
        System.out.println("O carro freou! Velocidade atual: " + atualVelocidade + " km/h");
    }
}