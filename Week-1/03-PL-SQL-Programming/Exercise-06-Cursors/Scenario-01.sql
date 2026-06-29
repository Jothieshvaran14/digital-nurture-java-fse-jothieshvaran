SET SERVEROUTPUT ON;

DECLARE

CURSOR GenerateMonthlyStatements IS
SELECT *
FROM Transactions
WHERE EXTRACT(MONTH FROM TransactionDate)=EXTRACT(MONTH FROM SYSDATE);

t Transactions%ROWTYPE;

BEGIN

OPEN GenerateMonthlyStatements;

LOOP

FETCH GenerateMonthlyStatements INTO t;

EXIT WHEN GenerateMonthlyStatements%NOTFOUND;

DBMS_OUTPUT.PUT_LINE(
t.TransactionID||' '||
t.AccountID||' '||
t.Amount);

END LOOP;

CLOSE GenerateMonthlyStatements;

END;
/