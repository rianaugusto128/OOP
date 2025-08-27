package exemplo;

import java.util.Scanner;

public class ConstrucaoPessoa {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Coloque 1 nome de jogador: ");
        String nomeJogoador  = scan.nextLine();

        System.out.println("Coloque a idade do jogador: ");
        int idadeJogador = scan.nextInt();
        scan.nextLine();

        Pessoa jogador2 = new Pessoa(nomeJogoador, idadeJogador);

        System.out.println(jogador2.getNome());
        System.out.println(jogador2.getIdade());
    }
}