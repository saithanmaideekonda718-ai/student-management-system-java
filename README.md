# Student Management System (Java + MySQL)

## Overview
The Student Management System is a console-based CRUD application developed using Java and MySQL. It allows users to manage student records efficiently using JDBC for database connectivity. This project demonstrates core software development concepts including Object-Oriented Programming, database integration, and layered architecture using a DAO pattern.

## Features
- Add a new student
- View all students
- Search student by ID
- Update student marks
- Delete student records
- Menu-driven interactive console interface

## Tech Stack
- Java
- JDBC (Java Database Connectivity)
- MySQL
- OOP (Object-Oriented Programming)

## Project Structure
StudentManagementSystem
- Student.java (Model class)
- DBConnection.java (Database connection setup)
- StudentDAO.java (Data Access Layer)
- Main.java (Application entry point)

## Database Setup
Create the database and table using the following SQL commands:

CREATE DATABASE studentdb;
USE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    branch VARCHAR(50),
    marks DOUBLE
);

## How to Run

1. Ensure MySQL Server is running.
2. Update your MySQL root password in DBConnection.java.
3. Compile the project using:

javac -cp ".;lib/mysql-connector-j-9.6.0.jar" *.java

4. Run the application using:

java -cp ".;lib/mysql-connector-j-9.6.0.jar" Main

## Learning Outcomes
- Implemented CRUD operations using SQL
- Established database connectivity using JDBC
- Applied OOP principles for clean code design
- Structured project using separation of concerns

## Author
Sai Thanmai Deekonda
