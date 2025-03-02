# Architecture Design - Library Desk Booking System

## 1. Introduction

### Project Title: Library Desk Booking System (Java)

### Domain: Library Management System
- **Description**: The system is designed to streamline the desk reservation process in libraries.

### Problem Statement
Manual desk reservations can lead to mistakes and inefficiencies. This system automates the process to improve usability and desk management.

### Scope
The system will allow users to book desks and administrators to manage desk availability.

## 2. C4 Diagrams

### 2.1 Context Diagram
- The **Library Desk Booking System** interacts with:
  - Users (Library visitors)
  - Admin (Library staff)
  - Database (SQL database for storing desk and user information)

graph TB
    User[User] -->|Books Desk| LibrarySystem[Library Desk Booking System]
    Admin[Admin] -->|Manages Bookings| LibrarySystem
    LibrarySystem -->|Uses| Database[(Database)]

### 2.2 Container Diagram
- **Backend**: The system’s backend is responsible for managing user requests, booking desks, and storing data.
- **Frontend**: The client-side interface allows users and admins to interact with the system.
- **Database**: Stores user information, desk availability, and bookings.

graph TD
    User[User Interface] -->|Accesses via browser| WebServer[Web Server]
    WebServer -->|Sends requests to| AppServer[Application Server]
    AppServer -->|Fetches data from| Database[(Database)]

    subgraph Cloud
        WebServer
        AppServer
        Database
    end


### 2.3 Component Diagram
- **Booking System**: Handles desk reservations.
- **User Management**: Manages user authentication and registration.
- **Admin Management**: Admins can manage desks and bookings.

graph LR
    Booking[Booking System] -->|Manages| Desk[Desk Management]
    User[User Management] -->|Handles| UserDetails[User Details]
    Admin[Admin Management] -->|Manages| AdminDetails[Admin Details]

### 2.4 Deployment Diagram
- The system will be deployed on a local machine or server with database access.

graph LR
    User[User Interface] -->|Accesses via browser| WebServer[Web Server]
    WebServer -->|Sends requests to| AppServer[Application Server]
    AppServer -->|Fetches data from| Database[(Database)]

    subgraph Cloud
        WebServer
        AppServer
        Database
    end

    User -.->|Accesses via internet| Cloud

