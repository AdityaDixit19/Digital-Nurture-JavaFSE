# JDBC 02 - Database Connection

## Overview

A database connection is the first step in any JDBC application. Before a Java program can execute SQL queries, it must establish a connection with the database server.

In this module, a connection is established between a Java application and a MySQL database using JDBC.


# JDBC Connection Architecture

```text
Java Application
        │
        ▼
JDBC API (java.sql)
        │
        ▼
MySQL JDBC Driver
        │
        ▼
MySQL Server
        │
        ▼
Database (univ1)
```

---

# Connection Workflow

```text
Java Program
      │
      ▼
DriverManager.getConnection()
      │
      ▼
MySQL JDBC Driver
      │
      ▼
localhost:3306
      │
      ▼
Authentication
(username + password)
      │
      ▼
Connection Object Created
      │
      ▼
Execute SQL (next module)
      │
      ▼
Close Connection
```

---

# Understanding the Connection URL

Example:

```text
jdbc:mysql://localhost:3306/univ1
```

| Part | Meaning |
|------|---------|
| jdbc | JDBC protocol |
| mysql | Database type |
| localhost | Database server |
| 3306 | MySQL default port |
| univ1 | Database name |

---

# Understanding getConnection()

```java
Connection connection =
DriverManager.getConnection(url, username, password);
```

This statement performs the following steps:

1. Reads the database URL.
2. Locates the MySQL JDBC Driver.
3. Connects to the MySQL Server.
4. Sends the username and password.
5. Authenticates the user.
6. Creates a `Connection` object.
7. Returns control to the Java program.

If authentication fails, a `SQLException` is thrown.

---

# Code Explanation

### URL

Identifies the database server and database name.

### Username

Represents the MySQL user account.

### Password

Authenticates the user against the MySQL server.

### Connection Object

Represents an active session between the Java application and the database.

### close()

Releases the database connection and associated resources.

---

# Program Output

Expected output:

```text
Database connected successfully.
Connection closed.
```

---



---

#  Notes

- Every JDBC application begins by establishing a database connection.
- Enterprise applications rarely create a new connection for every request.
- Most production systems use **connection pools** (such as HikariCP) to reuse connections efficiently.
- Database credentials are usually stored in configuration files or environment variables rather than in source code.

---
# Best Practices

- Close every connection after use.
- Handle `SQLException` appropriately.
- Never expose database credentials in source code.
- Use Maven to manage JDBC dependencies.
- Verify the connection before executing SQL statements.

# Summary

In this module, a Java application successfully established a connection with a MySQL database using JDBC. The role of the JDBC Driver, the `DriverManager`, and the `Connection` interface was explored in detail. This connection forms the foundation for executing SQL statements, which will be covered in the next module.