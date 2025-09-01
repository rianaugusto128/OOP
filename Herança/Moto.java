package Herança;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, String cor, int cilindrada) {
        super(marca, modelo, ano, cor);
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.print("Cilindrada: " + cilindrada + "cc");
    }
}
