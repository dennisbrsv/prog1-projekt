public class Veranstaltung {

    private String name;
    private String date;
    private String room;
    private int capacity = Integer.MAX_VALUE;

    public Veranstaltung(String name, String date, String room, int capacity) {
        this.name = name;
        this.date = date;
        this.room = room;
        this.capacity = capacity;
    }

    public Veranstaltung(String name, String date, String room) {
        this.name = name;
        this.date = date;
        this.room = room;
    }

}
