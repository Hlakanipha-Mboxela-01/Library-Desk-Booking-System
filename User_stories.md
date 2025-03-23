# 📖 User Stories  

## 🎯 Overview  
This document contains user stories converted from functional requirements and use cases for the Library Desk Booking System. Each story follows the INVEST criteria and is tracked using GitHub Issues and Milestones.

---

## 📜 User Stories  

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

## 🔒 Non-Functional User Stories  

| Story ID | User Story | Acceptance Criteria | Priority |
|----------|-----------|---------------------|----------|
| US-009 | As a system admin, I want user data encrypted with AES-256 so that security compliance is met. | Encryption is applied to all user data in transit and at rest. | High |
| US-010 | As an IT staff member, I want the system to have 99.9% uptime so that users experience minimal downtime. | System downtime does not exceed **43 minutes per month**. | High |

---

