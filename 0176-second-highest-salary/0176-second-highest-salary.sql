# Write your MySQL query statement below
SELECT MAX(salary) AS SecondHighestSalary
FROM (
    SELECT salary
    FROM Employee
    HAVING salary!= (SELECT MAX(salary) FROM Employee)
) AS unique_numbers;