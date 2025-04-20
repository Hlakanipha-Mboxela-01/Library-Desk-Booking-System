##  Creational Design Patterns Justification

This project includes six creational design patterns implemented in Java under the `/creational_patterns` directory. Each pattern was applied to a specific part of the Library Desk Booking System for a reason:

1. **Simple Factory**  
   *Used for desk creation (e.g., StudyDesk or ComputerDesk) to centralize and simplify object instantiation based on desk type.*

2. **Factory Method**  
   *Used in booking processing, where different types of bookings (e.g., DeskBooking or RoomBooking) are created by subclass processors.*

3. **Abstract Factory**  
   *Used to simulate different UI environments (Windows vs. Mac) by creating related families of UI components (e.g., Button, Menu) without specifying concrete classes.*

4. **Builder Pattern**  
   *Used for creating complex `Room` objects step-by-step with optional attributes like floor number, whiteboard, and projector.*

5. **Prototype Pattern**  
   *Used for cloning `Desk` objects (e.g., QuietDesk) to efficiently replicate pre-configured desks without manually setting each property.*

6. **Singleton Pattern**  
   *Used for `DatabaseConnection` to ensure only one shared connection instance exists system-wide, reducing resource usage and preventing multiple unnecessary connections.*

Each implementation is organized in the `/creational_patterns` folder with corresponding unit tests under `/tests`.
