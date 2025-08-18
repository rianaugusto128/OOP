import java.util.Scanner;
public class ObjetoPessoa2 {
    public static void main (String [] args){

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Scanner scan = new Scanner(System.in);

        Pessoa[] pessoas = {pessoa1, pessoa2};

        for (int i = 0; i < pessoas.length; i++){
            System.out.println("Informe os dados da pessoa " + (i+1) + " :");

            System.out.println("Nome: ");
            pessoas[i].setNome(scan.nextLine());

            System.out.println("Idade");
            pessoas[i].setIdade(scan.nextInt());
            scan.nextLine();

            System.out.println("Endereco: ");
            pessoas[i].setEndereco(scan.nextLine());

            System.out.println("Profissão: ");
            pessoas[i].setProfissao(scan.nextLine());

        }

        System.out.println("----- OBEJETO 1 -----");
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getEndereco());
        System.out.println(pessoa1.getProfissao());


        System.out.println("----- OBEJETO 2 -----");
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
        System.out.println(pessoa2.getEndereco());
        System.out.println(pessoa2.getProfissao());
    }
}
