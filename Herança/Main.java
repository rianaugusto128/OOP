package Herança;

public class Main {
    public static void main(String[] args) {
        Automovel carro = new Automovel("Mitsubishi", "Lancer Evo X", 2022, "Prata", 4, "GEMA 4B11T 2.0L (1998 cc) turboalimentado" );
        Moto moto = new Moto("Yamaha", "MT-07", 2021, "Azul", 689);
        System.out.println("Infromações do Automóvel: ");
        carro.exibirInformacoes();

        System.out.println("\nInformações da Moto: ");
        moto.exibirInformacoes();
    }
}
