IT Helpdesk & Ticket Management Backend

A Spring Boot based backend application that provides REST APIs for managing IT helpdesk tickets.  
This project is designed to simulate a real-world IT Service Desk system used in organizations.

---

Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- REST APIs
- Maven
- Git & GitHub

---

 Features
- User Registration and Login
- Create IT Support Tickets
- Automatic Issue Categorization (Basic Logic)
- Update Ticket Status (Open / In Progress / Resolved)
- View All Tickets
- Backend-only implementation (API based)

---

 Basic Automation Logic
The system uses simple keyword-based logic to categorize issues:
- Network issues (wifi, internet)
- Hardware issues (slow system, hanging)
- Software issues (login, password)

This helps in faster ticket routing and resolution.

---

Project Structure
it-helpdesk-backend
├── src
│ └── main
│ ├── java
│ └── resources
├── pom.xml
├── mvnw
├── mvnw.cmd
└── .gitignore

yaml
Copy code

---

How to Run the Project
1. Clone the repository
2. Import the project into Eclipse / IntelliJ
3. Configure MySQL database in `application.properties`
4. Run the application as a Spring Boot Application
5. Test APIs using Postman

---

 API Testing
The APIs can be tested using tools like Postman or REST Client.

---

Author
**Gaurav Dhayade**  
BE / BTech – Computer / IT  
Year of Passing: 2024–2025

---

## 📎 Note
This project is created for learning purposes and to demonstrate backend development, REST APIs, and IT service desk workflow.
