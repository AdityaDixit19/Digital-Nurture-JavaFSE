# JDBC 05 - ResultSet

## Overview

`ResultSet` is a JDBC interface that stores the data returned by a SQL `SELECT` query. It acts as a cursor over the query result, allowing Java applications to navigate through rows and retrieve column values.

In this module, different ways of navigating and reading data from a `ResultSet` are explored, along with the use of `ResultSetMetaData` to obtain information about query results.

---

# Learning Objectives

After completing this module, I learned how to:

- Understand the purpose of `ResultSet`.
- Read data returned by a SQL query.
- Navigate through rows using cursor movement methods.
- Use scrollable `ResultSet` objects.
- Retrieve column information using `ResultSetMetaData`.
- Differentiate between data and metadata.

---

# ResultSet Workflow

```text
Java Application
        │
        ▼
Statement.executeQuery()
        │
        ▼
MySQL Database
        │
        ▼
Query Result
        │
        ▼
ResultSet
        │
        ▼
Cursor Navigation
        │
        ▼
Retrieve Column Values
```

---

# Cursor Lifecycle

```text
Before First Row
        │
        ▼
next()
        │
        ▼
Row 1
        │
        ▼
Row 2
        │
        ▼
Row 3
        │
       ...
        │
        ▼
Last Row
        │
        ▼
next()
        │
        ▼
After Last Row
```

---

# Examples Implemented

## 1. Forward ResultSet

Executed:

```sql
SELECT * FROM students;
```

Learned:

- `executeQuery()`
- `ResultSet`
- `next()`
- `getInt()`
- `getString()`

---

## 2. Scrollable ResultSet

Created a scrollable `ResultSet` using:

```java
Statement statement = connection.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY
);
```

Cursor navigation methods practiced:

- `first()`
- `last()`
- `previous()`
- `beforeFirst()`
- `absolute()`
- `relative()`

---

## 3. ResultSetMetaData

Retrieved metadata such as:

- Number of columns
- Column names
- Column types
- Table names
- Nullable information

---

# Important ResultSet Methods

| Method | Purpose |
|---------|---------|
| `next()` | Move to the next row |
| `first()` | Move to the first row |
| `last()` | Move to the last row |
| `previous()` | Move to the previous row |
| `beforeFirst()` | Move before the first row |
| `afterLast()` | Move after the last row |
| `absolute(int)` | Jump to a specific row |
| `relative(int)` | Move relative to the current row |
| `getInt()` | Read integer values |
| `getString()` | Read string values |

---

# ResultSetMetaData Methods

| Method | Purpose |
|---------|---------|
| `getColumnCount()` | Returns total number of columns |
| `getColumnName()` | Returns column name |
| `getColumnLabel()` | Returns alias (if present) |
| `getColumnTypeName()` | Returns SQL data type |
| `getTableName()` | Returns table name |
| `isNullable()` | Checks whether column accepts NULL values |

---

# Key Concepts Learned

- A `ResultSet` stores the result of a SQL `SELECT` query.
- A newly created `ResultSet` places the cursor **before the first row**.
- `next()` both moves the cursor and returns whether another row exists.
- `getXXX()` methods read values from the current row only.
- Scrollable `ResultSet` objects support random cursor movement.
- `ResultSetMetaData` provides information about the structure of the returned data instead of the data itself.

---

# Best Practices

- Use `try-with-resources` for automatic resource management.
- Always call `next()` before reading data.
- Prefer column names over column indexes for readability.
- Close `ResultSet`, `Statement`, and `Connection` after use.
- Use scrollable `ResultSet` only when required.

---

# Common Mistakes

- Reading data before calling `next()`.
- Assuming cursor starts at the first row.
- Using column index `0` (JDBC indexes start from `1`).
- Forgetting to close JDBC resources.
- Using scrollable `ResultSet` unnecessarily.

---

# Industry Notes

- Most enterprise applications use forward-only `ResultSet` because it is faster and consumes fewer resources.
- Scrollable `ResultSet` is mainly used in desktop applications, reporting tools, and legacy JDBC applications.
- `ResultSetMetaData` is widely used in SQL editors, database administration tools, reporting frameworks, and dynamic data export utilities.

---

# Summary

This module focused on processing data returned from SQL queries using JDBC's `ResultSet`. Cursor navigation, data retrieval, and metadata exploration were covered to understand how Java applications interact with query results. These concepts are fundamental for building JDBC applications that read and process database records efficiently.