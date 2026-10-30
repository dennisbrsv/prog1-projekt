import java.util.List;

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

    public Raum getRoomByNumber(int room) throws Exception {
        for (Raum r : rooms) {
            if (r.getNumber() == room) {
                return r;
            }
        }
        throw new Exception("Nein");
    }

    public boolean checkRoomAvailability(int room,Timeslot t) {

        for(Veranstaltung v : events) {
            if(v.getTimeslot().equals(t) && v.getRoom().getNumber() == room) {
                return false;
            }
        }
        return true;
    }

    public void bookRoom(int room, Timeslot t, int capacity, String name, String date) throws Exception {

        if (!checkRoomAvailability(room, t)) {
            throw new IllegalAccessException("Der Raum ist an Timeslot " + t + " schon besetzt.");
        }

        Raum roomObject;

        try {
            roomObject = getRoomByNumber(room);
        }
        catch (Exception e) {
            throw new Exception("Nein");
        }

        Veranstaltung event = new Veranstaltung(name, date, roomObject, capacity, t);
        events.add(event);

    }

}
