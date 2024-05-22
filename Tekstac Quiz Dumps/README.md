### 1 .What is the approach of OO ?

Select one:

a. bundle data only for security

b. bundle method seperated from data

c. bundle data seperated from method

**`d. bundle data and method`**

---

### 2. How do we change the state of an object ?

Select one:

`a. Using object's behavior`

b. Using object's property

c. Using Object's default methods

d. Using class name


---

### 3. Select the benets of OOP ?

Select one or more:

`a. Ease of design`

`b. Resuability`

c. code deployment

d. Testing

---

### 4. What denes the state of an object ?

Select one:

a. Using the class Id

b. Using the class identity

c. Using the behavior

`d. Using the value of the class properties`

---

### 5. How does the dierent section of an application communicate in
an OO approach ?

Select one:

a. Dierent sections of the application interact through le
system

b. Dierent sections of the application interact through
database

`c. The objects created during runtime by dierent sections of
the application interact through messages`

d. In OO approach, the diferent sections run in isolation so
they will NOT interact

---

### 6. Select the principle that best describes the given scenario. The wind is called a breeze if it is gentle. The wind is called a storm if it is harsh.

Select one:

`a. Polymorphism`

b. Abstraction

c. Typing

d. Aggregation

---

### 7. A program is said to be_______, if it optimizes the amount of memory and processing time.

Select one:

a. robust

b. documented

`c. efficient`

d. modular

---

### 8. Choose the correct option where waterfall model is not suited.
Select one:

`a. Projects with frequent changes`

b. Complex Projects (that has more number of functionalities)

c. Projects with stable requirements

d. Simple Projects (that has less number of functionalities)

---

### 9. In which of the given SDLC model, unclear requirements are considered?

Select one:

a. Spiral Model

b. Agile Model

`c. Prototyping Model`

d. Waterfall Model

---

### 10. After the development of online website for global pharmacy , it was found that there were interface errors in few of the modules. In which level of testing these errors would be identied.
Select one:

a. System Testing

b. Acceptance Testing

c. Unit Testing

`d. Integration Testing`

---

### 11. Identify the cardinality between Chapter and Book
Select one:

`a. m..1`

b. 0..0

c. 0..m

d. m..m

---

### 12. Software was developed for Global Marketing. Few changes that was earlier requested was already incorporated in the delivered software. Now the client does not want the changes and
requested for the previous release. Which of the below option
would facilitate developer to meet the client needs.
Select one:

a. Software Repository

`b. Software Conguration Management`

c. Software Control Management

d. Change Control Management

---

### 13. What does the below Unix command accomplish? $ vi sample
Select one:

a. delete a le named sample

b. edit le named sample

c. open le named sample

`d. open file if it exists else creates a new file`

---

### 14. Which of the following is not a feature of UNIX?
Select one:

`a. User friendly`

b. Multiuser

c. Multitasking

d. Portability

---

### 15. Which of the following layer acts as an interface between user and kernel ?
Select one:

a. System Calls

b. Kernel

`c. Shell`

d. Hardware

---

### 16. Which command in UNIX displays the list of all the users who have logged into the Unix server?

a. users

`b. Who`

c. Who am i

d. List users

---

### 17. What is the purpose of using -a option with ls command ?

`a. for showing hidden files`

b. for showing executables

c. for multi columnar output

d. for showing directories

---

### 18. Comment in XML document is given by

a. <!-- --!>

b. <?-- -->

c. </-- -- >

`d. <!-- -->`

---

### 19. Which is not true about XML

`a. XML Tags are not Case Sensitive`

b. XML Elements Must be Properly Nested

c. All XML Elements Must Have a Closing Tag

d. XML must be wellformed

---

### 20. Which of the following fragments of XML are well-formed
Select one:

a. `<?xml version="1.0"?>` ✅

b. `<?xml encoding="Master"?>`

c. `<?xml encoding="JIS" version="File1"?>`

d. `<?xml?>`


### 21. Find out the well-formed xml file
Select one:

a. `<book category="Web">
<bname>XML Tutorials</bname>
<pages>100</pages>
<price>$300.00</price>
</book>` ✅


b. `<book category="Web">
<bname>XML Tutorials</BNAME>
<pages>100</pages>
<price>$300.00<price>
<book>`

c. `<book category=Web>
<bname>XML Tutorials</bname>
<pages>100</pages>
<price>$300.00</price>
</book>`

d. `<book category="Web">
<bname>XML Tutorials</bname>
<pages>100</pages>
<price>$300.00</Price>
</book>`

---

### 22. Which of the following statement/s is/are TRUE?

(1) Abstract method can have body

(2) Abstract class cannot be instantiated

(3) Abstract class can have constructor

Choose the most appropriate option.
Select one:

The correct answer is: Both (2) and (3) are TRUE

a. Both (1) and (2) are TRUE

`b. Both (2) and (3) are TRUE`

c. Both (1) and (3) are TRUE

d. Only (2) is TRUE

---


### 23. Identify the appropriate relationship between the classes House and Room. Assume that getter and setter methods for all instance variables are implemented

```java
class Room
{
private int length;
private float width;
}
class House
{
private float area;
private Room room;
public House()
{
room=new Room();
}
}
```

Choose the most appropriate option
Select one:

a. No relationship exists between class House and class Room

b. Aggregation

c. Specialization

`d. Composition`

---

### 24. What will be the output of the following Java code?
```java
public class ApplicationTester
{
public static void main(String[] args)
{
String s1 = "One";
String s2 = "One";
System.out.println((s1==s2) + " " + s1.equals(s2));
}
}
```

Choose the most appropriate option.
Select one:

a. false true

`b. true true`

c. true false

d. false false

<details>
<summary>Explanation</summary>
<p>
In Java, the expression s1 == s2 and the method call s1.equals(s2) both evaluate the equality of two strings, but they do so in different ways. Let's break down why s1 == s2 can be true even though it compares the memory addresses (or references) of the two strings.

String Interning in Java
Java has a concept called "string interning". When you create a string literal, Java automatically interns it, meaning that it maintains a pool of unique string instances. If you create a new string literal that is identical to an existing one, Java does not create a new instance; instead, it references the existing interned string.

s1 and s2 are string literals with the same value, they share the same memory address due to the string interning mechanism in Java. This is why the expression s1 == s2 evaluates to true.
</p>
</details>


---

### 25. What will be the output of the following Java code?

```java
public class OverloadTester {
    public static void main(String[] args) {
        double result = new OverloadTester().add(25, 35);
        System.out.println("Sum is " + result);
    }

    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public double add(int number1, int number2) {
        return number1 + number2;
    }
}
```

Choose the most appropriate option.
Select one:

a. Sum is 60

`b. Compilation Error: Duplicate method add(int, int) in type
OverloadTester`

c. Sum is 60.0

d. Sum is 0

<details>
<summary>Explanation</summary>
<p>
When the compiler encounters a call to `add(25, 35)`, it cannot distinguish between the two add methods based solely on the parameters since both methods have the same parameter list. Java requires method signatures to be unique in terms of the number and type of parameters, not the return type.
</p>
</details>


---


### 26. What is the output expected for the below code ?

```java
public class ConstructorTest {
    private ConstructorTest(int w) {
        System.out.println(w);
    }

    // Remove the static keyword to make it a valid constructor
    public static ConstructorTest() {
        System.out.println(10);
    }

    public static void main(String[] args) {
        ConstructorTest obj = new ConstructorTest(50); // This will call the private constructor and print 50
    }
}
```

Choose most appropriate option.
Select one:


`a. Won't compile because of line (6) constructor can't be static`

b. 50

c. 10 50

d. 10

---