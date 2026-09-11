package aula0;

public class CarroTeste {
    public static void main(String[] args) {

        // criando o objeto carro1 do tipo Carro
        CarroTeste carro1 = new CarroTeste();

        // atribuindo valores para o objeto
        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.cor = "Azul";
        carro1.atualVelocidade = 0;

        // imprimindo os dados do objeto
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Cor: " + carro1.cor);
        System.out.println("Velocidade atual: " + carro1.atualVelocidade);

        System.out.println("\n----------------------------------------------\n");

        // criando o objeto carro2
        Carro carro2 = new Carro();

        // atribuindo valores para o objeto
        carro2.marca = "Jeep";
        carro2.modelo = "Compass";
        carro2.cor = "Preta";
        carro2.atualVelocidade = 0;

        // imprimindo os dados do objeto
        System.out.println("Marca: " + carro2.marca);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Cor: " + carro2.cor);
        System.out.println("Velocidade atual: " + carro2.atualVelocidade);
    }
}



