package repositories.inmemory;

import entities.Booking;
import repositories.BookingRepository;

import java.util.*;

public class InMemoryBookingRepository implements BookingRepository {

    private Map<String, Booking> storage = new HashMap<>();

    @Override
    public void save(Booking booking) {
        storage.put(booking.getId(), booking); // Save or Update
    }

    @Override
    public Optional<Booking> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Booking> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
    }
}
