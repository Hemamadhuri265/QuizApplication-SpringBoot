# QuizApplication-SpringBoot
Developed a Java Quiz Application using Spring Boot, MySQL, Thymeleaf, and Spring Data JPA. The application allows users to register, log in, take a quiz with 10 Java-related questions, and track their scores. The project focuses on user-friendly front-end integration and secure back-end functionality.

📝 Quiz Application - Spring Boot + MySQL + Thymeleaf
This is a simple web-based Java quiz application built using Spring Boot, Spring Data JPA, MySQL, and Thymeleaf. It supports user registration, login, quiz attempts with multiple-choice questions, and tracks user scores across multiple attempts.

✅ Technologies Used

1.Java 17+

2.Spring Boot

3.Spring Web

4.Spring Data JPA

5.Thymeleaf (template engine)

6.MySQL (Relational Database)

7.HTML/CSS/javascipt (Frontend)

8.STS tool

________________________________________________________________________________________________________________________________________________________________

🚀 How to Run the Project
1. Clone the Repository
bash
Copy
Edit
git clone https://github.com/your-username/quiz-app.git


2. Set Up MySQL Database
Create a new MySQL database:

CREATE DATABASE quiz_app;
Update application.properties or application.yml with your database credentials:

3.properties

spring.datasource.url=jdbc:mysql://localhost:3306/quiz_app
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
3. Build and Run the Project
Using Maven:

4.Run (Spring Tool Suite)
./mvnw spring-boot:run
Or in your IDE, run the main class:
QuizApplication.java

_________________________________________________________________________________________________________________________________________________________________

🧑‍💻 Application Workflow
_____________________________________

📄 1. Landing Page (Index)
Accessed via / or /index

Shows Login Form

Contains "Register" link to navigate to registration



📝 2. User Registration
Form fields: username, email, password

URL: /register

On submission:

Data is validated

Saved to MySQL using Spring Data JPA

Redirects back to login page



🔐 3. User Login
Validates credentials against the database

On success:

Redirects to Welcome Page

On failure:

Shows error message on the login page


👋 4. Welcome Page
Shows a greeting and "Start Quiz" button


❓ 5. Quiz Page
Displays 10 pre-defined Java multiple-choice questions

Allows Next and Previous navigation

All questions are stored in the database or hardcoded in a service

At the end, user clicks Submit


🧮 6. Submit & Score
Application checks answers

Calculates the user's score

Saves the score and timestamp in the database as a new attempt

Displays:

Final score

Correct answers

Logout button



🔄 7. Logout
Clears session

Redirects to Login Page (index)

__________________________________________________________________________________________________________________________________________________________________________________________
📊 Features
User Registration & Authentication

Multiple quiz attempts

Persistent score history in MySQL

Thymeleaf frontend for UI

Easy navigation with Previous/Next

Display of correct answers on submission

🧾 Database Tables
Typical schema includes:

users
Fields: id, username, email, password

questions
Fields: id, question_text, options, correct_answer

quiz_attempts
Fields: id, user_id, score, timestamp


