# Kanban Board Customization

## Columns Overview

The Kanban board was customized with the following columns to help track tasks more efficiently throughout the sprint:

### 1. **Backlog**
This column contains tasks that are part of the product backlog but have not yet been prioritized or refined for immediate work. These tasks are under consideration for future sprints or need further discussion.

| **Task ID** | **Task Description**                                          | **Assigned To**     | **Estimated Hours** |  
|-------------|---------------------------------------------------------------|---------------------|---------------------|  
| **T-001**   | Develop search API endpoint for desk search by availability   | Dev Team            | 8                   |  
| **T-002**   | Design UI for desk search results page                        | UI/UX Team          | 6                   |  
| **T-003**   | Implement desk booking functionality                          | Dev Team            | 12                  |  
| **T-004**   | Implement real-time desk status update system                  | Dev Team            | 10                  |  
| **T-005**   | Write unit tests for desk booking functionality                | QA Team             | 6                   |  
| **T-006**   | Set up database schema for desk reservations and statuses     | Database Team       | 8                   |  

### 2. **Ready**
This column contains tasks that have been refined and are ready for implementation. These tasks have been prioritized and are awaiting action by the team.

| **Task ID** | **Task Description**                                          | **Assigned To**     | **Estimated Hours** |  
|-------------|---------------------------------------------------------------|---------------------|---------------------|  
| **T-001**   | Develop search API endpoint for desk search by availability   | Dev Team            | 8                   |  
| **T-002**   | Design UI for desk search results page                        | UI/UX Team          | 6                   |  
| **T-003**   | Implement desk booking functionality                          | Dev Team            | 12                  |  

### 3. **To Do**
This column contains tasks that are planned but have not been started yet. These tasks are from our sprint backlog and are ready to be picked up by the team.

| **Task ID** | **Task Description**                                          | **Assigned To**     | **Estimated Hours** |  
|-------------|---------------------------------------------------------------|---------------------|---------------------|  
| **T-004**   | Implement real-time desk status update system                  | Dev Team            | 10                  |  
| **T-005**   | Write unit tests for desk booking functionality                | QA Team             | 6                   |  
| **T-006**   | Set up database schema for desk reservations and statuses     | Database Team       | 8                   |  

### 4. **In Progress**
This column is for tasks that the team is actively working on. When a task moves from "To Do" to "In Progress," it indicates that work has started.

| **Task ID** | **Task Description**                                          | **Assigned To**     | **Estimated Hours** |  
|-------------|---------------------------------------------------------------|---------------------|---------------------|  
| **T-001**   | Develop search API endpoint for desk search by availability   | Dev Team            | 8                   |  
| **T-003**   | Implement desk booking functionality                          | Dev Team            | 12                  |  

### 5. **Testing**
This column is for tasks that have been completed by the developers and are now being tested or validated by QA or the testing team.

| **Task ID** | **Task Description**                                          | **Assigned To**     | **Estimated Hours** |  
|-------------|---------------------------------------------------------------|---------------------|---------------------|  
| **T-003**   | Implement desk booking functionality                          | Dev Team            | 12                  |  
| **T-005**   | Write unit tests for desk booking functionality                | QA Team             | 6                   |  

### 6. **Blocked**
Tasks that are facing issues or dependencies are placed in the "Blocked" column until they can continue. This highlights obstacles that need to be resolved before work can proceed.

| **Task ID** | **Task Description**                                          | **Assigned To**     | **Estimated Hours** |  
|-------------|---------------------------------------------------------------|---------------------|---------------------|  
| **T-002**   | Design UI for desk search results page                        | UI/UX Team          | 6                   |  

### 7. **Done**
Once tasks are completed, tested, and validated, they are moved to the "Done" column. This represents fully completed tasks that have been delivered.

| **Task ID** | **Task Description**                                          | **Assigned To**     | **Estimated Hours** |  
|-------------|---------------------------------------------------------------|---------------------|---------------------|  
| **T-001**   | Develop search API endpoint for desk search by availability   | Dev Team            | 8                   |  
| **T-002**   | Design UI for desk search results page                        | UI/UX Team          | 6                   |  
| **T-003**   | Implement desk booking functionality                          | Dev Team            | 12                  |  
| **T-004**   | Implement real-time desk status update system                  | Dev Team            | 10                  |  
| **T-005**   | Write unit tests for desk booking functionality                | QA Team             | 6                   |  
| **T-006**   | Set up database schema for desk reservations and statuses     | Database Team       | 8                   |  

## Customization Rationale

- **Backlog**: The "Backlog" column is used to capture all potential tasks that could be worked on in future sprints but haven't been prioritized or refined yet.
- **Ready**: The "Ready" column serves to indicate tasks that have been fully scoped and are ready for implementation, ensuring that no task moves directly into "To Do" without proper preparation.
- **Testing**: The "Testing" column ensures that completed development tasks are validated and checked for issues before they are marked as done. It allows the QA team to conduct their tests and ensure quality.
- **Blocked**: The "Blocked" column helps identify tasks that are stalled due to issues or dependencies. This allows the team to quickly address any roadblocks and resume progress without confusion.
