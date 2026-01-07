# Write your MySQL query statement below
select e.name 
from Employee e
join Employee f on e.id = f.managerId 
group by f.managerId
having count(f.managerId) >= 5;