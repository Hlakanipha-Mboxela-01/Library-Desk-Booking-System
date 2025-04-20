package model;

import java.time.LocalTime;

public class TimeSlot {
    private String timeSlotId;
    private LocalTime startTime;
    private LocalTime endTime;

    public boolean isAvailable() {
        // TODO: Logic to determine availability
        return true; // Placeholder
    }

    // Getters & Setters (optional)
}
