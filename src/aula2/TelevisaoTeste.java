public static void main(String[] args) {
    System.out.println("---Minha televisão---");

    Televisao tv = new Televisao();

    System.out.println("Canal: " + tv.getCanal());
    System.out.println("Volume: " + tv.getVolume());
    System.out.println("Ligado: " + tv.getLigado());

    // Alterando os dados do objeto tv (forma direta)
    //tv.canal = 30;
    tv.setCanal(50);
    //tv.volume = 1000;
    tv.setVolume(100);
    //tv.ligado = true;
    tv.setLigado(true);

    System.out.println("\n------------------------------------\n");

    System.out.println("Canal: " + tv.getCanal());
    System.out.println("Volume: " + tv.getVolume());
    System.out.println("Ligado: " + tv.getLigado());
}
