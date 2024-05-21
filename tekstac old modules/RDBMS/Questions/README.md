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