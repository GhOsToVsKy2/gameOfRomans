import java.util.Scanner;
public class main {
    public static void main(String[] args){
        String breakWhile = "proceed";
        Scanner scan = new Scanner(System.in);
        map mapa = new map();
        do{
            mapa.przygotowanie();
            System.out.print("Wydaj komende, legacie:");
            String order = scan.nextLine();
            CheckOrder checkOrder = new CheckOrder(order);
            mapa.clearScreen();
            if(checkOrder.correctOrd() == false){
                System.out.println("Wybrales zly rozkaz! Twoi ludzie przez Ciebie moga zginac!");
            }
        }while(breakWhile.equals("proceed"));
        scan.close();
    }
}
