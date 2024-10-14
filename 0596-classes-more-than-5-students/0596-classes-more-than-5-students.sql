# Write your MySQL query statement below
SELECT class 
FROM COURSES 
GROUP BY class
HAVING count(class)>4;