select d.name as Department, 
e.name Employee , e.salary Salary
from Employee e 
join Department d on 
e.departmentId = d.id
where(
    select count(distinct e2.salary)
    from Employee e2
    where e2.departmentId = e.departmentId
    and e2.salary > e.salary
) < 3;