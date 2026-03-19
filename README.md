# Java OOP Fundamentals – Encapsulation Exercises

This repository contains a series of Java exercises focused on **Object-Oriented Programming (OOP)**, specifically emphasizing **Encapsulation**, **Constructors**, and **Class Relationships**.

## 📌 Project Structure
The project is organized into packages by exercise:
- `exercise_1`: Bank Account management.
- `exercise_2`: Customer data handling.
- `exercise_3`: Student information system.
- `exercise_4`: Product catalog items.
- `exercise_5`: Order processing and collections.

---

## 🛠 Core Concepts Covered
*   **Private Fields**: Restricting direct access to data.
*   **Accessors (Getters/Setters)**: Providing controlled access and data validation.
*   **Method Overloading**: Using multiple constructors for flexible object creation.
*   **Aggregation**: Managing collections of objects (Orders containing Products).

---

## 📝 Exercise Overview

### Exercise 1: Bank Account
Focuses on managing financial data with safety checks (e.g., preventing negative withdrawals).
- **Methods**: `deposit(double)`, `withdraw(double)`, `getAccountInfo()`.

### Exercise 2: Customer
Demonstrates basic data encapsulation for personal identity.
- **Fields**: `customerId`, `name`, `email`.

### Exercise 3: Student
Manages academic profiles with age and name validation.
- **Fields**: `studentId`, `name`, `age`, `major`.

### Exercise 4: Product
Creates a blueprint for items in a store with price protection.
- **Fields**: `productId`, `name`, `price`.

### Exercise 5: Order (Aggregation)
Demonstrates the "Has-A" relationship where an `Order` manages a `List<Product>`.
- **Key Methods**: `addProduct()`, `calculateTotal()`.

---

## 📊 UML Class Diagrams

### Exercises 1-4 (Basic Classes)
```mermaid
classDiagram
    class BankAccount {
        - String accountHolder
        - double balance
        + deposit(amount)
        + withdraw(amount)
    }
    class Customer {
        - int customerId
        - String name
        - String email
    }
    class Student {
        - int studentId
        - String name
        - int age
    }
    class Product {
        - String productId
        - String name
        - double price
    }
