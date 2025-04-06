# State Transition Diagrams - Library Desk Booking System

This document contains the **state transition diagrams** for the objects in the Library Desk Booking System, showing how each object transitions through different states based on events. 
---

## 1. **Booking Object**

```mermaid
stateDiagram-v2
    [*] --> Requested
    Requested --> Approved : Admin approves
    Requested --> Rejected : Admin rejects
    Requested --> Cancelled : User cancels
    Approved --> Active : User checks in
    Active --> Completed : Session ends
    Approved --> Cancelled : User cancels before check-in
    Completed --> [*]
    Cancelled --> [*]
    Rejected --> [*]


