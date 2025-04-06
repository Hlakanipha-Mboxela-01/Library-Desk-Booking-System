# 1. User Registration
```mermaid
flowchart TD
    subgraph User
        A1([Start]) --> A2["Enter registration details"]
        A2 --> A3["Submit registration"]
    end

    subgraph System
        A3 --> A4["Validate input"]
        A4 -->|Valid| A5["Create user account"]
        A4 -->|Invalid| A6["Display error"]
        A5 --> A7["Send verification email"]
        A7 --> A8["Wait for email verification"]
        A8 -->|Verified| A9["Activate account"] --> A10([End])
        A8 -->|Expired| A11["Link expired"] --> A10
        A6 --> A10
    end
```
**Explanation:** This workflow ensures secure and verified user registration. Stakeholders (admins) benefit from spam prevention and valid user data collection.
## 2. Desk Booking Request
```mermaid
flowchart TD
    subgraph User
        B1([Start]) --> B2["Select desk, date, and time"]
        B2 --> B3["Submit booking request"]
    end

    subgraph System
        B3 --> B4["Check desk availability"]
        B4 -->|Available| B5["Store booking request"] --> B6["Notify Admin"] --> B7([End])
        B4 -->|Not Available| B8["Display error message"] --> B7
    end
```
**Explanation:**
Ensures real-time desk availability and quick feedback for users. Stakeholders benefit from efficient resource usage and reduced booking errors.

## 3. Admin Approves Booking
```mermaid
flowchart TD
    subgraph Admin
        C1([Start]) --> C2["View pending requests"] --> C3["Review details"]
        C3 -->|Approve| C4["Approve booking"]
        C3 -->|Reject| C5["Reject booking"]
    end

    subgraph System
        C4 --> C6["Notify user of approval"] --> C7([End])
        C5 --> C8["Notify user of rejection"] --> C7
    end
```
**Explanation:**
Admins maintain control over desk usage while users are kept informed, addressing communication and accountability concerns.

## 4. User Check-In
```mermaid
flowchart TD
    subgraph User
        D1([Start]) --> D2["Open My Bookings"] --> D3["Select booking"] --> D4["Check-in"]
    end

    subgraph System
        D4 --> D5["Validate check-in time"]
        D5 -->|Valid| D6["Mark as Active"] --> D7([End])
        D5 -->|Invalid| D8["Display error"] --> D7
    end
```
**Explanation:** Enforces time-bound desk usage, avoiding no-shows and increasing efficient utilization. Meets librarian needs for real-time status updates.

## 5. User Cancels Booking
```mermaid
flowchart TD
    subgraph User
        E1([Start]) --> E2["Open My Bookings"] --> E3["Select booking"] --> E4["Click Cancel"]
    end

    subgraph System
        E4 --> E5["Remove booking"] --> E6["Notify Admin"] --> E7([End])
    end
```
**Explanation:**
 Gives users control over bookings while notifying admins for inventory updates. Supports flexibility and efficient desk turnover.

## 6. Booking Auto Expiry
```mermaid
flowchart TD
    subgraph System
        F1([Start]) --> F2["Monitor current time"] --> F3["Check active bookings"]
        F3 -->|Time elapsed| F4["Auto-expire session"] --> F5["Free up desk"] --> F6([End])
        F3 -->|Still valid| F7["Wait"] --> F2
    end
```
**Explanation:**
Automatically frees desks not checked into. Enhances resource availability and supports auto-scaling needs for the system.

## 7. Admin Flags Desk for Maintenance
```mermaid
flowchart TD
    subgraph Admin
        G1([Start]) --> G2["Open desk list"] --> G3["Select desk"] --> G4["Flag for maintenance"]
    end

    subgraph System
        G4 --> G5["Notify users"] --> G6["Prevent further bookings"] --> G7([End])
    end
```
**Explanation:**
Ensures faulty desks aren’t booked, maintaining user safety and hardware quality. Helps librarians address user complaints efficiently.
## 8. Submit Feedback

```mermaid
flowchart TD
    subgraph User
        H1([Start]) --> H2["Navigate to Feedback Page"]
        H2 --> H3["Enter feedback and rating"]
        H3 --> H4["Submit Feedback"]
    end

    subgraph System
        H4 --> H5["Validate input"]
        H5 -->|Valid| H6["Store feedback"]
        H5 -->|Invalid| H7["Display error message"]
        H6 --> H8["Notify Admin"]
        H6 --> H9([End])
        H7 --> H9
    end


```
**Explanation:**

This workflow allows users to communicate their experiences with the system. Feedback is validated, stored, and sent to administrators. This meets stakeholder concerns such as system usability tracking and identifying areas for improvement. The diagram includes decision logic (valid/invalid feedback) and shows the user-system interaction clearly. It also supports librarians' and developers' need for real-time feedback monitoring and quality assurance.
