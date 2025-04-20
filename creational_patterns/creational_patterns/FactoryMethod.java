package creational_patterns;

abstract class BookingProcessor {
    public abstract Booking createBooking();
}

class DeskBookingProcessor extends BookingProcessor {
    public Booking createBooking() {
        return new DeskBooking();
    }
}

class DeskBooking extends Booking {
    public DeskBooking() {
        System.out.println("Desk Booking Created via Factory Method");
    }
}
