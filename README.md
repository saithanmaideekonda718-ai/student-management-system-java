# Student Management System

## Description
A console-based CRUD application built using Java and MySQL to manage student records.

## Features
- Add student
- View all students
- Search student by ID
- Update student marks
- Delete student

## Technologies Used
- Java
- JDBC
- MySQL
- OOP Concepts

## Database
Table: students
Fields:
- id (INT, Primary Key)
- name (VARCHAR)
- branch (VARCHAR)
- marks (DOUBLE)

## How to Run
Compile:
javac -cp ".;lib/mysql-connector-j-9.6.0.jar" *.java

Run:
java -cp ".;lib/mysql-connector-j-9.6.0.jar" Main
