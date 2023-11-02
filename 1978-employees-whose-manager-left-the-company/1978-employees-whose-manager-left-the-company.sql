# Write your MySQL query statement below
SELECT employee_id FROM Employees
WHERE SALARY<30000 AND manager_id NOT IN
(SELECT e.manager_id FROM Employees AS e
JOIN Employees AS m
ON e.manager_id = m.employee_id)
ORDER BY employee_id;