DECLARE

CURSOR ApplyAnnualFee IS
SELECT AccountID
FROM Accounts;

BEGIN

FOR acc IN ApplyAnnualFee LOOP

UPDATE Accounts
SET Balance=Balance-100
WHERE AccountID=acc.AccountID;

END LOOP;

COMMIT;

END;
/