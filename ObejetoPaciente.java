import java.util.Scanner;

public class ObejetoPaciente {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        Paciente paciente1 = new Paciente();

        System.out.println("Informe os dados do paciente: ");

        System.out.println("Nome: ");
        paciente1.setNome(scan.nextLine());

        System.out.println("Endereço: ");
        paciente1.setEndereco(scan.nextLine());

        System.out.println("Cpf: ");
        paciente1.setCpf(scan.nextInt());
        scan.nextLine();

        System.out.println("Sexo (M ou F): ");
        paciente1.setSexo(scan.next().charAt(0));
        scan.nextLine();

        System.out.println("Nível de Escolaridade: ");
        paciente1.setNivelDeEscolaridade(scan.nextLine());

        System.out.println("Email: ");
        paciente1.setEmail(scan.nextLine());
        scan.nextLine();

        System.out.println("Data de Nascimento: ");
        paciente1.setDataDeNascimento(scan.nextInt());

        System.out.println("Telefone: ");
        paciente1.setTelefone(scan.nextInt());


        System.out.println("--- Informações ---");

        System.out.println("Nome: " + paciente1.getNome());
        System.out.println("Endereço: " + paciente1.getEndereco());
        System.out.println("Cpf: " + paciente1.getCpf());
        System.out.println("Sexo: " + paciente1.getSexo());
        System.out.println("Nivel de escolaridade: " + paciente1.getNivelDeEscolaridade());
        System.out.println("Email: " + paciente1.getEmail());
        System.out.println("Data de nascimento: " + paciente1.getDataDeNascimento());
        System.out.println("Telefone: " + paciente1.getTelefone());


    }
}
