# 📍 Overview

| S.no. | Contents |
| --- | --- |
| 1. | [Introduction](#⭐-introduction) |
| 2. | [Relational Database](#⭐-relational-database) |
| 3. | [SQL vs NoSQL](#⭐-sql-vs-nosql)
| 4. | [SQL Keywords](#⭐-sql-keywords)

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