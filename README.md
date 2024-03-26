# Library System Management

## Project Overview

This Library System Management project is a terminal-based Java application designed to streamline the management of a small library's operations. It facilitates the registration of users, the addition of books, and the management of loans and returns. The system also maintains records of book loans with date and time, allows users to look up books by title, author, or ISBN, and supports book loan and return functionalities.

## Features

- **User Registration:** Allows new users to register with the system.
- **Book Lookup:** Users can look up books by title, author, or ISBN.
- **Loan Management:** Users can borrow and return books, with the system keeping track of each transaction.
- **Loan History:** Maintains a history of all book loans and returns.

## Getting Started

### Prerequisites

Ensure you have the following installed:
- Java JDK 11 or higher

### Installation

1. Clone the repository to your local machine.
2. Navigate to the project directory.

### Running the Application

1. Compile the Java files:
   ```bash
   javac Main.java
   ```
2. Run the compiled application:
   ```bash
   java Main
   ```


### Usage
Upon running the application, users will be greeted with a menu prompting them to register or login. Once that is done, users can perform actions such as looking up books, borrowing, and returning books.

### File Structure
- **Main.java**: Entry point of the application. Initializes the system and starts the user interaction loop.
- **Books.java**: Defines the book object with title, author, and ISBN.
- **Books.txt**: Holds the Title, Author and ISBN of the books available in this library.
- **User.java**: Manages user information and registration.
- **UserHistory.java**: Stores User's activity such as loaning and returning a book.
- **Loan.java**: Handles book loans and returns.
- **Date.java**: Utility class to get the current date in a specified format.
- **FileReader.java**: Reads books information from 'Books.txt' file and loads it into the system.
- **UserBook.java**: Links books to users for loan and return operations.
- **LookUpAuthor.java, LookUpTitle.java, LookUpISBN.java, FinalLookUp.java**: Utility classes for book lookup operations.

### Contribution
Contributions are welcome! If you'd like to improve this Library Management System, please fork the repository and submit a pull request.

### License
This project is open source and available under the MIT License.




