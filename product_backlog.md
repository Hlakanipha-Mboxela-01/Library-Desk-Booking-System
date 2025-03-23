
#  Product Backlog - Library Desk Booking System

This document contains the prioritized product backlog for the Library Desk Booking System, including MoSCoW prioritization, effort estimates, and dependencies.

##  Product Backlog

| Story ID | User Story | Priority (MoSCoW) | Effort Estimate | Dependencies |
|----------|------------|-------------------|-----------------|--------------|
| US-001   | As a student, I want to search for an available desk so that I can reserve a study space. | Must-have | 3 | None |
| US-002   | As a student, I want to book a desk for a specific time slot so that I have a guaranteed place to study. | Must-have | 4 | US-001 |
| US-003   | As a librarian, I want to update desk statuses so that students see real-time availability. | Must-have | 3 | US-001 |
| US-004   | As a student, I want to cancel my booking so that I can free up the desk for others. | Should-have | 2 | US-002 |
| US-005   | As a student, I want to receive a confirmation email after booking so that I have proof of my reservation. | Should-have | 2 | US-002 |
| US-006   | As an administrator, I want to generate reports on desk usage so that I can analyze student trends. | Should-have | 3 | US-003 |
| US-007   | As an IT staff member, I want system performance logs so that I can monitor uptime and errors. | Could-have | 2 | US-003 |
| US-008   | As a student, I want to receive a reminder before my booking so that I don’t forget my reserved time. | Could-have | 1 | US-002 |
| US-009   | As a system admin, I want user data encrypted with AES-256 so that security compliance is met. | Must-have | 4 | None |
| US-010   | As an IT staff member, I want the system to have 99.9% uptime so that users experience minimal downtime. | Must-have | 5 | None |

---

##  Justification for Prioritization:

### **Must-have**:
- **Critical for system functionality** and directly impacts user experience and system security (e.g., desk booking functionality, encryption, uptime).

### **Should-have**:
- **Enhances user experience** but not crucial for system operation (e.g., confirmation emails, reports).

### **Could-have**:
- **Nice-to-have features** that can be implemented later if time allows (e.g., reminders, performance logs).

---
