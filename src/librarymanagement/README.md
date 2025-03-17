# Library Management System

## Project Overview

The Library Management System is a Java-based console application designed to demonstrate core Java concepts such as Object-Oriented Programming (OOP), including inheritance, interfaces, abstract classes, method overriding, and CRUD (Create, Read, Update, Delete) operations. It simulates a simple library system where an admin can manage books, and members can borrow and return books.

## Features

- CRUD Operations: Add, update, delete, and view books in the library.
- Admin Functionality: Admins can manage books, including adding new ones, updating details, and removing books.
- Member Functionality*: Members can borrow and return books.
- OOP Concepts: Demonstrates usage of interfaces, abstract classes, inheritance, and method overriding.

## Technologies Used

- Java: Core Java concepts and libraries.
- OOP: Object-Oriented Programming principles are the foundation of this project.

## How to Run the Project

### Prerequisites

- Install Java Development Kit (JDK) 8 or above.
- Use a Java IDE such as IntelliJ IDEA, Eclipse, or Visual Studio Code, or use a command-line interface.



### Project Structure :

LibraryManagementSystem/
└── src/
    └── librarymanagement/
        ├── CrudOperations.java  # Interface for CRUD operations
        ├── Book.java            # Abstract class for books
        ├── TextBook.java        # Concrete class extending Book
        ├── Library.java         # Class implementing CrudOperations
        ├── User.java            # Abstract class for users
        ├── Admin.java           # Concrete class extending User
        ├── Member.java          # Concrete class extending User
        └── LibrarySystem.java   # Main class for the application



### Example Usage

1. Admin can add, update, and delete books in the library:

Admin accessing library...
Book added: Java Programming
Book added: Data Structures
Book updated: Advanced Java
Book deleted with ID: 2

2. Member can borrow and return books:

Member Ashii is accessing the library.
Member Ashii borrowed the book: Java Programming
Member Ashii returned the book: Java Programming


### License
This project is licensed under the MIT License. You are free to use, modify, and distribute this code as per the terms of the license.









