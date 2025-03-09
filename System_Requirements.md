# System Requirements Document

## Introduction

### Overview
This document outlines the system requirements for the Library Desk Booking System, which allows students to book desks in the library, ensuring efficient desk management and improving user experience.

### Scope
The system supports the booking of desks, real-time availability tracking, notifications, and desk management by librarians. IT staff will maintain the infrastructure, and administrators will have access to reports for analysis.

## Stakeholder Requirements

### 1. Students (Bookers)
- **Functional Requirements:**
  1. **Desk Availability Viewing**: The system must allow students to view available desks in real-time.
     - **Acceptance Criteria**: Students can filter available desks by time slot, and the system updates desk availability every 5 seconds.
  2. **Desk Reservation**: Students must be able to select a desk and reserve it for a specific time slot.
     - **Acceptance Criteria**: Desk reservation is completed in 3 steps: selecting a desk, choosing a time, and confirming the booking.
  3. **Booking Confirmation**: The system must send students an email/SMS upon booking confirmation.
     - **Acceptance Criteria**: The system sends a confirmation within 1 minute of desk reservation.

- **Non-Functional Requirements:**
  1. **Usability**: The system must provide a simple and intuitive interface for students.
     - **Acceptance Criteria**: User testing shows 90% of students can reserve a desk in less than 3 minutes without assistance.
  2. **Performance**: The system must provide quick responses to student interactions.
     - **Acceptance Criteria**: Desk availability updates within 3 seconds after a reservation is made.

### 2. Librarians
- **Functional Requirements:**
  1. **Desk Management**: Librarians must be able to mark desks as available, reserved, or under maintenance.
     - **Acceptance Criteria**: Librarians can update desk status in real-time, and the system reflects changes immediately.
  2. **Booking Management**: Librarians should be able to view all student reservations and manually adjust bookings if needed.
     - **Acceptance Criteria**: Librarians can view and modify bookings with 2 clicks.

- **Non-Functional Requirements:**
  1. **Scalability**: The system must scale to handle 500+ desks across multiple campuses.
     - **Acceptance Criteria**: System performance must not degrade when expanding desk management to more than 500 desks.

### 3. IT Staff
- **Functional Requirements:**
  1. **System Monitoring**: IT staff must be able to monitor system health, including uptime and error logs.
     - **Acceptance Criteria**: IT staff can view system status in real-time through a dashboard, and errors are logged and alerted within 5 minutes.

- **Non-Functional Requirements:**
  1. **Security**: The system must securely store student information (including login credentials).
     - **Acceptance Criteria**: Student credentials are encrypted in storage, and login attempts are logged for security audits.
  2. **Maintainability**: The system should have a modular codebase for easy updates.
     - **Acceptance Criteria**: System updates should be deployable with zero downtime for users.

### 4. University Administrators
- **Functional Requirements:**
  1. **Report Generation**: Administrators must be able to generate usage reports showing desk occupancy and student booking trends.
     - **Acceptance Criteria**: Reports can be generated within 5 minutes and include detailed breakdowns of desk usage and reservation frequency.

- **Non-Functional Requirements:**
  1. **Deployability**: The system must be easy to deploy across multiple university campuses.
     - **Acceptance Criteria**: System deployment on a new campus should be completed within 2 days.

## System Requirements

### Functional Requirements
1. **Desk Availability Viewing**:
   - The system must show available desks in real-time.
   - **Acceptance Criteria**: Available desks are updated every 5 seconds and display accurate availability.

2. **Desk Reservation**:
   - Students must be able to select and reserve desks for a time slot.
   - **Acceptance Criteria**: Reservations can be made within 3 steps: selecting a desk, selecting a time, and confirming the booking.

3. **Notifications**:
   - Confirmation emails/SMS must be sent to students upon successful booking.
   - **Acceptance Criteria**: Notifications are sent within 1 minute after the booking is made.

4. **Admin Access to Desk Management**:
   - Librarians must be able to update desk status and manage reservations.
   - **Acceptance Criteria**: Desk status updates in real-time without lag.

5. **Usage Reporting**:
   - Administrators must be able to generate detailed reports on desk usage and reservations.
   - **Acceptance Criteria**: Reports include data on peak booking times and desk availability.

### Non-Functional Requirements
1. **Usability**:
   - The system must be intuitive and user-friendly.
   - **Acceptance Criteria**: 90% of students should be able to make a booking in under 3 minutes during user testing.

2. **Performance**:
   - The system should update desk availability in less than 3 seconds.
   - **Acceptance Criteria**: Desk status and availability updates instantly after a reservation is made.

3. **Scalability**:
   - The system should be able to scale to support multiple campuses and hundreds of desks.
   - **Acceptance Criteria**: System performance should not degrade with the addition of more desks or campuses.

4. **Security**:
   - Sensitive user data (student info) must be encrypted.
   - **Acceptance Criteria**: All user data must be encrypted in transit and storage.

5. **Maintainability**:
   - The codebase must be modular for easy updates and fixes.
   - **Acceptance Criteria**: System updates and fixes should be completed without requiring system downtime.

6. **Deployability**:
   - The system must be deployable across multiple campuses with minimal effort.
   - **Acceptance Criteria**: New campus deployment should take no longer than 2 days with no system downtime.

7. **Availability**:
   - The system should have 99.9% uptime.
   - **Acceptance Criteria**: Any downtime must not exceed 43 minutes per month.

### Conclusion
This document outlines the essential functional and non-functional requirements for the Library Desk Booking System. The specified requirements will ensure that the system meets the needs of all stakeholders and performs efficiently, securely, and at scale.

