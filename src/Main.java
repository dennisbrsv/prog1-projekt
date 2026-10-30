import java.util.List;

public class Main {

    public static List<Raum> Rooms;

    public static void main(String[] args) {

        for(int i = 0; i < 100; i++) {
            Raum r = new Raum(i,i+3);
            Rooms.add(r);
        }

    }
}
