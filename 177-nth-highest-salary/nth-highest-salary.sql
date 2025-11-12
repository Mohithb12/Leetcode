CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  
      # Write your MySQL query statement below.
    SET n = n-1 ;
    return(
        select distinct salary 
        from Employee
        order by salary desc
        limit 1 OFFSET n


  );
END