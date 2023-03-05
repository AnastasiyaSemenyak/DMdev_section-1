package dmd.section_1;

public class Room {
    boolean isWalking;

    Room(boolean isWalking) {
        this.isWalking = isWalking;
    }

    public void print() {
        System.out.println("Room isWalking: " + isWalking);
    }
}
