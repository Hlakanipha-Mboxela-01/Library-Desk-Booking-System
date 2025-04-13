##  Domain Model: Library Desk Booking System

| Entity    | Attributes                                                | Methods                              | Relationships                                                |
|-----------|-----------------------------------------------------------|--------------------------------------|--------------------------------------------------------------|
| User      | userId, name, email, password                             | register(), login(), bookDesk()      | Can make 0..* Bookings                                       |
| Booking   | bookingId, bookingDate, status, timeSlotId, deskId        | confirmBooking(), cancelBooking()    | Linked to 1 User, 1 Desk, and 1 TimeSlot                     |
| Desk      | deskId, location, isAvailable, roomId                     | reserve(), release()                 | Belongs to 1 Room, can be reserved in 0..* Bookings          |
| Room      | roomId, name, floorNumber                                 | addDesk(), removeDesk()              | Contains 1..* Desks                                           |
| TimeSlot  | timeSlotId, startTime, endTime                            | isAvailable()                        | Linked to 0..* Bookings                                       |
| Admin     | adminId, name, email, password                            | manageUsers(), manageDesks()         | Inherits from User; can view/manage all Bookings and Desks   |

---

###  Business Rules

- A user can only make **one active booking per time slot**.
- A desk must be **available** to be reserved.
- A room must contain **at least one desk**.
- A booking must be associated with exactly **one user, one desk, and one time slot**.
- Only admins can **manage desks** (add, edit, remove) and **view all bookings**.
- A desk cannot be booked by more than one user in the same time slot.
- Admins can add or remove desks, but users can only book available ones.

