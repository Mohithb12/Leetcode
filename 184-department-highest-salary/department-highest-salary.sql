select d.name as Department , e.name as Employee , e.salary as Salary
from Employee e join
Department d on e.departmentId = d.id 
where e.salary = (
    SELECT max(salary)
    from employee
    where departmentId = e.departmentId
);

