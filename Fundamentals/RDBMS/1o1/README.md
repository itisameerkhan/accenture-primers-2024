# 📍 Overview

| S.no. | Contents |
| --- | --- |
| 1. | [Introduction](#⭐-introduction) |
| 2. | [Relational Database](#⭐-relational-database) |
| 3. | [SQL vs NoSQL](#⭐-sql-vs-nosql)
| 4. | [SQL Keywords](#⭐-sql-keywords)
| 5. | [Datatypes](#⭐-datatypes)
| 6. | [Operators](#⭐-operators)
| 7. | [SELECT](#⭐-select) |

## ⭐ Introduction

SQL, or Structured Query Language, is a standardized language specifically designed to manage data in relational databases. It allows you to retrieve, insert, update, and delete data, as well as define the structure of the database itself.  SQL is essential for various applications, from web development and data analysis to business intelligence.

SQL consists of several components, each serving their own unique purpose in database communication:

* **Queries**: This is the component that allows you to retrieve data from a database. The `SELECT` statement is most commonly used for this purpose.

* **Data Definition Language (DDL)**: It lets you to create, alter, or delete databases and their related objects like tables, views, etc. Commands include `CREATE`, `ALTER`, `DROP`, and `TRUNCATE`.

* **Data Manipulation Language (DML)**: It lets you manage data within database objects. These commands include `SELECT`, `INSERT`, `UPDATE`, and `DELETE`.

* **Data Control Language (DCL)**: It includes commands like `GRANT` and `REVOKE`, which primarily deal with rights, permissions and other control-level management tasks for the database system.


* **Queries**: This is the component that allows you to retrieve data from a database. The `SELECT` statement is most commonly used for this purpose.

* **Data Definition Language (DDL)**: It lets you to create, alter, or delete databases and their related objects like tables, views, etc. Commands include `CREATE`, `ALTER`, `DROP`, and `TRUNCATE`.

* **Data Manipulation Language (DML)**: It lets you manage data within database objects. These commands include `SELECT`, `INSERT`, `UPDATE`, and `DELETE`.

* **Data Control Language (DCL)**: It includes commands like `GRANT` and `REVOKE`, which primarily deal with rights, permissions and other control-level management tasks for the database system.

[🔝 Back to top](#📍-overview)

---

## ⭐ Relational Database

A relational database is a type of database management system (DBMS) that stores and organizes data in a structured way, using a set of tables (relations) with rows (records) and columns (fields). 

1. **Tables**: Data is organized into tables, where each table represents an entity or concept. For example, you might have a "customers" table, an "orders" table, and a "products" table.

2. **Rows and Columns**: Each table consists of rows (records) and columns (fields). Rows represent individual instances or occurrences of the entity, while columns represent the attributes or properties of that entity.

3. **Keys**: Keys are used to uniquely identify each row in a table. There are two main types of keys:
   - **Primary Key**: A column or a combination of columns that uniquely identifies each row in a table.
   - **Foreign Key**: A column or a combination of columns that refers to the primary key of another table, establishing a relationship between the two tables.

4. **Relationships**: Tables in a relational database can be related to each other through foreign keys. These relationships can be one-to-one, one-to-many, or many-to-many.

5. **Structured Query Language (SQL)**: SQL is the standard language used to interact with relational databases. It allows you to create, modify, and query the database, as well as manage data integrity and security.

6. **Data Integrity**: Relational databases enforce data integrity rules, such as ensuring that data is accurate, consistent, and follows defined constraints (e.g., primary key uniqueness, foreign key references).

7. **Normalization**: Normalization is the process of organizing data in a database to reduce redundancy and improve data integrity. It involves breaking down data into smaller tables and defining relationships between them.

8. **ACID Properties**: Relational databases typically implement the ACID properties (Atomicity, Consistency, Isolation, Durability) to ensure transaction reliability and data integrity.

| employee_id | first_name | last_name | email |
| --- | --- | --- | --- |
| 1 | john | doe | johndoe@example.com |
| 2 | jack | doe | jackdoe@example.com |
| 3 | rose | doe | rosedoe@example.com |

[🔝 Back to top](#📍-overview)

---

## ⭐ SQL vs NoSQL

### ⚡ SQL Databases

SQL (Structured Query Language) databases are also known as relational databases. They have a predefined schema, and data is stored in tables consisting of rows and columns. SQL databases follow the ACID (Atomicity, Consistency, Isolation, Durability) properties to ensure reliable transactions. Some popular SQL databases include MySQL, PostgreSQL, and Microsoft SQL Server.

Advantages of SQL databases:

* **Predefined schema**: Ideal for applications with a fixed structure.

* **ACID transactions**: Ensures data consistency and reliability.

* **Support for complex queries**: Rich SQL queries can handle complex data relationships and aggregation operations.

* **Scalability**: Vertical scaling by adding more resources to the server (e.g., RAM, CPU).

Limitations of SQL databases:

* **Rigid schema**: Data structure updates are time-consuming and can lead to downtime.

* **Scaling**: Difficulties in horizontal scaling and sharding of data across multiple servers.

* **Not well-suited for hierarchical data**: Requires multiple tables and JOINs to model tree-like structures.

### ⚡ NoSQL Databases

NoSQL (Not only SQL) databases refer to non-relational databases, which don’t follow a fixed schema for data storage. Instead, they use a flexible and semi-structured format like JSON documents, key-value pairs, or graphs. MongoDB, Cassandra, Redis, and Couchbase are some popular NoSQL databases.

Advantages of NoSQL databases:

* **Flexible schema**: Easily adapts to changes without disrupting the application.

* **Scalability**: Horizontal scaling by partitioning data across multiple servers (sharding).

* **Fast**: Designed for faster read and writes, often with a simpler query language.

* **Handling large volumes of data**: Better suited to managing big data and real-time applications.

* **Support for various data structures**: Different NoSQL databases cater to various needs, like document, graph, or key-value stores.

Limitations of NoSQL databases:

* **Limited query capabilities**: Some NoSQL databases lack complex query and aggregation support or use specific query languages.

* **Weaker consistency**: Many NoSQL databases follow the BASE (Basically Available, Soft state, Eventual consistency) properties that provide weaker consistency guarantees than ACID-compliant databases.

[🔝 Back to top](#📍-overview)

---

## ⭐ SQL Keywords

### ⚡ Data Definition Language (DDL) Keywords

- **CREATE**: Used to create databases, tables, indexes, views, and other objects.
  ```sql
  CREATE TABLE customers (
      customer_id INT PRIMARY KEY,
      customer_name VARCHAR(50),
      email VARCHAR(50)
  );
  ```

- **ALTER**: Used to modify existing database objects like tables.
  ```sql
  ALTER TABLE customers ADD COLUMN phone VARCHAR(15);
  ```

- **DROP**: Used to delete databases, tables, views, or other objects.
  ```sql
  DROP TABLE customers;
  ```

- **TRUNCATE**: Used to delete all records from a table, but not the table itself.
  ```sql
  TRUNCATE TABLE customers;
  ```

### Data Manipulation Language (DML) Keywords
- **SELECT**: Used to retrieve data from one or more tables.
  ```sql
  SELECT customer_name, email FROM customers;
  ```

- **INSERT**: Used to add new rows to a table.
  ```sql
  INSERT INTO customers (customer_id, customer_name, email) VALUES (1, 'John Doe', 'john.doe@example.com');
  ```

- **UPDATE**: Used to modify existing rows in a table.
  ```sql
  UPDATE customers SET email = 'john.new@example.com' WHERE customer_id = 1;
  ```

- **DELETE**: Used to delete rows from a table.
  ```sql
  DELETE FROM customers WHERE customer_id = 1;
  ```

### Data Control Language (DCL) Keywords
- **GRANT**: Used to give users access privileges to the database.
  ```sql
  GRANT SELECT, INSERT ON database_name.* TO 'user'@'host';
  ```

- **REVOKE**: Used to take back privileges granted to users.
  ```sql
  REVOKE INSERT ON database_name.* FROM 'user'@'host';
  ```

### Transaction Control Language (TCL) Keywords
- **START TRANSACTION**: Begins a new transaction.
  ```sql
  START TRANSACTION;
  ```

- **COMMIT**: Commits the current transaction, making all changes permanent.
  ```sql
  COMMIT;
  ```

- **ROLLBACK**: Rolls back the current transaction, undoing all changes.
  ```sql
  ROLLBACK;
  ```

### Query Clauses and Keywords
- **WHERE**: Filters records based on a specified condition.
  ```sql
  SELECT * FROM customers WHERE customer_id = 1;
  ```

- **ORDER BY**: Sorts the result set of a query by one or more columns.
  ```sql
  SELECT * FROM customers ORDER BY customer_name ASC;
  ```

- **GROUP BY**: Groups rows that have the same values in specified columns into summary rows.
  ```sql
  SELECT COUNT(customer_id), country FROM customers GROUP BY country;
  ```

- **HAVING**: Filters groups based on a specified condition.
  ```sql
  SELECT COUNT(customer_id), country FROM customers GROUP BY country HAVING COUNT(customer_id) > 5;
  ```

- **JOIN**: Combines rows from two or more tables, based on a related column.
  - **INNER JOIN**: Returns records that have matching values in both tables.
    ```sql
    SELECT customers.customer_name, orders.order_id
    FROM customers
    INNER JOIN orders ON customers.customer_id = orders.customer_id;
    ```
  - **LEFT JOIN**: Returns all records from the left table and the matched records from the right table.
    ```sql
    SELECT customers.customer_name, orders.order_id
    FROM customers
    LEFT JOIN orders ON customers.customer_id = orders.customer_id;
    ```
  - **RIGHT JOIN**: Returns all records from the right table and the matched records from the left table.
    ```sql
    SELECT customers.customer_name, orders.order_id
    FROM customers
    RIGHT JOIN orders ON customers.customer_id = orders.customer_id;
    ```
  - **FULL JOIN**: Returns all records when there is a match in either left or right table.
    ```sql
    SELECT customers.customer_name, orders.order_id
    FROM customers
    FULL OUTER JOIN orders ON customers.customer_id = orders.customer_id;
    ```

- **UNION**: Combines the result sets of two or more SELECT statements.
  ```sql
  SELECT customer_id, customer_name FROM customers_usa
  UNION
  SELECT customer_id, customer_name FROM customers_uk;
  ```


[🔝 Back to top](#📍-overview)

---

## ⭐ Datatypes

MySQL supports a variety of data types categorized into several groups: Numeric, Date and Time, String (or Text), Spatial, and JSON data types. Here’s a comprehensive list of MySQL data types:

### Numeric Data Types

#### Integer Types
- **TINYINT**: A very small integer. Range: -128 to 127 or 0 to 255 (unsigned).
- **SMALLINT**: A small integer. Range: -32,768 to 32,767 or 0 to 65,535 (unsigned).
- **MEDIUMINT**: A medium-sized integer. Range: -8,388,608 to 8,388,607 or 0 to 16,777,215 (unsigned).
- **INT** or **INTEGER**: A standard integer. Range: -2,147,483,648 to 2,147,483,647 or 0 to 4,294,967,295 (unsigned).
- **BIGINT**: A large integer. Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 or 0 to 18,446,744,073,709,551,615 (unsigned).

#### Floating-Point Types
- **FLOAT**: A floating-point number. Typically used for approximate values.
- **DOUBLE**: A double-precision floating-point number. Also used for approximate values.

#### Fixed-Point Types
- **DECIMAL** or **NUMERIC**: A fixed-point number. Used for exact values, typically for monetary data.

### Date and Time Data Types
- **DATE**: A date value in 'YYYY-MM-DD' format.
- **TIME**: A time value in 'HH:MM:SS' format.
- **DATETIME**: A date and time combination in 'YYYY-MM-DD HH:MM:SS' format.
- **TIMESTAMP**: A timestamp value. 'YYYY-MM-DD HH:MM:SS' format, auto-updates.
- **YEAR**: A year value in 'YYYY' format.

### String Data Types
- **CHAR**: A fixed-length string. Maximum length of 255 characters.
- **VARCHAR**: A variable-length string. Maximum length of 65,535 characters.
- **BINARY**: A fixed-length binary string.
- **VARBINARY**: A variable-length binary string.
- **TEXT**: A large text field. Maximum length of 65,535 characters.
- **TINYTEXT**: A very small text field. Maximum length of 255 characters.
- **MEDIUMTEXT**: A medium-sized text field. Maximum length of 16,777,215 characters.
- **LONGTEXT**: A very large text field. Maximum length of 4,294,967,295 characters.
- **BLOB**: A binary large object that can hold a variable amount of data. Similar to TEXT types but for binary data.
- **TINYBLOB**: A very small BLOB. Maximum length of 255 bytes.
- **MEDIUMBLOB**: A medium-sized BLOB. Maximum length of 16,777,215 bytes.
- **LONGBLOB**: A large BLOB. Maximum length of 4,294,967,295 bytes.
- **ENUM**: An enumeration. A string object with a value chosen from a list of permitted values.
- **SET**: A set. A string object that can have zero or more values, each chosen from a list of permitted values.

### Spatial Data Types
- **GEOMETRY**: A type that can store geometry values of any type.
- **POINT**: A point in 2D space.
- **LINESTRING**: A line string in 2D space.
- **POLYGON**: A polygon in 2D space.
- **MULTIPOINT**: A collection of points.
- **MULTILINESTRING**: A collection of line strings.
- **MULTIPOLYGON**: A collection of polygons.
- **GEOMETRYCOLLECTION**: A collection of geometry objects.

### JSON Data Type
- **JSON**: Stores JSON (JavaScript Object Notation) data.



[🔝 Back to top](#📍-overview)

---

## ⭐ Operators

In MySQL, operators are used to specify conditions in SQL statements, perform arithmetic operations, compare values, and manipulate strings. Below is a list of commonly used operators in MySQL, categorized for easier understanding:

### Arithmetic Operators
These operators are used to perform mathematical operations.

| Operator | Description      | Example              |
|----------|------------------|----------------------|
| `+`      | Addition         | `SELECT 5 + 3;`      |
| `-`      | Subtraction      | `SELECT 5 - 3;`      |
| `*`      | Multiplication   | `SELECT 5 * 3;`      |
| `/`      | Division         | `SELECT 6 / 3;`      |
| `%`      | Modulus          | `SELECT 5 % 3;`      |

### Comparison Operators
These operators are used to compare two values.

| Operator | Description               | Example                  |
|----------|---------------------------|--------------------------|
| `=`      | Equal to                  | `SELECT * FROM users WHERE age = 30;` |
| `!=`     | Not equal to              | `SELECT * FROM users WHERE age != 30;` |
| `<>`     | Not equal to (alternate)  | `SELECT * FROM users WHERE age <> 30;` |
| `>`      | Greater than              | `SELECT * FROM users WHERE age > 30;` |
| `<`      | Less than                 | `SELECT * FROM users WHERE age < 30;` |
| `>=`     | Greater than or equal to  | `SELECT * FROM users WHERE age >= 30;` |
| `<=`     | Less than or equal to     | `SELECT * FROM users WHERE age <= 30;` |
| `BETWEEN`| Between a range           | `SELECT * FROM users WHERE age BETWEEN 20 AND 30;` |
| `IN`     | Match any value in a list | `SELECT * FROM users WHERE age IN (20, 25, 30);` |
| `LIKE`   | Search for a pattern      | `SELECT * FROM users WHERE name LIKE 'J%';` |
| `IS NULL`| Check for NULL value      | `SELECT * FROM users WHERE age IS NULL;` |

### Logical Operators
These operators are used to combine multiple conditions.

| Operator | Description               | Example                          |
|----------|---------------------------|----------------------------------|
| `AND`    | True if both conditions are true | `SELECT * FROM users WHERE age > 25 AND city = 'New York';` |
| `OR`     | True if any condition is true    | `SELECT * FROM users WHERE age > 25 OR city = 'New York';`  |
| `NOT`    | Reverses the condition's result | `SELECT * FROM users WHERE NOT age > 25;`                   |

### Bitwise Operators
These operators are used to perform bit-level operations.

| Operator | Description              | Example                |
|----------|--------------------------|------------------------|
| `&`      | Bitwise AND              | `SELECT 5 & 3;`        |
| `|`      | Bitwise OR               | `SELECT 5 | 3;`        |
| `^`      | Bitwise XOR              | `SELECT 5 ^ 3;`        |
| `~`      | Bitwise NOT              | `SELECT ~5;`           |
| `<<`     | Bitwise left shift       | `SELECT 5 << 1;`       |
| `>>`     | Bitwise right shift      | `SELECT 5 >> 1;`       |

### String Operators
These operators are used for string manipulation.

| Operator | Description              | Example                             |
|----------|--------------------------|-------------------------------------|
| `CONCAT` | Concatenates two or more strings | `SELECT CONCAT('Hello', ' World');` |
| `LENGTH` | Returns the length of a string  | `SELECT LENGTH('Hello');`            |
| `LOWER`  | Converts a string to lower case | `SELECT LOWER('Hello');`             |
| `UPPER`  | Converts a string to upper case | `SELECT UPPER('Hello');`             |
| `SUBSTRING` | Extracts a substring        | `SELECT SUBSTRING('Hello', 1, 2);`   |
| `REPLACE` | Replaces occurrences of a substring | `SELECT REPLACE('Hello World', 'World', 'MySQL');` |

### Assignment Operators
These operators are used to assign values to variables.

| Operator | Description              | Example                    |
|----------|--------------------------|----------------------------|
| `=`      | Assign a value           | `SET @a = 5;`              |
| `:=`     | Assign a value (alternate)| `SET @a := 5;`             |

[🔝 Back to top](#📍-overview)

---

## ⭐ 7. `SELECT`

The `SELECT` statement is used in SQL to pick out specific data from a database. In other words, it is used to select from the database what you would like to display. The syntax for the `SELECT` statement is fairly straightforward:

```sql
SELECT column(s)
FROM table
WHERE condition;
```

* `column(s)`: Enter the name(s) of the column(s) that you want to display.

* `table`: The name of the table from where you want to retrieve data.

* `WHERE`: Optional. This is a filter to display only the rows where this condition is true.


For instance, if you wanted to select all data from the “Customers” table, your query would look like this:

```sql
SELECT *
FROM Customers;
```

In the above code, the asterisk `*` denotes “all”. This will retrieve all of the data in the “Customers” table.

[🔝 Back to top](#📍-overview)

---

## ⭐ `INSERT`

The `INSERT` statement in SQL is used to add new rows of data to a table in the database. There are three forms of the INSERT statement: `INSERT INTO values`, `INSERT INTO set`, and `INSERT INTO select`.

### ⚡ `INSERT INTO` values

```sql
INSERT INTO table_name (column1, column2, column3, ...)
VALUES (value1, value2, value3, ...);`
```

### ⚡ `INSERT INTO` set

In this form, you’re able to insert data using the `SET` keyword. Here, you specify each column you want to insert data into, and then the data for that column.

```sql
INSERT INTO table_name 
SET column1 = value1, column2 = value2, ...;
```

### ⚡ `INSERT INTO` select

The `INSERT INTO SELECT` statement is used to copy data from one table and insert it into another table. Or, to insert data into specific columns from another table.

```sql
INSERT INTO table_name1 (column1, column2, column3, ...)
SELECT column1, column2, column3, ...
FROM table_name2
WHERE condition;
```

> [!NOTE]
>  Be careful when inserting data into a database as SQL does not have a confirm command. So once you execute the insert statement, the records are inserted, and you can’t undo the operation.

[🔝 Back to top](#📍-overview)

---

## ⭐ `UPDATE`

The SQL `UPDATE` statement is used to modify the existing data in a database. This statement is very useful when you need to change the values assigned to specific fields in an existing row or set of rows.

The general syntax for the `UPDATE` statement is as follows:


```sql
UPDATE table_name
SET column1 = value1, column2 = value2, ...
WHERE condition;
```

`table_name`: The name of the table where an update will be performed.

`SET`: This clause specifies the column name and the new value that it should be updated to.

`column1`, `column2`, ...: The column names in the table.

`value1`, `value2`, ...: The new values that you want to record into the database.

`WHERE`: This clause specifies the conditions that identify which row(s) to update.

```sql
UPDATE Employees
SET Salary = 45000
WHERE EmployeeID = 3;
```

## ⭐ `DELETE`

The `DELETE` statement in SQL helps you remove existing records from a database. However, keep in mind, it is a destructive operation and may permanently erase data from your database.

### ⚡ 1. Delete All Rows:

The DELETE statement without a `WHERE` clause deletes all rows in a table. This operation is irreversible.

Example:

```SQL
DELETE FROM table_name;
```

This SQL statement deletes all the records from table_name.

### ⚡ 2. Delete Specific Rows:

When combined with the `WHERE` clause, the `DELETE` SQL statement erases specific rows that meet the condition.

Example:

```SQL
DELETE FROM table_name WHERE condition;
```

This instance of the `DELETE` statement deletes records from table_name the place where the given condition matches.

[🔝 Back to top](#📍-overview)

---

## ⭐ Data Definition Language

**Data Definition Language (DDL) is a subset of SQL (Structured Query Language) that is used to define and manage the structure of database objects, such as tables, indexes, and views. DDL commands are responsible for creating, modifying, and deleting database structures, and they do not manipulate the data itself.**

## ⭐ `CREATE TABLE`

The `CREATE TABLE` statement in SQL is a Data Definition Language (DDL) command used to create a new table in the database.

#### 💻 Syntax

```sql
CREATE TABLE table_name (
    column1 datatype constraints,
    column2 datatype constraints,
    ...
);
```

#### 💻 Example

```sql
CREATE TABLE Customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(50) NOT NULL,
    email VARCHAR(100)
);
```

---

## ⭐ `DROP TABLE`

The `DROP TABLE` statement is a Data Definition Language (DDL) operation that is used to completely remove a table from the database. This operation deletes the table structure along with all the data in it, effectively removing the table from the database system.

When you execute the `DROP TABLE` statement, it eliminates both the table and its data, as well as any associated indexes, constraints, and triggers. Unlike the `TRUNCATE TABLE` statement, which only removes data but keeps the table structure, `DROP TABLE` removes everything associated with the table.

#### 💻 Syntax

```sql
DROP TABLE table_name
```

### 📝 Considerations

* **Irreversible Action**: Unlike `DELETE` and `TRUNCATE`, once a table is dropped, the action cannot be rolled back. Therefore, it should be used with extreme caution.

* **Cascading Effects**: Dropping a table that is referenced by a foreign key constraint will also drop that foreign key relationship. Similarly, any dependent objects like views, stored procedures, or functions that reference the table might be affected.

* **Permissions**: Ensure you have the appropriate permissions to drop the table. Typically, this requires `DROP` privilege on the table.

### 📝 Limitations

* **Foreign Key Constraints**: If the table is referenced by foreign keys from other tables, dropping it might require using `CASCADE` to also drop the dependent foreign keys.

* **Replication**: Tables published using transactional or merge replication should be carefully considered before dropping, as this can impact replication.

* **Dependent Objects**: Dropping a table will invalidate any dependent objects such as views, stored procedures, and functions that reference the table. Ensure these are handled appropriately.

---

## ⭐ `TRUNCATE TABLE`

`TRUNCATE TABLE` statement is used to delete all rows from a table efficiently. Unlike the DELETE statement, which removes rows one by one and generates a lot of undo logs, the `TRUNCATE TABLE` statement deallocates the data pages associated with the table, which can be much faster, especially for large tables.

#### 💻 syntax

```sql
TRUNCATE TABLE table_name;
```

---

## ⭐ `ALTER TABLE`

In MySQL, the `ALTER TABLE` statement is used to modify an existing table structure. It allows you to add, modify, or drop columns, change data types, add or remove indexes, rename the table, and perform various other alterations. Here's a breakdown of some common uses:

### ⚡  Adding a Column:
You can use `ALTER TABLE` to add a new column to an existing table:
```sql
ALTER TABLE table_name
ADD column_name datatype [constraints];
```

### ⚡ Modifying a Column:
You can modify the attributes of an existing column:
```sql
ALTER TABLE table_name
MODIFY column_name new_datatype [constraints];
```

### ⚡ Dropping a Column:
You can remove a column from a table:
```sql
ALTER TABLE table_name
DROP COLUMN column_name;
```

### ⚡Renaming a Table:
You can rename an existing table:
```sql
ALTER TABLE old_table_name
RENAME TO new_table_name;
```

### ⚡ Adding an Index:
You can add an index to a table:
```sql
ALTER TABLE table_name
ADD INDEX index_name (column_name);
```

### ⚡ Dropping an Index:
You can remove an index from a table:
```sql
ALTER TABLE table_name
DROP INDEX index_name;
```

### ⚡ Adding a Foreign Key Constraint:
You can add a foreign key constraint to enforce referential integrity:
```sql
ALTER TABLE table_name
ADD CONSTRAINT fk_constraint_name
FOREIGN KEY (column_name)
REFERENCES parent_table_name (parent_column_name);
```

### ⚡ Dropping a Foreign Key Constraint:
You can remove a foreign key constraint from a table:
```sql
ALTER TABLE table_name
DROP FOREIGN KEY fk_constraint_name;
```

### ⚡ Changing Column Order:
You can change the order of columns in a table (in MySQL, this is generally a visual change and doesn't affect the actual data):
```sql
ALTER TABLE table_name
MODIFY column_name datatype FIRST|AFTER other_column_name;
```

---

## ⭐ Data Manipulation Language

DML (Data Manipulation Language) in SQL is used to manage and manipulate the data stored in a database.

* **`SELECT`** – Retrieves data from the database.

* **`INSERT`** – Adds new records (rows) into a table.

* **`UPDATE`** – Modifies existing records in a table.

* **`DELETE`** – Removes records from a table.

## ⭐ `SELECT`

The `SELECT` statement is used to retrieve data from one or more tables in the database. 

```sql
SELECT * FROM Students
```

## ⭐ `UPDATE`

The `UPDATE` statement is used to modify existing records in a table. You can update specific columns based on conditions.

