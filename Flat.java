package dmd.section_1;

public class Flat {
    int number;
    Room[] rooms;

    Flat(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public void print() {
        System.out.println("Flat: " + number + ", rooms: " + rooms.length);
    }
}
