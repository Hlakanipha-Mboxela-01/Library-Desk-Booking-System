## Reflection: Challenges in Translating Requirements to Use Cases/Tests

In developing the Library Desk Booking System, one of the key challenges I encountered was translating the functional and non-functional requirements into clear and actionable use cases and test cases. While the process of documenting the system’s behavior seemed straightforward at first, it quickly became evident that ensuring completeness and accuracy in the requirements was far from simple. 

### 1. **Complexity of Requirements**

The system’s functional requirements, such as desk availability viewing, desk reservation, and notifications, were relatively easy to translate into use cases because they are concrete actions that users need to perform. However, the non-functional requirements, such as performance, scalability, and security, posed a significant challenge. For example, how do you effectively measure performance through test cases without a clear context of system loads or user behavior? Defining performance test scenarios, like ensuring the system updates desk availability in less than three seconds, required assumptions about the system's actual load, and determining how to simulate real-world usage scenarios with accuracy was not trivial. 

### 2. **Balancing User Needs with System Constraints**

Another challenge arose from balancing user expectations with the technical limitations of the system. For instance, when writing use cases, I had to ensure that the system would meet student needs for easy desk booking while simultaneously ensuring the system could handle the underlying technical requirements, such as the scalability and reliability of the desk availability updates. The key concern here was the **availability of desks** in real time. This functionality required careful consideration of how frequently desk availability should be updated (every 5 seconds), while keeping the system responsive and reducing lag for the students using the system.

### 3. **Stakeholder Perspective Translation**

Translating the needs of different stakeholders into use cases also presented challenges. While it was easy to define user-facing requirements like "Students must be able to book a desk," translating administrative and IT-focused requirements, such as "Librarians must be able to update desk statuses" and "IT staff needs to ensure system uptime of 99.9%," required an understanding of how these tasks would be performed within the context of the system. For instance, defining test cases to validate desk reservation management for librarians involved considering edge cases, like the system handling multiple concurrent reservations or cancellations, which was a difficult task to account for. These administrative use cases had to account for the smooth operation of the system while not hindering the student experience.

### 4. **Handling Non-Functional Requirements in Test Cases**

The most difficult part of the testing process was integrating non-functional requirements such as security and maintainability into the test cases. Security requirements, such as the need for data encryption, are often invisible to the user but are critical in ensuring the safety of student information. This led me to develop a non-functional test that simulated encryption protocols to check if sensitive student data was securely handled during interactions with the system. On the other hand, **maintainability** presented a challenge in terms of ensuring that updates or fixes to the system didn’t require long downtimes, so I had to define a test to validate deployment times for new updates.

### 5. **Test Case Complexity**

Creating comprehensive test cases also presented a challenge. With multiple functional requirements and non-functional constraints, ensuring full test coverage was difficult. Each test case needed to cover various aspects of functionality (e.g., desk reservation process) and edge cases (e.g., timeouts or errors in the reservation process). Moreover, non-functional requirements like usability and performance were more subjective and harder to validate using traditional test cases. For example, measuring the **usability** of the system through test cases like "90% of students should be able to make a booking in under 3 minutes" required real-world testing and observations that weren’t always easy to simulate within a test environment.

### 6. **Maintaining Consistency**

Lastly, ensuring consistency throughout the process—aligning use cases, test cases, and the system’s specifications—was a continual challenge. Each modification in the requirements often led to changes in the use case scenarios or vice versa. Maintaining alignment between the system’s expected behavior, the test cases, and the stakeholders’ expectations required constant validation to avoid scope creep.

### Conclusion

In conclusion, while translating functional and non-functional requirements into use cases and test cases was a challenging process, it also highlighted the importance of a clear understanding of both user needs and system constraints. The experience deepened my appreciation for the role of testing in ensuring a robust system and reinforced the necessity of detailed and well-thought-out specifications when designing complex systems like the Library Desk Booking System.

