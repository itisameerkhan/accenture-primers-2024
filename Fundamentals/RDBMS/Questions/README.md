# 📍 Questions


#### 💻 1. How to add extra colums in existing table

```sql
CREATE TABLE students (
    roll_number INT,
    name VARCHAR(50)
);

ALTER TABLE students
ADD phone_number BIGINT
```

#### 💻 2. How to add Primary key in existing column in table

```sql
CREATE TABLE students (
    roll_number INT,
    name VARCHAR(50)
);

ALTER TABLE students
ADD CONSTRAINT roll_number PRIMARY KEY (roll_number);
```

#### 💻 3. How to add multiple PRIMARY KEY in existing column in table

```sql

CREATE TABLE employee (
	id1 INT,
    id2 INT,
    id3 INT
);

ALTER TABLE employee
ADD CONSTRAINT id_primary_key PRIMARY KEY (id1, id2, id3);
``` 

#### 💻 4. How to change data type of existing column in table

```sql
CREATE TABLE employee (
	id1 INT,
    id2 INT,
    id3 INT
);

ALTER TABLE employee
MODIFY id3 VARCHAR(30);
```

#### 💻 Delete entire column in existing table 

```sql
CREATE TABLE employee (
	id1 INT,
    id2 INT,
    id3 INT
);

ALTER TABLE employee
DROP COLUMN id3;
```


#### 💻 How to add date column in existing table 

```sql
ALTER TABLE Customer 
ADD order_date DATE DEFAULT "2023-06-22";
```

---

#### 💻 How to DELETE particular records in Table

```sql
DELETE FROM Customer
WHERE customer_id = 9;
```

---

#### 💻 How to remove entire column in table

```sql
ALTER TABLE Customer 
DROP COLUMN joining_date;
```

#### 💻 How to remove entire data from table not the column

```sql
UPDATE Customer
SET account_verified = NULL;
```

#### 💻 `AUTO_INCREMENT` starts from 1000 ?

```sql
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50),
    email VARCHAR(100)
) AUTO_INCREMENT=1000;
```

#### 💻 Changing Column Name 

```sql
ALTER TABLE Student 
CHANGE student_name studentName VARCHAR(20);
```

#### 💻 rename table name 

```sql
RENAME TABLE Student TO StudentDetails;
```

#### 💻 How to add `NOT NULL` in existing table

```sql
ALTER TABLE Student 
MODIFY COLUMN name VARCHAR(20) NOT NULL;
```

