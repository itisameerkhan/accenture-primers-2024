# FUNCTIONS 


### **Scalar Functions**

| **Category**         | **Function**                                                  | **Description**                                                                                       |
|----------------------|---------------------------------------------------------------|-------------------------------------------------------------------------------------------------------|
| **String Functions**  | `CONCAT(str1, str2, ...)`                                     | Concatenates two or more strings.                                                                      |
|                      | `LENGTH(str)`                                                 | Returns the length of the string in bytes.                                                             |
|                      | `CHAR_LENGTH(str)`                                            | Returns the length of the string in characters.                                                        |
|                      | `UPPER(str)` / `LOWER(str)`                                   | Converts the string to uppercase/lowercase.                                                            |
|                      | `SUBSTRING(str, start, length)`                               | Extracts a substring from a string.                                                                    |
|                      | `TRIM([LEADING|TRAILING|BOTH] chars FROM str)`                | Removes leading/trailing/both spaces or specified characters from a string.                            |
|                      | `REPLACE(str, from_str, to_str)`                              | Replaces occurrences of a substring with another string.                                               |
|                      | `INSTR(str, substr)`                                          | Returns the position of the first occurrence of a substring.                                           |
|                      | `LPAD(str, length, padstr)` / `RPAD(str, length, padstr)`     | Pads the string from the left or right with another string.                                            |
|                      | `REVERSE(str)`                                                | Reverses the characters in a string.                                                                   |
|                      | `FORMAT(number, decimal_places)`                              | Formats a number as a string with commas separating thousands.                                         |
|                      | `ASCII(str)`                                                  | Returns the ASCII value of the first character of the string.                                          |
| **Numeric Functions** | `ABS(number)`                                                 | Returns the absolute value of a number.                                                                |
|                      | `CEIL(number)` / `FLOOR(number)`                              | Rounds a number up or down to the nearest integer.                                                     |
|                      | `ROUND(number, decimal_places)`                               | Rounds a number to the specified number of decimal places.                                             |
|                      | `POWER(base, exponent)` / `EXP(exponent)`                     | Returns a number raised to a power or e raised to a power.                                             |
|                      | `SQRT(number)`                                                | Returns the square root of a number.                                                                   |
|                      | `MOD(number, divisor)`                                        | Returns the remainder of division of one number by another.                                            |
|                      | `SIGN(number)`                                                | Returns the sign of a number (-1 for negative, 0 for zero, 1 for positive).                            |
| **Date Functions**    | `CURDATE()` / `CURRENT_DATE()`                                | Returns the current date.                                                                              |
|                      | `CURTIME()` / `CURRENT_TIME()`                                | Returns the current time.                                                                              |
|                      | `NOW()` / `SYSDATE()`                                         | Returns the current date and time.                                                                     |
|                      | `DATE_ADD(date, INTERVAL expr unit)`                          | Adds a time interval to a date.                                                                        |
|                      | `DATE_SUB(date, INTERVAL expr unit)`                          | Subtracts a time interval from a date.                                                                 |
|                      | `DATEDIFF(date1, date2)`                                      | Returns the number of days between two dates.                                                          |
|                      | `DATE_FORMAT(date, format)`                                   | Formats a date according to a specified format.                                                        |
|                      | `DAY(date)` / `MONTH(date)` / `YEAR(date)`                    | Returns the day, month, or year from a date.                                                           |
|                      | `HOUR(time)` / `MINUTE(time)` / `SECOND(time)`                | Returns the hour, minute, or second from a time.                                                       |
| **Control Flow**      | `IF(condition, true_value, false_value)`                      | Returns one value if the condition is true, otherwise another value.                                   |
|                      | `IFNULL(expr1, expr2)`                                        | Returns the first expression if not NULL, otherwise returns the second expression.                     |
|                      | `NULLIF(expr1, expr2)`                                        | Returns NULL if the two expressions are equal, otherwise returns the first expression.                 |
| **Type Conversion**   | `CAST(expr AS type)`                                          | Converts an expression to a different data type.                                                       |
|                      | `CONVERT(expr, type)`                                         | Converts an expression to a different type or character set.                                           |

### **Aggregate Functions**

| **Function**           | **Description**                                                                                       |
|------------------------|-------------------------------------------------------------------------------------------------------|
| **`COUNT(expr)`**       | Returns the number of rows that match a condition or non-NULL values.                                 |
| **`SUM(expr)`**         | Returns the sum of non-NULL values in the expression.                                                 |
| **`AVG(expr)`**         | Returns the average of non-NULL values in the expression.                                             |
| **`MAX(expr)`**         | Returns the maximum value of the expression.                                                          |
| **`MIN(expr)`**         | Returns the minimum value of the expression.                                                          |
| **`GROUP_CONCAT(expr)`**| Concatenates non-NULL values from a group into a single string.                                       |
| **`STD(expr)`**         | Returns the population standard deviation.                                                            |
| **`STDDEV(expr)`**      | Returns the sample standard deviation of the expression.                                              |
| **`VAR_POP(expr)`**     | Returns the population variance of the expression.                                                    |
| **`VAR_SAMP(expr)`**    | Returns the sample variance of the expression.                                                        |

