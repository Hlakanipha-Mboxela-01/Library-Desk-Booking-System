package model;

import java.util.Date;

public class Booking {
    private String bookingId;
    private Date bookingDate;
    private String status;

    private Desk desk;
    private TimeSlot timeSlot;

    public void confirmBooking() {
        // TODO: Logic to confirm the booking
        this.status = "Confirmed";
    }

    public void cancelBooking() {
        // TODO: Logic to cancel the booking
        this.status = "Cancelled";
    }

    // Getters & Setters (optional)
}
