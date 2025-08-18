import java.util.Scanner;

public class ObjetoAviao {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de Aviões que deseja cadastrar: ");
        int qtd = scan.nextInt();
        scan.nextLine();

        Aviao[] aviaos = new Aviao[qtd];

        for(int i = 0; i < aviaos.length; i++){

            aviaos[i] = new Aviao();

            System.out.println("\n--- Cadastro do Avião " + (i+1) + " ---");

            System.out.println("Tipo: ");
            aviaos[i].setTipo(scan.nextLine());

            System.out.println("Cor: ");
            aviaos[i].setCor(scan.nextLine());

            System.out.println("Velocidade: ");
            aviaos[i].setVelocidade(scan.nextInt());
            scan.nextLine();

            System.out.println("Quantidade de Assentos");
            aviaos[i].setQtdeAssento(scan.nextInt());
            scan.nextLine();
        }

        for(int i = 0; i < aviaos.length; i++){
            System.out.println("--- Avião " + (i+1) + " ---\n");
            System.out.println("Tipo - " + aviaos[i].getTipo());
            System.out.println("Cor - " + aviaos[i].getCor());
            System.out.println("Velocidade: " + aviaos[i].getVelocidade() + " Km/h");
            System.out.println("Quantidade de Assentos: " + aviaos[i].getQtdeAssento() + "\n");
        }
    }
}