package model;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String roomId;
    private String name;
    private int floorNumber;

    private List<Desk> desks = new ArrayList<>();

    public void addDesk(Desk desk) {
        desks.add(desk);
    }

    public void removeDesk(Desk desk) {
        desks.remove(desk);
    }

    // Getters & Setters (optional)
}
