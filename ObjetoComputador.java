import java.util.Scanner;

public class ObjetoComputador {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        Computador computer1 = new Computador();
        Computador computer2 = new Computador();
        Computador computer3 = new Computador();

        Computador[] cpus = {computer1, computer2, computer3};

        for(int i = 0; i < cpus.length; i++ ){
            System.out.println("--- Informação "+ (i+1)+" ---\n");

            System.out.println("Gabinete: ");
            cpus[i].setGabinete(scan.nextLine());

            System.out.println("Teclado: ");
            cpus[i].setTeclado(scan.nextLine());

            System.out.println("Mouse: ");
            cpus[i].setMouse(scan.nextLine());

            System.out.println("Monitor: ");
            cpus[i].setMonitor(scan.nextLine());

            System.out.println("Placa de vídeo: ");
            cpus[i].setPlacaDeVideo(scan.nextLine());

            System.out.println("Placa mãe: ");
            cpus[i].setPlacaMae(scan.nextLine());

            System.out.println("Processador: ");
            cpus[i].setProcessador(scan.nextLine());

            System.out.println("Memoria: ");
            cpus[i].setMemoria(scan.nextInt());
            scan.nextLine();

            System.out.println("Armazenamento: ");
            cpus[i].setArmazenamento(scan.nextInt());
            scan.nextLine();

            System.out.println("Fonte: ");
            cpus[i].setFonte(scan.nextLine());
        }

        for (int i = 0; i < cpus.length; i++){
            System.out.println("--- Informações "+(i+1)+" ---\n");

            System.out.println("Gabinte: " + cpus[i].getGabinete());
            System.out.println("Teclado: " + cpus[i].getTeclado());
            System.out.println("Mouse: " + cpus[i].getMouse());
            System.out.println("Monitor: " + cpus[i].getMonitor());
            System.out.println("Placa de vídeo: " + cpus[i].getPlacaDeVideo());
            System.out.println("Placa mãe: " + cpus[i].getPlacaMae());
            System.out.println("Processador: " + cpus[i].getProcessador());
            System.out.println("Memoria: " + cpus[i].getMemoria());
            System.out.println("Armazenamento: " + cpus[i].getArmazenamento());
            System.out.println("Fonte: " + cpus[i].getFonte() + "\n");

        }



    }
}
