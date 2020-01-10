import java.io.IOException;
public class map {
    char[][] mapa = new char[50][100];
    int id = 0;
    public void jednostki(){
    	
        for(int i = 0; i < mapa.length; i++){
            for(int j = 0; j < mapa[i].length; j++){
                mapa[i][j] = 0;
            }
        }
        for(int i = 0; i < 10; i++){
            mapa[48][i+45] = 1;
        }
        for(int i = 0; i < mapa.length; i++) {
        	//System.out.println(i);
            for (int j = 0; j < mapa[i].length; j++) {
            	//System.out.print(j+" ");
               /* if(i == 0){
                    mapa[i][j] = '|';
                } */
                if(i == 0 || i == 49 || j == 0 || j == 99){
                    mapa[i][j] = '_';
                }
                if(i > 0 &&( j == 0 || j == 99)){
                    mapa[i][j] = '|';
                }
                if(mapa[i][j] == 1){
                    jednostki jednostka = new jednostki(id, );
                    id++;
                }
                else if(mapa[i][j] == 2){
                    mapa[i][j] = 'W';
                }
                else if(mapa[i][j] == 0){
                    mapa[i][j] = ' ';
                }
                System.out.print(mapa[i][j]);
            }
            System.out.println();
        }
    }
    public void przygotowanie(){

        System.out.println("Faza przygotowywania");
        System.out.println("Na mapie masz rozmieszczenie swoich jednostek (P)");
        System.out.println("Wydaj rozkazy swoim jednostkom");
        wyswietlMape();
    }
    public void wyswietlMape(){
        jednostki();
    }
    public final static void  clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
}
