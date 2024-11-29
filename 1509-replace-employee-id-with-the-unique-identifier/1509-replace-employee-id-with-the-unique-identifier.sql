# Write your MySQL query statement below
SELECT EmployeeUNI.unique_id AS unique_id, Employees.name AS name
FROM EmployeeUNI
RIGHT JOIN Employees
ON EmployeeUNI.id=Employees.id;