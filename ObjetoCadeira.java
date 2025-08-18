import java.util.Scanner;

public class ObjetoCadeira {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        Cadeira cadeira1 = new Cadeira();
        Cadeira cadeira2 = new Cadeira();
        Cadeira cadeira3 = new Cadeira();

        Cadeira[] cadeiras = {cadeira1, cadeira2, cadeira3};

        for(int i = 0; i < cadeiras.length; i++ ) {
            System.out.println("--- Dados Cadeira "+ (i+1) + "---\n");

            System.out.println("Modelo: ");
            cadeiras[i].setModelo(scan.nextLine());

            System.out.println("Cor: ");
            cadeiras[i].setCor(scan.nextLine());

            System.out.println("Material: ");
            cadeiras[i].setMaterial(scan.nextLine());

            System.out.println("Peso: ");
            cadeiras[i].setPeso(scan.nextLine());

            System.out.println("Quantidade de rodas: ");
            cadeiras[i].setQntdeDeRodas(scan.nextInt());
            scan.nextLine();
        }

        for(int i = 0; i < cadeiras.length; i++){

            System.out.println("--- Objetos "+ (i+1) +" ---\n");
            System.out.println("Modelo: " + cadeiras[i].getModelo());
            System.out.println("Cor: " + cadeiras[i].getCor());
            System.out.println("Material: " + cadeiras[i].getMaterial());
            System.out.println("Peso: " + cadeiras[i].getPeso());
            System.out.println("Quantidade de rodas: " + cadeiras[i].getQntdeDeRodas() + "\n");

        }
    }
}
