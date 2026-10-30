public class Veranstaltung {

    private String name;
    private String date;
    private Raum room;
    private int capacity = 0;
    private Timeslot timeslot;

    public Veranstaltung(String name, String date, Raum room, int capacity, Timeslot timeslot) {
        this.name = name;
        this.date = date;
        this.room = room;
        this.capacity = capacity;
        this.timeslot = timeslot;
    }
}
