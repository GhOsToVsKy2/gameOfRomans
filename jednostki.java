import java.util.HashMap;
abstract public class jednostki {
    int id;
    int sila;
    int liczebnosc;
    int wyszkolenie;
    int morale;
    int wyposazenie;
    int strona;
    int x;
    int y;
    public HashMap<Integer, jednostki> legion = new HashMap<>();
    public jednostki(){

    }
}
