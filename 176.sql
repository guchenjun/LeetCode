# IFNULL是mysql语法；但这里如果只有两行数据，第一和第二相同则结果错误（应当返回NULL）
# select IFNULL((select Salary from Employee order by Salary desc limit 1, 1), NULL) as SecondHighestSalary;

select max(Salary) as SecondHighestSalary from Employee 
where Salary < (select max(Salary) from Employee);