import java.util.List;
import java.util.concurrent.TimeoutException;

public class Main {

    public List<Raum> rooms;
    public List<Veranstaltung> events;

    public void main(String[] args) {

        for(int i = 0; i < 100; i++) {
            Raum r = new Raum(i,i+3);
            addRoom(r);
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

    public void checkRoomAtTimeslot(int room,Timeslot t) {

        for(Veranstaltung v : events) {
            if(v.getTimeslot().equals(t) && v.getRoom().getNumber() == room) {
                System.out.println("Room " + room + " is already occupied at timeslot " + t.toString());
                return;
            }
        }
    }

}
