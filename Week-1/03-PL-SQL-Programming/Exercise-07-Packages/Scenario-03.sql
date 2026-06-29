CREATE OR REPLACE PACKAGE AccountOperations AS

PROCEDURE OpenAccount(
id NUMBER,
customer NUMBER,
balance NUMBER);

PROCEDURE CloseAccount(
id NUMBER);

FUNCTION TotalBalance(
customer NUMBER)
RETURN NUMBER;

END AccountOperations;
/