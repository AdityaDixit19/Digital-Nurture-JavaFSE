# JDBC 03 - Statement

## Overview

The `Statement` interface is used to execute static SQL queries in JDBC. It is created using an active `Connection` object and allows Java applications to perform CRUD operations on a relational database.

**Database Used:** MySQL (`univ1`)

---



## Statement Workflow

```text
DriverManager
      │
      ▼
Connection
      │
createStatement()
      │
      ▼
Statement
      │
      ├───────────────┐
      │               │
executeQuery()   executeUpdate()
      │               │
      ▼               ▼
 ResultSet      Rows Affected
```

---

## Methods Covered

| Method | Purpose | Return Type |
|--------|---------|-------------|
| `createStatement()` | Creates a Statement object | `Statement` |
| `executeQuery()` | Executes `SELECT` queries | `ResultSet` |
| `executeUpdate()` | Executes `INSERT`, `UPDATE`, `DELETE`, DDL | `int` |

---

## Examples Implemented

### 1. Select Records

```sql
SELECT * FROM students;
```

- Created a `Statement`
- Executed `executeQuery()`
- Retrieved records using `ResultSet`

---

### 2. Insert Record

```sql
INSERT INTO students VALUES (16,'Amit','Pune',20);
```

- Executed using `executeUpdate()`
- Learned that it returns the number of affected rows.
- Observed `SQLIntegrityConstraintViolationException` when inserting a duplicate primary key.

---

### 3. Update Record

```sql
UPDATE students
SET city='Agra'
WHERE roll=1;
```

- Updated an existing record.
- Verified the returned affected row count.

---

### 4. Delete Record

```sql
DELETE FROM students
WHERE roll=16;
```

- Deleted a record.
- Verified the number of affected rows.

---

## Key Concepts Learned

- `Statement` is created from a `Connection`.
- SQL queries are sent to the database through a `Statement`.
- `executeQuery()` is used only for `SELECT` statements.
- `executeUpdate()` is used for `INSERT`, `UPDATE`, `DELETE`, and DDL statements.
- `ResultSet` stores rows returned by a query.
- `executeUpdate()` returns the number of rows affected.

---

## Limitations of Statement

- SQL is built using string concatenation.
- Vulnerable to SQL Injection.
- SQL is parsed and compiled by the database on every execution.
- Not recommended for dynamic user input.

---
## Summary

This module demonstrated how to execute SQL statements using JDBC's `Statement` interface. CRUD operations were performed using MySQL, query results were processed with `ResultSet`, and the limitations of `Statement` were explored. These concepts provide the foundation for the next module on `PreparedStatement`.