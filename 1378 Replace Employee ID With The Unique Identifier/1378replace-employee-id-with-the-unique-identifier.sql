SELECT unique_id,name
FROM Employees as s
LEFT JOIN EmployeeUNI as c
ON s.id = c.id;
