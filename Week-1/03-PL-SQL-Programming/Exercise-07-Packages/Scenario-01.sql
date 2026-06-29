CREATE OR REPLACE PACKAGE CustomerManagement AS

PROCEDURE AddCustomer(
id NUMBER,
name VARCHAR2,
dob DATE,
balance NUMBER);

PROCEDURE UpdateCustomer(
id NUMBER,
name VARCHAR2);

FUNCTION GetCustomerBalance(
id NUMBER)
RETURN NUMBER;

END CustomerManagement;
/