package factories;

import repositories.inmemory.InMemoryBookRepository;
import repositories.inmemory.InMemoryUserRepository;
import repositories.inmemory.InMemoryBookingRepository;
import repositories.BookRepository;
import repositories.UserRepository;
import repositories.BookingRepository;

public class RepositoryFactory {

    // Factory method for BookRepository
    public static BookRepository getBookRepository(String storageType) {
        switch (storageType) {
            case "MEMORY":
                return new InMemoryBookRepository();
            // case "DATABASE":
            //     return new DatabaseBookRepository(); // Future Database implementation
            default:
                throw new IllegalArgumentException("Invalid storage type");
        }
    }

    // Factory method for UserRepository
    public static UserRepository getUserRepository(String storageType) {
        switch (storageType) {
            case "MEMORY":
                return new InMemoryUserRepository();
            // case "DATABASE":
            //     return new DatabaseUserRepository(); // Future Database implementation
            default:
                throw new IllegalArgumentException("Invalid storage type");
        }
    }

    // Factory method for BookingRepository
    public static BookingRepository getBookingRepository(String storageType) {
        switch (storageType) {
            case "MEMORY":
                return new InMemoryBookingRepository();
            // case "DATABASE":
            //     return new DatabaseBookingRepository(); // Future Database implementation
            default:
                throw new IllegalArgumentException("Invalid storage type");
        }
    }
}

