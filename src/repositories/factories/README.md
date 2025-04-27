# Library Desk Booking System

## Abstraction Mechanism: Factory Pattern

### Why the Factory Pattern?
For the repository layer, we wanted to ensure that our system is decoupled from the underlying storage mechanism (in-memory vs. database). To achieve this, we chose to implement the **Factory Pattern**. The Factory Pattern allows us to create different repository implementations based on the storage type chosen, without changing the core logic of our system.

### How It Works:
- The `RepositoryFactory` class is responsible for returning the appropriate repository implementation based on the provided storage type (e.g., `MEMORY`).
- In this version, we have implemented an in-memory storage solution with repositories like `InMemoryBookRepository`, `InMemoryUserRepository`, and `InMemoryBookingRepository`.
- In the future, we could add additional cases in the factory for other storage solutions (such as databases) by creating corresponding repository implementations (e.g., `DatabaseBookRepository`).

### Benefits of Using the Factory Pattern:
- **Flexibility**: You can easily switch between different storage types without modifying the rest of the application.
- **Separation of Concerns**: The repository layer is abstracted, ensuring that business logic doesn’t depend on specific storage details.
- **Scalability**: The system can easily scale to use other storage solutions in the future (like a database) by simply adding new implementations in the factory class.
