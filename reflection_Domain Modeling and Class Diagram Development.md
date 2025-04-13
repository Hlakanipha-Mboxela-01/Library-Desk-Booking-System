## Reflection: Domain Modeling and Class Diagram Development

Designing the domain model and class diagram for the Library Desk Booking System was both challenging and rewarding. It pushed me to think critically about how the system should function and how to represent that logic through object-oriented design. Throughout the process, I faced several challenges, made some key design decisions, and learned a lot about how to structure and model a complex system. 

### 1. Challenges Faced

One of the biggest challenges I faced was figuring out how to **abstract** the real-world concepts into manageable and meaningful objects. At first, I overcomplicated things by creating too many small entities, such as a separate BookingConfirmation class or an `AvailabilityStatus` class. However, I soon realized these concepts could be represented by combining them into broader entities like Booking and TimeSlot. This change made the model simpler and more coherent, which helped a lot when it came to mapping the system’s actual behavior.

Another major challenge was understanding and accurately modeling the **relationships** between different entities. For example, a User can make many bookings, and each booking is linked to a Desk and a TimeSlot. Determining whether these relationships should be one-to-many, many-to-many, or one-to-one took a lot of trial and error. I had to refer back to the use cases and state diagrams from previous assignments to make sure the relationships made sense and matched the system’s behavior. Figuring out the **multiplicities** (like whether a`Desk can have multiple bookings or just one) was also tricky, but ultimately, it helped ensure that the system could handle real-world scenarios properly, like preventing double-booking of desks.

Defining the **methods** for each class was another area where I spent a lot of time. For example, deciding where to place methods like createBooking() or confirmBooking() took several iterations. At first, I assigned too many responsibilities to the `User` class, but then I realized that these actions should be part of the Booking class since they directly relate to the booking process itself, not the user. This process helped me better understand how to apply the principle of **single responsibility** to each class.

### 2. Alignment with Previous Assignments

Looking back at the previous assignments, I can see how the work I did in the early stages of the project helped shape this class diagram. The **functional requirements** from Assignment 4 and **use cases** from Assignment 5 directly informed the entities I created, such as `User`, `Desk`, `Room`, and `Booking`. 

The **activity and state diagrams** from Assignment 8 were also incredibly helpful. For instance, the state diagram for a booking helped me define methods like `confirmBooking()` and `cancelBooking()`. These methods mirror the user flow described in the activity diagrams, which guided me in making sure the class diagram reflected the actual user interactions and system behavior. Additionally, the **business rules** (such as preventing double-booking) were carefully represented in the relationships between entities, like ensuring a `Booking` cannot overlap with another.

### 3. Trade-offs Made

To keep the design simple and clear, I had to make a few trade-offs. For instance, I chose **composition over inheritance** in some places. Instead of having an abstract superclass for resources like `Room` and `Desk`, I decided to use composition (i.e., a `Room` has many `Desks`). This made the model easier to understand and prevented unnecessary complexity.

I also decided to leave out some entities like `Notification` or `AuditTrail`, which could be useful but weren’t essential to the core functionality of the system. While these features could be added in the future, I chose to focus on the main functionality in order to keep the class diagram more manageable and relevant to the scope of this project.

### 4. Lessons Learned

This assignment really helped me grasp the importance of aligning the system design with the business needs. I learned that a good design is not about adding complexity but about creating a system that is easy to understand and scalable. I also became more comfortable with **object-oriented principles**, especially **encapsulation** and **separation of concerns**, which helped me organize the classes more logically.

Using **Mermaid.js** to visualize the class diagram also taught me a lot about UML syntax and how to communicate complex designs clearly and effectively. It was a useful tool for structuring the classes and relationships in a way that was easy to follow.

Overall, this process gave me a deeper understanding of how to design robust systems and how important it is to focus on clarity, cohesion, and simplicity in the design phase. I now feel more confident in my ability to apply object-oriented principles to real-world problems and build systems that are both functional and maintainable.
