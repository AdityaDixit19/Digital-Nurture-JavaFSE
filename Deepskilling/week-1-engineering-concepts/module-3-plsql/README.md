# Module 3 - PL/SQL Programming

This module focuses on the fundamentals of **Oracle PL/SQL** by implementing real-world banking scenarios. The exercises demonstrate how procedural programming concepts can be integrated with SQL to automate business operations inside the database.

## Learning Objectives

- Understand the basics of PL/SQL
- Write anonymous PL/SQL blocks
- Implement control structures
- Create and execute stored procedures
- Perform CRUD operations using PL/SQL
- Work with cursors and loops
- Use conditional statements
- Display output using `DBMS_OUTPUT`
- Manage transactions using `COMMIT`

---

# Exercise 1 - Control Structures

## Overview

This exercise demonstrates the use of procedural control structures in PL/SQL such as loops, conditional statements, and implicit cursors.

### Concepts Covered

- Anonymous PL/SQL Blocks
- `BEGIN ... END`
- Implicit Cursor (`FOR ... IN`)
- `IF...THEN...ELSE`
- `LOOP`
- SQL Statements inside PL/SQL
- Date Functions
- Transaction Control (`COMMIT`)
- `DBMS_OUTPUT.PUT_LINE`

---

## Scenario 1 - Loan Interest Discount

### Objective

Apply a **1% interest rate discount** for customers whose age is greater than **60 years**.

### Concepts Used

- Cursor FOR Loop
- JOIN
- `MONTHS_BETWEEN`
- Conditional Statement
- UPDATE Statement

---

## Scenario 2 - VIP Customer Promotion

### Objective

Promote customers to **VIP** if their account balance exceeds **10,000**.

### Concepts Used

- FOR Loop
- IF Condition
- UPDATE Statement
- COMMIT
- DBMS_OUTPUT

---

## Scenario 3 - Loan Due Reminder

### Objective

Display reminder messages for customers whose loans are due within the next **30 days**.

### Concepts Used

- Date Arithmetic
- JOIN
- Cursor Loop
- DBMS_OUTPUT
- TO_CHAR()

---

# Exercise 3 - Stored Procedures

## Overview

This exercise introduces reusable PL/SQL stored procedures for automating banking operations.

### Concepts Covered

- Stored Procedures
- Parameters
- Procedure Execution
- Conditional Logic
- SQL inside Procedures
- Transaction Management

---

## Scenario 1 - Process Monthly Interest

### Objective

Create a stored procedure that applies **1% monthly interest** to all **Savings Accounts**.

### Concepts Used

- CREATE PROCEDURE
- UPDATE
- COMMIT
- Procedure Execution

---

## Scenario 2 - Employee Bonus

### Objective

Create a stored procedure that updates employee salaries based on the **department** and **bonus percentage** passed as parameters.

### Concepts Used

- IN Parameters
- UPDATE Statement
- Procedure Invocation
- Parameterized Procedures

---

## Scenario 3 - Fund Transfer

### Objective

Transfer money between two accounts after validating that the source account has sufficient balance.

### Concepts Used

- Parameters
- Variable Declaration
- SELECT INTO
- IF Condition
- Multiple UPDATE Statements
- Transaction Control

---

# Database Schema

The following tables were used throughout the exercises:

- Customers
- Accounts
- Loans
- Transactions
- Employees

---

# Skills Gained

- Oracle PL/SQL Fundamentals
- Writing Anonymous Blocks
- Control Structures
- Stored Procedures
- Cursor Handling
- Conditional Programming
- SQL Integration with PL/SQL
- Transaction Management
- Banking Business Logic Implementation

---

# Outcome

After completing this module, I gained hands-on experience in writing PL/SQL programs using control structures and stored procedures to solve practical banking scenarios. These exercises strengthened my understanding of Oracle database programming and procedural SQL concepts.