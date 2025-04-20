package model;

public class Desk {
    private String deskId;
    private String location;
    private boolean isAvailable;

    private Room room;

    public void reserve() {
        // TODO: Reserve the desk
        this.isAvailable = false;
    }

    public void release() {
        // TODO: Release the desk
        this.isAvailable = true;
    }

    // Getters & Setters (optional)
}
