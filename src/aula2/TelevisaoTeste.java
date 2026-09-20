package aula2;

class Main{
    public static void main(String[] args) {
        System.out.println("--- Minha televisão ---");

        Televisao tv = new Televisao();

        // Exibindo os valores iniciais
        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume());
        System.out.println("Ligado: " + tv.isLigado());

        // Alterando os dados usando os métodos modificadores (setters)
        tv.setCanal(50);
        tv.setVolume(100);
        tv.setLigado(true);

        System.out.println("\n-------------------------\n");

        // Exibindo os novos valores alterados
        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume());
        System.out.println("Ligado: " + tv.isLigado());
    }
}
