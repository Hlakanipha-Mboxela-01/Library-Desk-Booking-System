## Repository Interface Design
I used generics (`<T, ID>`) in the `Repository` interface to make it reusable for different entities such as `Book`, `User`, and `Booking`.
This avoids duplication of CRUD operations, promotes code reusability, and ensures a clean and scalable design.
