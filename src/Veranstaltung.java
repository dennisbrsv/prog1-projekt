public class Veranstaltung {

    private String name;
    private String date;
    private Raum room;
    private int capacity = Integer.MAX_VALUE;

    public Veranstaltung(String name, String date, Raum room, int capacity) {
        this.name = name;
        this.date = date;
        this.room = room;
        this.capacity = capacity;
    }

    public Veranstaltung(String name, String date, Raum room) {
        this.name = name;
        this.date = date;
        this.room = room;
    }

}
