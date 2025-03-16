# Test Case Development for Library Desk Booking System

| **Test Case ID** | **Requirement ID** | **Description** | **Steps** | **Expected Result** | **Actual Result** | **Status (Pass/Fail)** |
|------------------|--------------------|-----------------|-----------|---------------------|--------------------|------------------------|
| TC001 | FR-001 | Verify Desk Availability Viewing | 1. Open the system. 2. Check desk availability. 3. Wait for 5 seconds. | Available desks should be updated in real-time. | | |
| TC002 | FR-002 | Verify Desk Reservation Process | 1. Student logs in. 2. Select desk. 3. Choose time slot. 4. Confirm booking. | Desk is reserved, and student gets a confirmation. | | |
| TC003 | FR-003 | Verify Notification on Successful Booking | 1. Complete desk reservation. 2. Wait for notification. | Student receives confirmation email/SMS within 1 minute. | | |
| TC004 | FR-004 | Verify Admin Access to Desk Management | 1. Librarian logs in. 2. Update desk status. 3. Confirm status update. | Desk status is updated in real-time without lag. | | |
| TC005 | FR-005 | Verify Usage Reporting by Admin | 1. Administrator logs in. 2. Generate desk usage report. | Report includes peak booking times and desk availability data. | | |
| TC006 | NFR-001 | Verify Usability | 1. Conduct user testing with 10 students. 2. Measure time to complete desk booking. | 90% of students complete booking in under 3 minutes. | | |
| TC007 | NFR-002 | Verify Performance (Desk Availability Update) | 1. Book a desk. 2. Wait for desk availability to update. | Desk status updates within 3 seconds after reservation. | | |
| TC008 | NFR-003 | Verify Scalability | 1. Add new campus and desks. 2. Monitor system performance. | System performance does not degrade with added desks or campuses. | | |
| TC009 | NFR-004 | Verify Security (Data Encryption) | 1. Perform a reservation with sensitive student data. 2. Verify data transmission and storage. | Sensitive user data is encrypted in transit and storage. | | |
| TC010 | NFR-005 | Verify Maintainability | 1. Apply a system update. 2. Monitor system downtime. | System update completes without requiring downtime. | | |
| TC011 | NFR-006 | Verify Deployability | 1. Deploy system to a new campus. 2. Measure deployment time. | Deployment takes no longer than 2 days with no system downtime. | | |
| TC012 | NFR-007 | Verify System Availability | 1. Simulate system downtime. 2. Measure uptime over a month. | System uptime should be 99.9%, with downtime not exceeding 43 minutes per month. | | |

