# random-quote-generator
Quote of the Day Web Application
A simple web application that displays a random quote of the day and allows users to search for quotes by author. Built using Java Servlets, MySQL, HTML, CSS, and JavaScript.

Features
Random Quote: Displays a random quote from the database.

Search by Author: Allows users to search for quotes by entering an author's name.

Responsive Design: The user interface is responsive and works on all devices.

Attractive Background: Includes a visually appealing background image.

Technologies Used
Backend: Java Servlets, MySQL

Frontend: HTML, CSS, JavaScript

Database: MySQL

Web Server: Apache Tomcat

Project Structure
Copy
QuoteOfTheDay/
├── src/
│   ├── util/
│   │   └── DBUtil.java
│   └── servlets/
│       ├── RandomQuoteServlet.java
│       └── SearchQuoteServlet.java
├── WebContent/
│   ├── index.html
│   ├── 1.css
│   ├── 1.js
│   ├── images/
│   │   └── background.jpg
│   ├── WEB-INF/
│   │   ├── lib/
│   │   │   └── mysql-connector-java-x.x.x.jar
│   │   └── web.xml
├── README.md
└── .gitignore
Setup Instructions
1. Prerequisites
Java Development Kit (JDK): Install JDK 8 or later.

MySQL: Install MySQL and set up the database.

Apache Tomcat: Install and configure Tomcat for deploying the application.

IDE: Use Eclipse, IntelliJ IDEA, or any IDE of your choice.

2. Database Setup
Create a MySQL database named quote_db:

sql
Copy
CREATE DATABASE quote_db;
USE quote_db;
Create a table for quotes:

sql
Copy
CREATE TABLE quotes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    quote TEXT NOT NULL,
    author VARCHAR(100) NOT NULL
);
Insert sample data:

sql
Copy
INSERT INTO quotes (quote, author) VALUES
('The only limit to our realization of tomorrow is our doubts of today.', 'Franklin D. Roosevelt'),
('Do what you can, with what you have, where you are.', 'Theodore Roosevelt'),
('The best way to predict the future is to invent it.', 'Alan Kay');
3. Configure the Project
Clone the repository:

bash
Copy
git clone (https://github.com/Madhumadineni123/random-quote-generator)
Open the project in your IDE.

Add the MySQL Connector/J JAR file to the WebContent/WEB-INF/lib folder.

Update the database credentials in DBUtil.java:

java
Copy
private static final String URL = "jdbc:mysql://localhost:3306/quote_db?serverTimezone=UTC";
private static final String USER = "root"; // Replace with your MySQL username
private static final String PASSWORD = "your_password"; // Replace with your MySQL password
4. Deploy the Application
Build the project and deploy it on Apache Tomcat.

Start the Tomcat server and access the application at:

Immadisetty Lokesh:immedisettylokesh123@gmail.com



Enjoy using the Quote of the Day web application! 😊
