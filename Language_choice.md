## Language Choice

I have chosen **Java** for this implementation because:
- **Object-Oriented Programming (OOP)**: Java is an ideal choice for OOP, which is central to the design of this system. Java allows me to implement key OOP principles such as **inheritance**, **encapsulation**, and **polymorphism**, which are required for modeling real-world entities like `User`, `Admin`, `Desk`, etc.
- **Platform Independence**: Java runs on the Java Virtual Machine (JVM), making it cross-platform and easily deployable across different environments (e.g., Windows, MacOS, Linux).
- **Strong Typing**: Java's static typing helps catch errors early during compile-time, improving the reliability of the system.

## Design Decisions

### **1. User and Admin Inheritance**
- The **`Admin`** class **inherits** from the **`User`** class because admins are a specialized type of user with additional privileges (e.g., managing users and desks).
- **Inheritance** promotes **code reuse**, as admins share common functionality (like `login()` and `register()`) with regular users, but also introduce new methods specific to their role.

### **2. Composition Between Room and Desk**
- The **`Room`** class contains multiple **`Desk`** objects, meaning a **Room** has many desks.
- This is modeled as a **composition** because a room can't logically exist without desks, and desks are physically located within a room.
- The relationship is implemented by having a `List<Desk>` in the `Room` class, which can dynamically store and manage desks.

### **3. Associations Between User, Booking, Desk, and TimeSlot**
- **Users** can make multiple **Bookings**, where each **Booking** is associated with one **Desk** and one **TimeSlot**.
- This **one-to-many** and **one-to-one** relationship mirrors the real-world system of desk booking, where a user can reserve multiple desks (but each booking is linked to a specific desk at a specific time).

### **4. Encapsulation of Data**
- All class attributes (e.g., `userId`, `deskId`) are **private** to follow **encapsulation** principles in OOP. This ensures that these attributes can only be modified or accessed via methods (e.g., getters/setters).
- This protects the internal state of the classes and ensures that users and admins can only interact with the system in controlled ways (e.g., calling `bookDesk()` or `manageDesks()`).

### **5. Core Methods Reflecting System Use Cases**
- The methods within the classes (e.g., `register()`, `reserve()`, `confirmBooking()`) align directly with the system's real-world operations, reflecting how users would interact with the desk booking system.
- These methods enable actions such as **booking a desk**, **confirming a booking**, **managing desk availability**, and **adding/removing desks from rooms**.
