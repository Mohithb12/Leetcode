# Write your MySQL query statement below
select name,bonus from Employee e
Left join Bonus b on e.empId = b.empId
where bonus < 1000 or bonus is null; 