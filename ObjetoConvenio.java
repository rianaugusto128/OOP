import java.util.Scanner;

public class ObjetoConvenio {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        Convenio conve = new Convenio();

        System.out.println("Qual seu nome? ");
        conve.setNome(scan.nextLine());

        System.out.println("Qual seu plano? ");
        conve.setPlano(scan.nextLine());

        System.out.println("Qual a sua tarifa? ");
        conve.setTarifa(scan.nextLine());


        System.out.println("---- INFORMAÇÕES ----");
        System.out.println("Nome: " + conve.getNome());
        System.out.println("Plano: " + conve.getPlano());
        System.out.println("Tarifa: " + conve.getTarifa());



    }
}
