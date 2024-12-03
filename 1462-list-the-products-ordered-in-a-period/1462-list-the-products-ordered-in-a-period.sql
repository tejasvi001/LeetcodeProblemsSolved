# Write your MySQL query statement below
SELECT p.product_name, sum(o.unit) AS unit
FROM Products p 
JOIN Orders o
on p.product_id=o.product_id
WHERE o.order_date BETWEEN '2020-02-01' And '2020-02-29' 
GROUP BY p.product_name
HAVING sum(o.unit)>=100;