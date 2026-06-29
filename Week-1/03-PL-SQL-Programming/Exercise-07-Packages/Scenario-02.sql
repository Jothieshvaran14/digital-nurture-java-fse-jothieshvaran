CREATE OR REPLACE PACKAGE EmployeeManagement AS

PROCEDURE HireEmployee(
id NUMBER,
name VARCHAR2,
salary NUMBER);

PROCEDURE UpdateEmployee(
id NUMBER,
salary NUMBER);

FUNCTION AnnualSalary(
id NUMBER)
RETURN NUMBER;

END EmployeeManagement;
/