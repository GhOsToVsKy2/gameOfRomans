import java.util.HashMap;
public class jednostki {
    int id;
    int sila;
    int liczebnosc;
    int wyszkolenie;
    int morale;
    int wyposazenie;
    String type;
    int x;
    int y;
    public HashMap<Integer, jednostki> legion = new HashMap<>();
    public jednostki(int id, String type ,int x, int y){
        this.id = id;
        this.x = x;
        this.y = y;
        this.type = type;
    }
    public void jednostka(){
        if(type.equals("piechota")){
            int sila = 50;
            int liczebnosc = 100;
            int wyszkolenie = 1;
            int morale = 100;
            int wyposazenie = 3;
        }
        if(type.equals("piechota ciezka")){
            int sila = 75;
            int liczebnosc = 100;
            int wyszkolenie = 1;
            int morale = 75;
            int wyposazenie = 4;
        }
        if(type.equals("konnica")){
            int sila = 200;
            int liczebnosc = 300;
            int wyszkolenie = 1;
            int morale = 25;
            int wyposazenie = 5;
        }
        if(type.equals("lucznicy")){
            int sila = 25;
            int liczebnosc = 100;
            int wyszkolenie = 1;
            int morale = 40;
            int wyposazenie = 3;
        }
        this.sila = sila;
        this.liczebnosc = liczebnosc;
        this.wyszkolenie = wyszkolenie;
        this.morale = morale;
        this.wyposazenie = wyposazenie;
    }
}
