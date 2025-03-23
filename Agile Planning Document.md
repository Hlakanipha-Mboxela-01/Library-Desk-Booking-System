#  Agile Planning Document - Library Desk Booking System

This document serves as the comprehensive Agile Planning Document for the Library Desk Booking System project. It includes the following sections:







1. [User Stories](https://github.com/Hlakanipha-Mboxela-01/Library-Desk-Booking-System/blob/main/User_stories.md)
2. [Product Backlog](https://github.com/Hlakanipha-Mboxela-01/Library-Desk-Booking-System/blob/main/product_backlog.md)
3. [Sprint Planning](https://github.com/Hlakanipha-Mboxela-01/Library-Desk-Booking-System/blob/main/Sprint%20Planning.md)
4. [Traceability to Requirements](https://github.com/Hlakanipha-Mboxela-01/Library-Desk-Booking-System/blob/main/Traceability.md)
5. [Reflection](https://github.com/Hlakanipha-Mboxela-01/Library-Desk-Booking-System/blob/main/Reflection3.md)


---

## 1. User Stories

The following user stories were created by converting functional requirements from **Assignment 4** and use cases from **Assignment 5**. These stories follow the INVEST criteria and are mapped to the relevant system requirements.

| Story ID | User Story | Acceptance Criteria | Priority |
|----------|-----------|---------------------|----------|
| US-001 | As a student, I want to search for an available desk so that I can reserve a study space. | Results load in ≤3 sec; only available desks displayed. | High |
| US-002 | As a student, I want to book a desk for a specific time slot so that I have a guaranteed place to study. | Booking confirmation is displayed and stored in the database. | High |
| US-003 | As a librarian, I want to update desk statuses so that students see real-time availability. | Desk status updates instantly when changed. | High |
| US-004 | As a student, I want to cancel my booking so that I can free up the desk for others. | Cancellation is processed successfully with a confirmation message. | Medium |
| US-005 | As a student, I want to receive a confirmation email after booking so that I have proof of my reservation. | Email is sent within 1 min of booking. | Medium |
| US-006 | As an administrator, I want to generate reports on desk usage so that I can analyze student trends. | Reports generate in ≤5 min with accurate data. | Medium |
| US-007 | As an IT staff member, I want system performance logs so that I can monitor uptime and errors. | Logs update in real-time and store data for 30 days. | Low |
| US-008 | As a student, I want to receive a reminder before my booking so that I don’t forget my reserved time. | Reminder is sent via email/SMS 15 min before booking time. | Low |

---

## 2. Product Backlog

The product backlog is prioritized using MoSCoW methodology, with effort estimates assigned to each user story. 

| Story ID | User Story | Priority (MoSCoW) | Effort Estimate | Dependencies |
|----------|-----------|-------------------|-----------------|--------------|
| US-001 | Search for available desks | Must-have | 3 | None |
| US-002 | Book a desk for a specific time | Must-have | 5 | US-001 |
| US-003 | Update desk statuses in real-time | Must-have | 4 | None |
| US-004 | Cancel a booking | Should-have | 3 | US-002 |
| US-005 | Receive confirmation email after booking | Should-have | 2 | US-002 |
| US-006 | Generate desk usage reports | Could-have | 5 | None |
| US-007 | System performance logs | Won’t-have | 2 | None |
| US-008 | Send booking reminders | Could-have | 3 | US-002 |

### Justification for Prioritization:
- **Must-have stories** are essential for the core functionality of the desk booking system (e.g., searching for desks, booking desks, updating statuses).
- **Should-have stories** provide important but non-critical functionality (e.g., booking cancellation, confirmation emails).
- **Could-have stories** offer additional enhancements to user experience (e.g., reminders, reports).
- **Won’t-have stories** are deprioritized or excluded from the current sprint, but may be revisited in the future (e.g., system performance logs).

---

## 3.  Sprint Planning

### Sprint Goal:
**Sprint Goal:** Implement core desk booking and status update functionality to ensure that students can reserve desks and see real-time availability. The goal of this sprint is to deliver a basic but fully functional desk reservation system.

### Sprint Backlog:

| Task ID | Task Description | Assigned To | Estimated Hours | Status (To Do/In Progress/Done) |
|---------|------------------|-------------|-----------------|----------------------------------|
| T-001   | Develop search API endpoint | Dev Team | 8 | To Do |
| T-002   | Design UI for desk search results page | UI/UX Team | 6 | To Do |
| T-003   | Implement desk booking functionality | Dev Team | 12 | To Do |
| T-004   | Implement real-time desk status update system | Dev Team | 10 | To Do |
| T-005   | Write unit tests for desk booking functionality | QA Team | 6 | To Do |
| T-006   | Set up database schema | Database Team | 8 | To Do |

---

## 4.  Traceability to Requirements

The user stories and tasks in this sprint align with the **functional requirements** outlined in **Assignment 4**, ensuring that the features developed directly contribute to meeting the project goals. Below is a mapping between the functional requirements and user stories:

| Requirement | User Story ID | Description |
|-------------|---------------|-------------|
| FR-001: Search for available desks | US-001 | Students can search for desks by availability. |
| FR-002: Book a desk | US-002 | Students can book desks for specific time slots. |
| FR-003: Update desk statuses in real-time | US-003 | Desk statuses are updated instantly when changes occur. |
| FR-004: Cancel a booking | US-004 | Students can cancel bookings to free up desks. |
| FR-005: Confirmation email | US-005 | Students receive email confirmation after booking. |
| FR-006: Reports on desk usage | US-006 | Administrators can generate reports on desk usage. |

# 5.Reflection: Challenges in Prioritization, Estimation, and Aligning Agile with Personal Needs

The following reflections describe the challenges faced during the **Agile planning process** for the Library Desk Booking System project.

# Prioritization Difficulties
As the **sole stakeholder**, it was challenging to decide which features were **essential** versus **optional**. Typically, prioritization involves multiple perspectives, but in this case, I was forced to make all the decisions alone. This led to difficulties in determining the right balance between critical features and those that could be deferred to later stages.

# Effort Estimation Struggles
Estimating the **effort** for tasks, particularly technical ones, was another challenge. I attempted to use **story points** (e.g., Fibonacci sequence) for effort estimation, which helped with **relative estimation**. However, despite using this approach, I still experienced **underestimation** in certain tasks. This shows the inherent difficulty of predicting effort, especially when working alone and without a collaborative team to give feedback.

# Aligning Agile with Personal Needs
Working solo meant I didn't have the usual **team collaboration** that Agile assumes. This lack of interaction led to moments of **resistance** and **frustration**. Agile is meant to be iterative, involving frequent reviews and input from various team members, but without that support, it was easy to become stuck in my own thoughts. The absence of regular feedback caused me to sometimes prioritize **deadlines** over perfecting the features. This also led to moments where I felt uncertain about the **direction** of the project.

Despite these challenges, Agile's **flexibility** allowed me to adapt and work through the process. **Prioritization**, **effort estimation**, and **aligning Agile** with personal needs were difficult to navigate alone, but the experience helped me grow in understanding how to better handle **uncertainty** and **complexity** in future projects.


###  Conclusion
This document outlines the user stories, product backlog, sprint plan, traceability to the project requirements reflections. It serves as a comprehensive reference for ensuring all features align with the functional requirements and contribute to the overall project success.
