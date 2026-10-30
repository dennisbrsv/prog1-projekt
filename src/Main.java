import java.util.List;

public class Main {

    public static List<Raum> rooms;

    public static void main(String[] args) {

        for(int i = 0; i < 100; i++) {
            Raum r = new Raum(i,i+3);
            rooms.add(r);
        }

    }

    public List<Raum> getRooms() {
        return rooms;
    }

    public void addRoom(Raum r) {
        rooms.add(r);
    }

    public void removeRoom(Raum r) {
        rooms.remove(r);
    }

}
