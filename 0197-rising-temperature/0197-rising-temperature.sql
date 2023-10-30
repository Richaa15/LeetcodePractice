# Write your MySQL query statement below
SELECT w.id AS Id 
FROM Weather AS w
JOIN Weather AS r
ON DATEDIFF(w.recordDate, r.recordDate) = 1
AND w.temperature > r.temperature;