CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  
      # Write your MySQL query statement below.
    set n = n-1;
    return(

    select distinct salary
    from Employee
    order by salary desc
    limit 1 offset n
    
  );
END