# JDBC Architecture

## Overview

Java Database Connectivity (JDBC) is a standard Java API that enables Java applications to communicate with relational database management systems (RDBMS). It provides a set of interfaces and classes that allow Java programs to execute SQL statements, retrieve data, and perform database operations.

Before writing any JDBC program, it is essential to understand the components involved and how they interact with each other.

# JDBC Workflow

```
+------------------+
| Java Application |
+------------------+
          |
          | Uses JDBC Driver
          v
+------------------+
|    Connection    |
+------------------+
          |
          | Creates
          v
+------------------+
|    Statement     |
+------------------+
          |
          | Executes SQL Query
          v
+------------------+
| Database Program |
| (MySQL, Oracle,  |
| SQL Server, etc.)|
+------------------+
          |
          | Returns Data
          v
+------------------+
|    JDBC Driver   |
+------------------+
          |
          | Converts Data Types
          v
+------------------+
|    ResultSet     |
+------------------+
```

---

# Components of JDBC

A JDBC program consists of four major components.

- Driver
- Connection
- Statement
- ResultSet

Each component has a specific responsibility during communication between a Java application and the database.

---

# 1. Driver

The JDBC Driver acts as a bridge between the Java application and the database.

It performs two important tasks.

### Establishes Connection

The driver provides the functionality required to establish communication between the Java application and the database.

Without a compatible driver, a Java application cannot communicate with the database.

### Data Type Conversion

Java and databases use different data types.

Examples:

| Java | Database |
|------|----------|
| int | INTEGER |
| float | FLOAT |
| String | TEXT |

The driver converts Java data types into database-compatible data types while sending data to the database.

Similarly, it converts database values into Java-compatible data types when retrieving results.

---

# 2. Connection

A Connection object represents an active connection between the Java application and the database.

After establishing a connection through the driver, the Java application communicates with the database using this connection.

The Connection class is available in the `java.sql` package.

---

# 3. Statement

A Statement object is created using the Connection object.

It is responsible for sending SQL statements to the database.

Examples of SQL statements include:

- SELECT
- INSERT
- UPDATE
- DELETE

The database executes these SQL statements and returns the result.

---

# 4. ResultSet

After executing a SELECT query, the database returns the result.

The JDBC driver converts the returned data into Java-compatible form.

The result is stored inside a ResultSet object.

A ResultSet represents the table of records returned by the database.

---

# Complete Execution Flow

1. The Java application loads a JDBC Driver.
2. The Driver establishes a connection with the database.
3. A Connection object is created.
4. A Statement object is created using the Connection.
5. SQL queries are executed through the Statement.
6. The database processes the SQL query.
7. The Driver converts database data into Java-compatible data.
8. The result is returned as a ResultSet.

---

# JDBC Driver Types

Java supports four types of JDBC drivers.

## Type 1 Driver

**Name:** JDBC-ODBC Bridge Driver

- Uses Microsoft's ODBC layer.
- Java communicates with ODBC.
- ODBC communicates with the database.
- Partially implemented in Java.

---

## Type 2 Driver

**Name:** Native API Driver

- Uses the native API provided by the database.
- Partially written in Java.
- Partially uses native libraries supplied by the database vendor.

---

## Type 3 Driver

**Name:** Java Network Protocol Driver

- Java communicates with a middleware server.
- The middleware server communicates with the database.
- Java does not communicate directly with the database.
- Pure Java driver.

---

## Type 4 Driver

**Name:** Thin Driver

- Java communicates directly with the database.
- Completely written in Java.
- Does not require ODBC or native libraries.

---

# Why Different Drivers Are Required

Every database has its own implementation.

Examples include:

- Oracle
- MySQL
- SQL Server
- SQLite

Each database requires a compatible driver so that Java can communicate with it correctly.

---

# Key Points

- JDBC enables Java applications to communicate with databases.
- Communication with databases is performed using SQL.
- Driver establishes communication between Java and the database.
- Driver performs data type conversion.
- Connection represents an active database connection.
- Statement executes SQL queries.
- ResultSet stores the records returned by SELECT queries.
- Java supports four types of JDBC drivers.

---

# Summary

The JDBC architecture consists of four primary components:

- Driver
- Connection
- Statement
- ResultSet

The driver establishes communication and performs data type conversion. The connection enables interaction with the database, the statement executes SQL commands, and the result set stores the data returned by the database.

Understanding these components is essential before writing any JDBC program.