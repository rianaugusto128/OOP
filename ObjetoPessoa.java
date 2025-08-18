
public class ObjetoPessoa {

    public static void main (String [] args){

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.setNome("Tom Cruiser");
        pessoa1.setIdade(60);
        pessoa1.setEndereco("California, USA");
        pessoa1.setProfissao("Ator");

        pessoa2.setNome("Messi");
        pessoa2.setIdade(35);
        pessoa2.setEndereco("Miami, USA");
        pessoa2.setProfissao("Jogador de Futebol");

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
