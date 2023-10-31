# Write your MySQL query statement below
SELECT MAX(num) AS num FROM
(SELECT NUM FROM MyNumbers
    GROUP BY num 
HAVING COUNT(num) = 1) AS u;