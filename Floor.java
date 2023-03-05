package dmd.section_1;

public class Floor {
    int number;
    Flat[] flats;

    Floor(int number, Flat[] flats) {
        this.number = number;
        this.flats = flats;
    }

    public void print() {
        System.out.println("Floor: " + number + ", flats: " + flats.length);
    }
}
