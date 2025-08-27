package exemplo;

public class Teste {
    public static void main(String[] args) {
        Carro carro1 = new Carro("ACX-245", 987654);
        Animal animal1 = new Animal(1.5f, "RosaChoque");
        Consulta consulta1 = new Consulta("Alfredo");

        System.out.println("Carro placa: " + carro1.getPlaca());
        System.out.println("Animal cor: " + animal1.getCor());
        System.out.println("Consulta paciente: " + consulta1.getNomePaciente());
        System.out.println("Consulta data: " + consulta1.getData());
    }
}