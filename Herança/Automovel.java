package Herança;

public class Automovel extends Veiculo {
    private int numeroPortas;
    private String motor;

    public Automovel(String marca, String modelo, int ano, String cor, int numeroPortas, String motor) {
        super(marca, modelo, ano, cor);
        this.numeroPortas = numeroPortas;
        this.motor = motor;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de portas: " + numeroPortas);
        System.out.println("Motor: " + motor);
    }
}