# Write your MySQL query statement below
SELECT u.employee_id, u.name, COUNT(e.employee_id) AS reports_count, ROUND(AVG(e.age)) AS average_age
FROM Employees as e
JOIN Employees as u
ON e.reports_to = u.employee_id
GROUP BY employee_id 
ORDER BY employee_id;


